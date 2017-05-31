package model;

import java.awt.*;
import java.awt.event.*;

public class Order_Screen extends Frame{
	Button[] table;
	private int table_number = 15;

	Order_Screen(){
		super("주문화면 - 테이블선택");
		table = new Button[table_number];
		
		for (int i=0; i<table_number; i++){
			String str = (i+1) + "번 테이블";
			table[i] = new Button(str);
			table[i].setBounds(50 + 100 + (i%5)*110, 50 +  110*(i/5), 100, 100);
			add(table[i]);
		}
		
		setSize(1000, 1000);
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
		Order_Screen OS = new Order_Screen();
	}
}
