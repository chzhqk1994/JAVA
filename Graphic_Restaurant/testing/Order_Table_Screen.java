package testing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;

public class Order_Table_Screen extends JFrame {
	private DefaultTableModel ��;
	private JPanel ���̺�ȭ��;
	private JButton ���̺�1, ���̺�2, ���̺�3, ���̺�4, ���̺�5, ���̺�6;
	private JMenuBar �޴���;
	private JMenu �����޴�, �����޴�;
	private JMenuItem ������, �Ǹź���, ���ΰ���, �������, ����ڰ���, ���⳻������;


	public Order_Table_Screen() {
		
		�޴��� = new JMenuBar();
		setJMenuBar(�޴���);
		
		�����޴� = new JMenu("����");
		�޴���.add(�����޴�);
		
		������ = new JMenuItem("������");
		�����޴�.add(������);
		
		���ΰ��� = new JMenuItem("���ΰ���");
		�����޴�.add(���ΰ���);
		
		������� = new JMenuItem("�������");
		�����޴�.add(�������);
		
		����ڰ��� = new JMenuItem("����� ����");
		�����޴�.add(����ڰ���);
		
		�����޴� = new JMenu("����");
		�޴���.add(�����޴�);
		
		�Ǹź��� = new JMenuItem("�Ǹ� ����");
		�����޴�.add(�Ǹź���);
		
		���⳻������ = new JMenuItem("���⳻�� ����");
		�����޴�.add(���⳻������);
		
		���̺�ȭ�� = new JPanel();
		setContentPane(���̺�ȭ��);
		���̺�ȭ��.setLayout(null);
		
		���̺�1 = new JButton("1�� ���̺�");
		���̺�1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Order_Screen();
			}});
		���̺�1.setBounds(15, 15, 110, 110);
		���̺�ȭ��.add(���̺�1);
		
		���̺�2 = new JButton("2�� ���̺�");
		���̺�2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Order_Screen();
			}});
		���̺�2.setBounds(140, 15, 110, 110);
		���̺�ȭ��.add(���̺�2);
		
		���̺�3 = new JButton("3�� ���̺�");
		���̺�3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Order_Screen();
				}});
		���̺�3.setBounds(260, 15, 110, 110);
		���̺�ȭ��.add(���̺�3);
		
		���̺�4 = new JButton("4�� ���̺�");
		���̺�4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Order_Screen();
				}});
		���̺�4.setBounds(15, 140, 110, 110);
		���̺�ȭ��.add(���̺�4);
		
		���̺�5 = new JButton("5�� ���̺�");
		���̺�5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Order_Screen();
				}});
		���̺�5.setBounds(140, 140, 110, 110);
		���̺�ȭ��.add(���̺�5);
		
		���̺�6 = new JButton("6�� ���̺�");
		���̺�6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Order_Screen();
			}});
		���̺�6.setBounds(260, 140, 110, 110);
		���̺�ȭ��.add(���̺�6);
		
		setSize(400, 330);
		setVisible(true);
		getContentPane().setLayout(null);
	}
	
	public static void main(String[] args) {
		new Order_Table_Screen();
	}
}
