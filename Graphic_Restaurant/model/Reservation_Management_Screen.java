package model;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Reservation_Management_Screen extends Frame{ // 회원 관리
	Button add,remove;
	Panel p;
	JTable stock;
	JScrollPane table;
	String column[] = {"순번","시간","테이블번호","이름", "전화번호"};
	String data[][]={{"001", "2017.12.13 14:00", "1번테이블", "홍길동","010-1111-1111"},
					 {"002", "2017.12.25 18:30", "5번테이블", "개똥이", "010-9999-9999"}};
	
	Reservation_Management_Screen(){
		super("회원 관리");
		
		add = new Button("추가");
		remove = new Button("삭제");
		
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