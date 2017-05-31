package model;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Reservation_Management_Screen extends Frame{ // ȸ�� ����
	Button add,remove;
	Panel p;
	JTable stock;
	JScrollPane table;
	String column[] = {"����","�ð�","���̺��ȣ","�̸�", "��ȭ��ȣ"};
	String data[][]={{"001", "2017.12.13 14:00", "1�����̺�", "ȫ�浿","010-1111-1111"},
					 {"002", "2017.12.25 18:30", "5�����̺�", "������", "010-9999-9999"}};
	
	Reservation_Management_Screen(){
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
		Reservation_Management_Screen mms = new Reservation_Management_Screen();
	}
}