package model;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Order_Modify_Screen extends Frame{
	private Label[] menu_name;
	private Button 갱신, 할인, 적립, 계산;
	private SpinnerNumberModel sm1, sm2, sm3, sm4, sm5;
	private JSpinner js1, js2, js3, js4, js5;
	private int menu_number = 5;
	
	
	Order_Modify_Screen(){
		super("주문내역");
		
		menu_name = new Label[menu_number];
		
		menu_name[0] = new Label("갈비탕  7000 : ");
		menu_name[1] = new Label("정식  5000 : ");
		menu_name[2] = new Label("순대국밥  8000 : ");
		menu_name[3] = new Label("불고기  6000 : ");
		menu_name[4] = new Label("제육볶음  7000 : ");

		for (int i=0; i<menu_number; i++){
			menu_name[i].setBounds(50, 100 + 40*i, 90, 30);
			add(menu_name[i]);
		}
		
		//증감 화살표
		sm1 = new SpinnerNumberModel(0,0,20,1); // SpinnerNumberModel(initial number, min, max , step)  초기값0, 최소0, 최대 20, 1씩 증감
		js1 = new JSpinner(sm1);
		js1.setBounds(140, 105, 50, 20);
		add(js1);
		
		sm2 = new SpinnerNumberModel(0,0,20,1);
		js2 = new JSpinner(sm2);
		js2.setBounds(140, 145, 50, 20);
		add(js2);
		
		sm3 = new SpinnerNumberModel(0,0,20,1);
		js3 = new JSpinner(sm3);
		js3.setBounds(140, 185, 50, 20);
		add(js3);
		
		sm4 = new SpinnerNumberModel(0,0,20,1);
		js4 = new JSpinner(sm4);
		js4.setBounds(140, 225, 50, 20);
		add(js4);
		
		sm5 = new SpinnerNumberModel(0,0,20,1);
		js5 = new JSpinner(sm5);
		js5.setBounds(140, 265, 50, 20);
		add(js5);
		
		갱신 = new Button("주문 갱신");
		갱신.setBounds(600, 100, 100, 100);
		add(갱신);
		
		할인 = new Button("할인");
		할인.setBounds(600, 220, 100, 100);
		add(할인);
		
		적립 = new Button("적립");
		적립.setBounds(600, 340, 100, 100);
		add(적립);
		
		계산 = new Button("계산");		
		계산.setBounds(600, 460, 100, 100);
		add(계산);
		
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
		Order_Modify_Screen oms = new Order_Modify_Screen();
	}
}
