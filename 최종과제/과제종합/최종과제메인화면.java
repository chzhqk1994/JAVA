package 과제종합;


import java.awt.*;
import java.awt.event.*;

import 첫번째과제.*;
import 두번째과제.*;
import 세번째과제.*;
import 네번째과제.*;
import 다섯번째과제.*;
import 식당관리프로그램과제.*;

class 최종과제메인화면 extends Frame implements ActionListener{
	private MenuBar 메뉴바;
	private Menu 메뉴;
	private Menu i1, i2, i3, i4, i5, i6;
	private MenuItem i1_1, i2_1, i2_2, i3_1, i3_2, i4_1, i4_2, i5_1, i6_1;
	private Label 문구;
	
	private 첫번째과제 첫번째;
	private 메인2_1 두번째_1;
	private 메인2_2 두번째_2;
	private 메인3_1 세번째_1;
	private 메인3_2 세번째_2;
	private 메인4_1 네번째_1;
	private 메인4_2 네번째_2;
	private 메인5 다섯번째;
	private 메인6 여섯번째;
	
	최종과제메인화면 (){  
		super("2013108193 송현우 종합과제");
		메뉴바=new MenuBar ();  
		
		메뉴 = new Menu ("객제지향프로그래밍 과제");  
		
		i1=new Menu ("1차 과제 ");
		i1_1 = new MenuItem ("200원,300원,500원으로 10000원을 만들 수 있는 경우를 출력하시오");
		i1_1.addActionListener (this);
		i1.add (i1_1);
		
		i2 = new Menu ("2차 과제");
		i2_1 = new MenuItem ("3개의 수를 입력받아 가장 큰 값과 두번째로 큰 값을 출력하는 프로그램");
		i2_1.addActionListener (this);
		i2_2 = new MenuItem ("2개의 수를 입력받아 사칙연산을 하고 큰 수를 출력하는 프로그램");
		i2_2.addActionListener (this);
		i2.add (i2_1);
		i2.add (i2_2);
		
		i3=new Menu ("3차 과제 ");
		i3_1 = new MenuItem ("낫띵");
		i3_1.addActionListener (this);
		i3.add (i3_1);
		
		i4=new Menu ("4차 과제");  
		i4_1 = new MenuItem ("계산기 프로그램");
		i4_1.addActionListener (this);
		i4_2 = new MenuItem ("식당 프로그램");
		i4_2.addActionListener (this);
		i4.add (i4_1);
		i4.add (i4_2);
		
		i5 = new Menu ("5차 과제 ");
		i5_1 = new MenuItem ("배열을 이용하여 숫자들의 합, 제일 큰 수, 홀수와 짝수의 가수, 큰 순으로 출력하시오");
		i5_1.addActionListener (this);
		i5.add (i5_1);
		
		i6 = new Menu ("6 ~ 10차 과제 ");
		i6_1 = new MenuItem ("GUI를 이용하여 음식점 주문프로그램 주문화면과 테이블관리화면, 할인관리 화면을 만드시오");
		i6_1.addActionListener (this);
		i6.add (i6_1);
		
		메뉴.add (i1);  
		메뉴.add (i2);  
		메뉴.add (i3);  
		메뉴.add (i4);  
		메뉴.add (i5);  
		메뉴.add (i6);  
		
		메뉴바.add (메뉴);  
		setMenuBar (메뉴바); 
		
		문구 = new Label ("프레임이 없는 프로그램 (1~5차 과제) 들은 콘솔창에 나타납니다.");
		문구.setBounds (30, 100, 350, 30);
		add (문구);
		
		setSize (500,300);  
		setLayout (null);  
		setVisible (true);  
		
		addWindowListener (new WindowAdapter () {
			public void windowClosing (WindowEvent we) {
				dispose ();
			}
		});
	}  
	
	@Override
	public void actionPerformed (ActionEvent e) {
		// TODO Auto-generated method stub
		if (i1_1 == e.getSource ()){
			첫번째 = new 첫번째과제 ();
			첫번째.main (null);
		}
		
		else if (i2_1 == e.getSource ()){
			두번째_1 = new 메인2_1 ();
			두번째_1.main (null);
		}
		
		else if (i2_2 == e.getSource ()){
			두번째_2 = new 메인2_2 ();
			두번째_2.main (null);
		}
		
		else if (i3_1 == e.getSource ()){
			세번째_1 = new 메인3_1 ();
			세번째_1.main (null);
		}
		
		else if (i3_2 == e.getSource()){
			세번째_2 = new 메인3_2 ();
			세번째_2.main (null);
		}
		
		else if (i4_1 == e.getSource ()){
			네번째_1 = new 메인4_1 ();
			네번째_1.main (null);
		}
		
		else if (i4_2 == e.getSource ()){
			네번째_2 = new 메인4_2 ();
			네번째_2.main (null);
		}
		
		else if (i5_1 == e.getSource ()){
			다섯번째 = new 메인5 ();
			다섯번째.main (null);
		}
		
		else if (i6_1 == e.getSource ()){
			여섯번째 = new 메인6 ();
		}
			
		addWindowListener (new WindowAdapter () {
	         public void windowClosing (WindowEvent we) {
	            dispose ();
	         }
		});
	}  
	
	public static void main(String args [])  
	{  
		new 최종과제메인화면 ();  
	}
}  