package model;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Report_Stock_Screen extends Frame{ //��� ����
	Button add,remove;
	Panel p;
	JTable stock;
	JScrollPane table;
	String column[] = {"��¥", "ǰ��", "�ݾ�", "����", "�Ѿ�", "���"};
	String data[][]={{"2017-11-15", "��ġ","20000", "3", "60000", ""},
					 {"2017-11-16", "������", "38000","1", "38000", ""}};
	
	Report_Stock_Screen(){
		super("��� ����");
		
		add = new Button("�߰�");
		remove = new Button("����");
		
		stock = new JTable(data, column);
		stock.setBounds(30, 40, 600, 600);
		table = new JScrollPane(stock);
		
		p = new Panel();
		p.add(add);
		p.add(remove);
		
		add(table, BorderLayout.WEST);
		add(p);
		
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
		Report_Stock_Screen rss = new Report_Stock_Screen();
	}
}
