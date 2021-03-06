package model;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Report_Sales_Screen extends Frame{ // 판매 보고서
	Button add,remove;
	Panel p;
	JTable sales;
	JScrollPane table;
	String column[] = {"날짜", "메뉴", "수량", "총액", "비고"};
	String data[][]={{"2017-11-15", "갈비탕", "40", "280000", ""},
					 {"2017-11-16", "정식", "60", "265000", ""}};
	
	Report_Sales_Screen(){
		super("판매보고서");
		
		add = new Button("추가");
		remove = new Button("삭제");
		
		sales = new JTable(data, column);
		sales.setBounds(30, 40, 600, 600);
		table = new JScrollPane(sales);

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
		Report_Sales_Screen rss = new Report_Sales_Screen();
	}
}
