package model;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Order_Screen2 extends Frame{
	private Button[] menu;
	private Button order;
	private Label[] menu_name;
	private SpinnerNumberModel sm;
	private JSpinner js;
	private int menu_number = 5;
	
	
	Order_Screen2(){
		menu = new Button[menu_number];
		menu_name = new Label[menu_number];
		
		menu[0] = new Button("°¥ºñÅÁ  7000");
		menu[1] = new Button("Á¤½Ä  5000");
		menu[2] = new Button("¼ø´ë±¹¹ä  8000");
		menu[3] = new Button("ºÒ°í±â  6000");
		menu[4] = new Button("Á¦À°ººÀ½  7000");
		
		menu_name[0] = new Label("°¥ºñÅÁ  7000 : ");
		menu_name[1] = new Label("Á¤½Ä  5000 : ");
		menu_name[2] = new Label("¼ø´ë±¹¹ä  8000 : ");
		menu_name[3] = new Label("ºÒ°í±â  6000 : ");
		menu_name[4] = new Label("Á¦À°ººÀ½  7000 : ");

		for (int i=0; i<menu_number; i++){
			menu[i].setBounds(50 + 100 + (i%5)*110, 50 +  110*(i/5), 100, 100);
			add(menu[i]);
			
			menu_name[i].setBounds(50, 300 + 40*i, 100, 30);
			add(menu_name[i]);
		}
		
		order = new Button("ÁÖ¹®¿Ï·á");
		order.setBounds(600, 400, 100, 100);
		add(order);
		
		sm = new SpinnerNumberModel(0,0,20,1); // initial number, min, max , step
		js = new JSpinner(sm);
		js.setBounds(300, 300, 50, 20);
		add(js);
		
		
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
