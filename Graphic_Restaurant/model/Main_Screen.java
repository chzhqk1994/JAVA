package model;

import java.awt.*;
import java.awt.event.*;

public class Main_Screen extends Frame{
	private Button[] 버튼;
	private int button_number = 9;
	
	Main_Screen(){
		버튼 = new Button[button_number];
		
		버튼[0] = new Button("주문");
		버튼[1] = new Button("차림표 경신");
		버튼[2] = new Button("매출보고서");
		버튼[3] = new Button("지출보고서");
		버튼[4] = new Button("예약 관리");
		버튼[5] = new Button("대기자 관리");
		버튼[6] = new Button("회원관리");
		버튼[7] = new Button("할인설정");
		버튼[8] = new Button("재고관리");
		
		for (int i=0; i<button_number; i++){
			버튼[i].setBounds(50 + 100 + (i % 3) *110, 50 +  110 * (i / 3), 100, 100);
			add(버튼[i]);
		}

		setSize(600, 500);
		setLayout(null);
		setVisible(true);
		
		WindowAdapter WA = new WindowAdapter(){
			public void windowClosing(WindowEvent windowEvent){
				System.exit(0);
			}
		};
		addWindowListener(WA);
	}
	
	public static void main(String args[]){
		Main_Screen MS = new Main_Screen();
	}
	
}
