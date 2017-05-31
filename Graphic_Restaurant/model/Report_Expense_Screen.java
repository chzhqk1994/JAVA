package model;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Report_Expense_Screen extends Frame{ //지출장부
	Button add,remove;
	Panel p;
	JTable expense;
	JScrollPane table;
	String column[] = {"날짜", "품목", "금액", "수량", "총액", "비고"};
	String data[][]={{"2017-11-15", "메뉴판 제작","40000", "3", "120000", ""},
					 {"2017-11-16", "의자", "80000","5", "400000", ""}};
	
	Report_Expense_Screen(){
		super("지출보고서");
		
		add = new Button("추가");
		remove = new Button("삭제");
		
		expense = new JTable(data, column);
		expense.setBounds(30, 40, 600, 600);
		table = new JScrollPane(expense);

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
		Report_Expense_Screen res = new Report_Expense_Screen();
	}
}
