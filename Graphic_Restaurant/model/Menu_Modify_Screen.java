package model;

import java.awt.*;
import java.awt.event.*;

public class Menu_Modify_Screen extends Frame{
	private Label[] menu_name;
	private Button �޴�_�߰�, �޴�_����;
	private int menu_number = 5;
	
	
	Menu_Modify_Screen(){
		super("����ǥ ����");
		
		menu_name = new Label[menu_number];
		
		menu_name[0] = new Label("������ : 7000");
		menu_name[1] = new Label("���� : 5000");
		menu_name[2] = new Label("���뱹�� : 8000");
		menu_name[3] = new Label("�Ұ�� : 6000");
		menu_name[4] = new Label("�������� : 7000");

		for (int i=0; i<menu_number; i++){
			menu_name[i].setBounds(200, 100 + 40*i, 90, 30);
			add(menu_name[i]);
		}
		
		�޴�_�߰� = new Button("�޴� �߰�");
		�޴�_�߰�.setBounds(600, 100, 100, 100);
		add(�޴�_�߰�);
		
		�޴�_���� = new Button("�޴� ����");
		�޴�_����.setBounds(600, 220, 100, 100);
		add(�޴�_����);
		
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
