package 성적처리;

import java.awt.*;
import java.awt.event.*;

public class 출력화면_기말 extends Frame implements ActionListener {
   private final int 줄수 = 15;
   private Label [] 학번표시, 이름표시, 중간표시, 기말표시, 출석표시, 과제표시, 총계표시, 학점표시;
   private int 총점 [];
   private 계산클래스_기말 총점구하기;
   
   출력화면_기말 (TextField [] 학번txt, TextField [] 이름txt, TextField [] 중간txt, TextField [] 기말txt, TextField [] 출석txt, TextField [] 과제txt, String 중간비율, String 기말비율, String 출석비율, String 과제비율,
		   TextField Aplus, TextField Azero, TextField Aminor, TextField Bplus, TextField Bzero, TextField Bminor, TextField Cplus, TextField Czero, TextField Cminor, TextField Dplus, TextField Dzero, TextField Dminor){
	  
	  super ("성적출력");
      int i, x, y;
				
      Label 학번라벨 = new Label ("학   번", Label.CENTER);
      Label 이름라벨 = new Label ("이   름", Label.CENTER);
      Label 중간라벨 = new Label ("중   간", Label.CENTER);
      Label 기말라벨 = new Label ("기   말", Label.CENTER);
      Label 출석라벨 = new Label ("출   석", Label.CENTER);
      Label 과제라벨 = new Label ("과   제", Label.CENTER);
      Label 총계라벨 = new Label ("총   계", Label.CENTER);
      Label 학점라벨 = new Label ("학   점", Label.CENTER);
				
      학번표시 = new Label [줄수]; 
      이름표시 = new Label [줄수];
      중간표시 = new Label [줄수];  
      기말표시 = new Label [줄수];
      출석표시 = new Label [줄수];
      과제표시 = new Label [줄수];
      총계표시 = new Label [줄수]; 
      학점표시 = new Label [줄수];

      for (i = 0; i < 줄수; i++) {
         학번표시 [i] = new Label ();
         이름표시 [i] = new Label ();
         중간표시 [i] = new Label ();
         기말표시 [i] = new Label ();
         출석표시 [i] = new Label ();
         과제표시 [i] = new Label ();
         총계표시 [i] = new Label ();
         학점표시 [i] = new Label ();
      }
      
      Button 확인단추 = new Button ("확인완료");
      확인단추.addActionListener (this);

      setLayout (null);
      학번라벨.setBounds ( 10, 30, 50, 30); 
      이름라벨.setBounds ( 70, 30, 50, 30);
      중간라벨.setBounds (130, 30, 50, 30); 
      기말라벨.setBounds (190, 30, 50, 30);
      출석라벨.setBounds (250, 30, 50, 30);
      과제라벨.setBounds (310, 30, 50, 30);
      총계라벨.setBounds (370, 30, 50, 30);
      학점라벨.setBounds (440, 30, 50, 30);
				
      x = 10;  y = 70;
      for (i = 0; i < 줄수; i++) {
         학번표시 [i].setBounds (x, y, 50, 20);       
         이름표시 [i].setBounds (x + 60, y, 50, 20);
         중간표시 [i].setBounds (x + 120, y, 30, 20); 
         기말표시 [i].setBounds (x + 190, y, 30, 20);
         출석표시 [i].setBounds (x + 250, y, 30, 20);  
         과제표시 [i].setBounds (x + 310, y, 30, 20);
         총계표시 [i].setBounds (x + 370, y, 30, 20);
         학점표시 [i].setBounds (x + 440, y, 30, 20);
         y = y + 25;
      }
      확인단추.setBounds (220, 450, 60, 25);
      
      // 입력창에서 받은 값들을 출력해주는 코드
      for (i =0; i < 줄수; i++){
    	  학번표시 [i].setText (학번txt [i].getText ());
    	  이름표시 [i].setText (이름txt [i].getText ());
    	  중간표시 [i].setText (중간txt [i].getText ());
    	  기말표시 [i].setText (기말txt [i].getText ());
    	  출석표시 [i].setText (출석txt [i].getText ());
    	  과제표시 [i].setText (과제txt [i].getText ());
      }
      
      // 각 점수와 반영비율을 계산하여 총액을 출력
      int 계산 = 0;
      총점 = new int [줄수];
      총점구하기 = new 계산클래스_기말 ();
      
      for (i = 0; i < 줄수; i++){

    	 계산 = 총점구하기.총점계산 (학번txt [i], 이름txt [i], 중간txt [i], 기말txt [i], 출석txt [i], 과제txt [i], 중간비율, 기말비율, 출석비율, 과제비율);

    	  총점 [i] = 계산; // String 형 배열인 총점에 문자열로 변환된 총계를 저장

    	  String 총계문자열 = Integer.toString (계산); //int형인 "총계" 를 String 형으로 바꿔줌    	  
    	  총계표시 [i].setText (총계문자열);  // 최종 결과를 화면에 표시
      }
      
      // 총액을 기준으로 학점 계산
      String 학점;
      for (i = 0; i < 줄수; i++){
    	  학점 = 총점구하기.학점계산 (총점 [i], Aplus.getText (), Azero.getText (), Aminor.getText (), Bplus.getText (), Bzero.getText (), Bminor.getText (), Cplus.getText (), Czero.getText (), Cminor.getText (), Dplus.getText (), Dzero.getText (), Dminor.getText ());
    	 
    	  학점표시 [i].setText (학점); // 계산된 학점을 Label로 출력화면에 표시
      }
      
      
      add (학번라벨);  
      add (이름라벨);
      add (중간라벨);  
      add (기말라벨);
      add (출석라벨); 
      add (과제라벨);
      add (총계라벨);  
      add (학점라벨);

      for (i = 0; i < 줄수; i++) {
         add (학번표시 [i]); 
         add (이름표시 [i]);  
         add (중간표시 [i]);
         add (기말표시 [i]);  
         add (출석표시 [i]); 
         add (과제표시 [i]);
         add (총계표시 [i]);
         add (학점표시 [i]);
      }
      add (확인단추);
				
      addWindowListener (new WindowAdapter () {
         public void windowClosing (WindowEvent we) {
            dispose ();
         }
      });
      
      setSize     (600, 500);
      setLocation (400, 400);
      setResizable(false);
      setVisible  (true);
   }
   
			
   public void actionPerformed (ActionEvent e) {
	   setVisible (false);
   }

}