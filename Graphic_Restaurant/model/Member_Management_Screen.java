package model;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Member_Management_Screen extends Frame{ // ȸ�� ����
	Button add,remove;
	Panel p;
	JTable stock;
	JScrollPane table;
	String column[] = {"ȸ����ȣ","�̸�", "��ȭ��ȣ"};
	String data[][]={{"0001", "ȫ�浿","010-1111-1111"},
					 {"0002", "������", "010-9999-9999"}};
	
	Member_Management_Screen(){
		super("ȸ�� ����");
		
		add = new Button("�߰�");
		remove = new Button("����");
		
		stock = new JTable(data, column);
		stock.setBounds(30, 40, 600, 600);
		table = new JScrollPane(stock);
		
		p = new Panel();
		p.add(add);
		p.add(remove);
		
		add(p);
		add(table, BorderLayout.WEST);
		
		setSize(600, 500);
		setVisible(true);
		
		WindowAdapter WA = new WindowAdapter(){
			public void windowClosing(WindowEvent windowEvent){
				System.exit(0);
			}
		};
		addWindowListener(WA);
	}

	public static void main(String args[]){
		Member_Management_Screen mms = new Member_Management_Screen();
	}
}