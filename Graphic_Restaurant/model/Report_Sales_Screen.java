package model;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Report_Sales_Screen extends Frame{ // 판매 보고서
	JTable sales;
	JScrollPane table;
	String column[] = {"메뉴", "수량", "총액", "날짜", "비고"};
	String data[][]={{"갈비탕", "40", "280000", "2017-11-15", ""},
					 {"정식", "60", "265000", "2017-11-16", ""}};
	
	Report_Sales_Screen(){
		sales = new JTable(data, column);
		sales.setBounds(30, 40, 600, 600);
		table = new JScrollPane(sales);
		add(table);
		
		
		setSize(800, 800);
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
