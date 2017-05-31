package model;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Order_Screen2 extends Frame{
	private Button[] menu;
	private Button order;
	private Label[] menu_name;
	private SpinnerNumberModel sm1, sm2, sm3, sm4, sm5;
	private JSpinner js1, js2, js3, js4, js5;
	private int menu_number = 5;
	
	
	Order_Screen2(){
		super("주문화면");
		
		menu = new Button[menu_number];
		menu_name = new Label[menu_number];
		
		menu[0] = new Button("갈비탕  7000");
		menu[1] = new Button("정식  5000");
		menu[2] = new Button("순대국밥  8000");
		menu[3] = new Button("불고기  6000");
		menu[4] = new Button("제육볶음  7000");
		
		menu_name[0] = new Label("갈비탕  7000 : ");
		menu_name[1] = new Label("정식  5000 : ");
		menu_name[2] = new Label("순대국밥  8000 : ");
		menu_name[3] = new Label("불고기  6000 : ");
		menu_name[4] = new Label("제육볶음  7000 : ");

		for (int i=0; i<menu_number; i++){
			menu[i].setBounds(50 + 100 + (i%5)*110, 50 +  (i/5)*110, 100, 100);
			add(menu[i]);
			
			menu_name[i].setBounds(50, 300 + 40*i, 90, 30);
			add(menu_name[i]);
		}
		
		order = new Button("주문완료");
		order.setBounds(600, 400, 100, 100);
		add(order);
		
		//증감 화살표
		sm1 = new SpinnerNumberModel(0,0,20,1); // SpinnerNumberModel(initial number, min, max , step)  초기값0, 최소0, 최대 20, 1씩 증감
		js1 = new JSpinner(sm1);
		js1.setBounds(140, 305, 50, 20);
		add(js1);
		
		sm2 = new SpinnerNumberModel(0,0,20,1);
		js2 = new JSpinner(sm2);
		js2.setBounds(140, 345, 50, 20);
		add(js2);
		
		sm3 = new SpinnerNumberModel(0,0,20,1);
		js3 = new JSpinner(sm3);
		js3.setBounds(140, 385, 50, 20);
		add(js3);
		
		sm4 = new SpinnerNumberModel(0,0,20,1);
		js4 = new JSpinner(sm4);
		js4.setBounds(140, 425, 50, 20);
		add(js4);
		
		sm5 = new SpinnerNumberModel(0,0,20,1);
		js5 = new JSpinner(sm5);
		js5.setBounds(140, 465, 50, 20);
		add(js5);
		
		
		setSize(1000, 600);
		setLayout(null);
		setVisible(true);
		
		WindowAdapter WA = new WindowAdapter(){
			public void windowClosing(WindowEvent windowevent){
				System.exit(0);
			}
		};
		addWindowListener(WA);
	}
	
	public static void main(String args[]){
		Order_Screen2 OS2 = new Order_Screen2();
	}
}
