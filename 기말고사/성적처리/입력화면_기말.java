// 3:19 PM

package 성적처리;

import java.awt.*;
import java.awt.event.*;

public class 입력화면_기말 extends Frame implements ActionListener {
	
	private final int 줄수 = 15;
	private TextField [] 학번txt, 이름txt, 중간txt, 기말txt, 출석txt, 과제txt;
	private TextField 중간비율, 기말비율, 출석비율, 과제비율;
	private Label 중간비율라벨, 기말비율라벨, 출석비율라벨, 과제비율라벨;
	public TextField Aplus, Azero, Aminor, Bplus, Bzero, Bminor, Cplus, Czero, Cminor, Dplus, Dzero, Dminor;
	private Label 에이쁠, 에이제로, 에이마이너, 비쁠, 비제로, 비마이너, 씨쁠, 씨제로, 씨마이너, 디쁠, 디제로, 디마이너, 중간고사라벨, 기말고사라벨, 출석라벨, 과제라벨;
	
	public 입력화면_기말 () {
	      super ("성적자료 입력");
	      int i, x, y;
					
	      Label 학번라벨 = new Label ("학   번", Label.CENTER);
	      Label 이름라벨 = new Label ("이   름", Label.CENTER);
	      Label 중간라벨 = new Label ("중   간", Label.CENTER);
	      Label 기말라벨 = new Label ("기   말", Label.CENTER);
	      Label 출석라벨 = new Label ("출   석", Label.CENTER);
	      Label 과제라벨 = new Label ("과   제", Label.CENTER);
					
	      학번txt = new TextField [줄수];  
	      이름txt = new TextField [줄수];
	      중간txt = new TextField [줄수];  
	      기말txt = new TextField [줄수];
	      출석txt = new TextField [줄수];  
	      과제txt = new TextField [줄수];

	      for (i = 0; i < 줄수; i++) {
	         학번txt [i] = new TextField (3);  
	         이름txt [i] = new TextField (4);
	         중간txt [i] = new TextField (2);  
	         기말txt [i] = new TextField (2);
	         출석txt [i] = new TextField (2);  
	         과제txt [i] = new TextField (2);
	      }

	      setLayout (null);
	      학번라벨.setBounds ( 10, 30, 50, 30);  
	      이름라벨.setBounds ( 70, 30, 50, 30);
	      중간라벨.setBounds (130, 30, 50, 30); 
	      기말라벨.setBounds (190, 30, 50, 30);
	      출석라벨.setBounds (250, 30, 50, 30);
	      과제라벨.setBounds (310, 30, 50, 30);
					
	      x = 10;  y = 70;
	      for (i = 0; i < 줄수; i++) {
	         학번txt [i].setBounds (x, y, 50, 20);       
	         이름txt [i].setBounds (x + 60, y, 50, 20);
	         중간txt [i].setBounds (x + 120, y, 30, 20); 
	         기말txt [i].setBounds (x + 190, y, 30, 20);
	         출석txt [i].setBounds (x + 250, y, 30, 20);  
	         과제txt [i].setBounds (x + 310, y, 30, 20);
	         y = y + 25;
	      }

	      add (학번라벨);
	      add (이름라벨);
	      add (중간라벨);  
	      add (기말라벨); 
	      add (출석라벨);  
	      add (과제라벨);
	      
	      for (i = 0; i < 줄수; i++) {
	         add (학번txt [i]);  
	         add (이름txt [i]);  
	         add (중간txt [i]);
	         add (기말txt [i]);  
	         add (출석txt [i]); 
	         add (과제txt [i]);
	      }
				
			에이쁠 = new Label ("A+");
			에이제로 = new Label ("A0");
			에이마이너 = new Label ("A-");
			비쁠 = new Label ("B+");
			비제로 = new Label ("B0");
			비마이너 = new Label ("B-");
			씨쁠 = new Label ("C+");
			씨제로 = new Label ("C0");
			씨마이너 = new Label ("C-");
			디쁠 = new Label ("D+");
			디제로 = new Label ("D0");
			디마이너 = new Label ("D-");
			
			에이쁠.setBounds (15, 500, 30, 18);
			에이제로.setBounds (15, 530, 30, 18);
			에이마이너.setBounds (15, 560, 30, 18);
			비쁠.setBounds (15, 590, 30, 18);
			비제로.setBounds (15, 620, 30, 18);
			비마이너.setBounds (15, 650, 30, 18);
			씨쁠.setBounds (200, 500, 30, 18);
			씨제로.setBounds (200, 530, 30, 18);
			씨마이너.setBounds (200, 560, 30, 18);
			디쁠.setBounds (200, 590, 30, 18);
			디제로.setBounds (200, 620, 30, 18);
			디마이너.setBounds (200, 650, 30, 18);
			
			add (에이쁠);
			add (에이제로);
			add (에이마이너);
			add (비쁠);
			add (비제로);
			add (비마이너);
			add (씨쁠);
			add (씨제로);
			add (씨마이너);
			add (디쁠);
			add (디제로);
			add (디마이너);
			
			Aplus = new TextField ();
			Azero = new TextField ();
			Aminor = new TextField ();
			Bplus = new TextField ();
			Bzero = new TextField ();
			Bminor = new TextField ();
			Cplus = new TextField ();
			Czero = new TextField ();
			Cminor = new TextField ();
			Dplus = new TextField ();
			Dzero = new TextField ();
			Dminor = new TextField ();
			
			Aplus.setBounds (50, 500, 30, 25);
			Azero.setBounds (50, 530, 30, 25);
			Aminor.setBounds (50, 560, 30, 25);
			Bplus.setBounds (50, 590, 30, 25);
			Bzero.setBounds (50, 620, 30, 25);
			Bminor.setBounds (50, 650, 30, 25);
			Cplus.setBounds (230, 500, 30, 25);
			Czero.setBounds (230, 530, 30, 25);
			Cminor.setBounds (230, 560, 30, 25);
			Dplus.setBounds (230, 590, 30, 25);
			Dzero.setBounds (230, 620, 30, 25);
			Dminor.setBounds (230, 650, 30, 25);
			
			add (Aplus);
			add (Azero);
			add (Aminor);
			add (Bplus);		
			add (Bzero);
			add (Bminor);
			add (Cplus);
			add (Czero);
			add (Cminor);
			add (Dplus);
			add (Dzero);
			add (Dminor);
	      
	      중간비율라벨 = new Label ("중간비율");
	      기말비율라벨 = new Label ("기말비율");
	      출석비율라벨 = new Label ("출석비율");
	      과제비율라벨 = new Label ("과제비율");
	      
	      중간비율라벨.setBounds (10, 700, 50, 30);
	      기말비율라벨.setBounds (80, 700, 50, 30);
	      출석비율라벨.setBounds (150, 700, 50, 30);
	      과제비율라벨.setBounds (220, 700, 50, 30);
	      
	      add (중간비율라벨);
	      add (기말비율라벨);
	      add (출석비율라벨);
	      add (과제비율라벨);

	      중간비율 = new TextField ();
	      기말비율 = new TextField ();
	      출석비율 = new TextField ();
	      과제비율 = new TextField ();
	      
	      중간비율.setBounds (10, 730, 50, 20);
	      기말비율.setBounds (80, 730, 50, 20);
	      출석비율.setBounds (150, 730, 50, 20);
	      과제비율.setBounds (220, 730, 50, 20);
	      
	      add (중간비율);
	      add (기말비율);
	      add (출석비율);
	      add (과제비율);
	      
	      Button 완료단추 = new Button ("입력완료");
	      완료단추.addActionListener (this);
	      완료단추.setBounds (300, 730, 60, 25);
	      add (완료단추);
	      
	      addWindowListener (new WindowAdapter () {
	         public void windowClosing (WindowEvent we) {
	            dispose ();
	         }
	      });
	   }

	@Override
	public void actionPerformed (ActionEvent arg0) {
		// TODO Auto-generated method stub
		출력화면_기말 output = new 출력화면_기말 (학번txt, 이름txt, 중간txt, 기말txt, 출석txt, 과제txt,
									중간비율.getText (), 기말비율.getText (), 출석비율.getText (), 과제비율.getText (),
									Aplus, Azero, Aminor, Bplus, Bzero, Bminor, Cplus, Czero, Cminor, Dplus, Dzero, Dminor);
	}

   public static void main (String [] args) {
      Frame f = new Frame ();
      입력화면_기말 c = new 입력화면_기말 ();
			      
      c.setSize      (400, 900);
      c.setResizable (false);
      c.setVisible   (true);
   }
}
