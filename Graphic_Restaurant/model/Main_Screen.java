package model;

import java.awt.*;
import java.awt.event.*;

public class Main_Screen extends Frame{
	private Button[] ��ư;
	private int button_number = 9;
	
	Main_Screen(){
		��ư = new Button[button_number];
		
		��ư[0] = new Button("�ֹ�");
		��ư[1] = new Button("����ǥ ���");
		��ư[2] = new Button("���⺸��");
		��ư[3] = new Button("���⺸��");
		��ư[4] = new Button("���� ����");
		��ư[5] = new Button("����� ����");
		��ư[6] = new Button("ȸ������");
		��ư[7] = new Button("���μ���");
		��ư[8] = new Button("������");
		
		for (int i=0; i<button_number; i++){
			��ư[i].setBounds(50 + 100 + (i % 3) *110, 50 +  110 * (i / 3), 100, 100);
			add(��ư[i]);
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
