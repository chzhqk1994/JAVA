package testing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;

public class Order_Table_Screen extends JFrame {
	private DefaultTableModel 모델;
	private JPanel 테이블화면;
	private JButton 테이블1, 테이블2, 테이블3, 테이블4, 테이블5, 테이블6;
	private JMenuBar 메뉴바;
	private JMenu 보고서메뉴, 관리메뉴;
	private JMenuItem 재고관리, 판매보고서, 할인관리, 예약관리, 대기자관리, 지출내역보고서;


	public Order_Table_Screen() {
		
		메뉴바 = new JMenuBar();
		setJMenuBar(메뉴바);
		
		관리메뉴 = new JMenu("관리");
		메뉴바.add(관리메뉴);
		
		재고관리 = new JMenuItem("재고관리");
		관리메뉴.add(재고관리);
		
		할인관리 = new JMenuItem("할인관리");
		관리메뉴.add(할인관리);
		
		예약관리 = new JMenuItem("예약관리");
		관리메뉴.add(예약관리);
		
		대기자관리 = new JMenuItem("대기자 관리");
		관리메뉴.add(대기자관리);
		
		보고서메뉴 = new JMenu("보고서");
		메뉴바.add(보고서메뉴);
		
		판매보고서 = new JMenuItem("판매 보고서");
		보고서메뉴.add(판매보고서);
		
		지출내역보고서 = new JMenuItem("지출내역 보고서");
		보고서메뉴.add(지출내역보고서);
		
		테이블화면 = new JPanel();
		setContentPane(테이블화면);
		테이블화면.setLayout(null);
		
		테이블1 = new JButton("1번 테이블");
		테이블1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Order_Screen();
			}});
		테이블1.setBounds(15, 15, 110, 110);
		테이블화면.add(테이블1);
		
		테이블2 = new JButton("2번 테이블");
		테이블2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Order_Screen();
			}});
		테이블2.setBounds(140, 15, 110, 110);
		테이블화면.add(테이블2);
		
		테이블3 = new JButton("3번 테이블");
		테이블3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Order_Screen();
				}});
		테이블3.setBounds(260, 15, 110, 110);
		테이블화면.add(테이블3);
		
		테이블4 = new JButton("4번 테이블");
		테이블4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Order_Screen();
				}});
		테이블4.setBounds(15, 140, 110, 110);
		테이블화면.add(테이블4);
		
		테이블5 = new JButton("5번 테이블");
		테이블5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Order_Screen();
				}});
		테이블5.setBounds(140, 140, 110, 110);
		테이블화면.add(테이블5);
		
		테이블6 = new JButton("6번 테이블");
		테이블6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Order_Screen();
			}});
		테이블6.setBounds(260, 140, 110, 110);
		테이블화면.add(테이블6);
		
		setSize(400, 330);
		setVisible(true);
		getContentPane().setLayout(null);
	}
	
	public static void main(String[] args) {
		new Order_Table_Screen();
	}
}
