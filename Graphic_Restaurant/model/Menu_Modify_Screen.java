package model;

import java.awt.*;
import java.awt.event.*;

public class Menu_Modify_Screen extends Frame{
	private Label[] menu_name;
	private Button 메뉴_추가, 메뉴_삭제;
	private int menu_number = 5;
	
	
	Menu_Modify_Screen(){
		super("차림표 수정");
		
		menu_name = new Label[menu_number];
		
		menu_name[0] = new Label("갈비탕 : 7000");
		menu_name[1] = new Label("정식 : 5000");
		menu_name[2] = new Label("순대국밥 : 8000");
		menu_name[3] = new Label("불고기 : 6000");
		menu_name[4] = new Label("제육볶음 : 7000");

		for (int i=0; i<menu_number; i++){
			menu_name[i].setBounds(200, 100 + 40*i, 90, 30);
			add(menu_name[i]);
		}
		
		메뉴_추가 = new Button("메뉴 추가");
		메뉴_추가.setBounds(600, 100, 100, 100);
		add(메뉴_추가);
		
		메뉴_삭제 = new Button("메뉴 삭제");
		메뉴_삭제.setBounds(600, 220, 100, 100);
		add(메뉴_삭제);
		
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
		Menu_Modify_Screen mms = new Menu_Modify_Screen();
	}
}
