package model;

import java.awt.*;
import java.awt.event.*;

public class Discount_Screen extends Frame{
	Button B_menu, B_season, B_amount;
	TextArea T_menu, T_season, T_amount;
	
	Discount_Screen(){
		super("할인관리");
		
		B_menu = new Button("메뉴별 할인");
		B_menu.setBounds(400, 100, 100, 70);
		T_menu = new TextArea();
		T_menu.setBounds(100, 100, 150, 60);
		
		B_season = new Button("기간별 할인");
		B_season.setBounds(400, 200, 100, 70);
		T_season = new TextArea();
		T_season.setBounds(100, 200, 150, 60);
		
		
		B_amount = new Button("총액별 할인");
		B_amount.setBounds(400, 300, 100, 70);
		T_amount = new TextArea();
		T_amount.setBounds(100, 300, 150, 60);
		
		
		add(B_menu);
		add(B_season);
		add(B_amount);
		add(T_menu);
		add(T_season);
		add(T_amount);
		
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
		Discount_Screen ds = new Discount_Screen();
	}
	
}
