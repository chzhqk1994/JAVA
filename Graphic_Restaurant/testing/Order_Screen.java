package testing;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;

public class Order_Screen extends JFrame implements ActionListener{
	private JPanel �ֹ�ȭ��;
	private JTextField �������ֹ�;
	private JTextField �������ֹ�;
	private JTextField �����ֹ�;
	private JLabel ȭ���̸�, ��������, �������, ���Ķ�, ����;
	private JButton ����ư;

	public Order_Screen() {
		super("�ֹ�ȭ��");
		�ֹ�ȭ�� = new JPanel();
		setContentPane(�ֹ�ȭ��);
		�ֹ�ȭ��.setLayout(null);
		
		ȭ���̸� = new JLabel("�ֹ�ǥ");
		ȭ���̸�.setBounds(169, 12, 62, 18);
		�ֹ�ȭ��.add(ȭ���̸�);
		
		�������� = new JLabel("������ 7000��");
		��������.setBounds(14, 72, 101, 18);
		�ֹ�ȭ��.add(��������);
		
		������� = new JLabel("������ 6000��");
		�������.setBounds(14, 127, 101, 18);
		�ֹ�ȭ��.add(�������);
		
		���Ķ� = new JLabel("���� 5000��");
		���Ķ�.setBounds(14, 184, 101, 18);
		�ֹ�ȭ��.add(���Ķ�);
		
		�������ֹ� = new JTextField();
		�������ֹ�.setBounds(129, 69, 45, 24);
		�������ֹ�.setText("0");
		�ֹ�ȭ��.add(�������ֹ�);
		
		�������ֹ� = new JTextField();
		�������ֹ�.setColumns(10);
		�������ֹ�.setBounds(129, 124, 45, 24);
		�������ֹ�.setText("0");
		�ֹ�ȭ��.add(�������ֹ�);
		
		�����ֹ� = new JTextField();
		�����ֹ�.setColumns(10);
		�����ֹ�.setBounds(129, 181, 45, 24);
		�����ֹ�.setText("0");
		�ֹ�ȭ��.add(�����ֹ�);
		
		���� = new JLabel("�� �ݾ� : 0��");
		����.setBounds(14, 248, 125, 18);
		�ֹ�ȭ��.add(����);
		
		����ư = new JButton("���");
		����ư.addActionListener(this);
		����ư.setBounds(14, 300, 105, 27);
		�ֹ�ȭ��.add(����ư);
		
		setVisible(true);
		setSize(400, 400);
		getContentPane().setLayout(null);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int �������� = Integer.parseInt(�������ֹ�.getText());
		int ������� = Integer.parseInt(�������ֹ�.getText());
		int ���ļ� = Integer.parseInt(�����ֹ�.getText());
		
		����.setText("�� �ݾ� : "+ (��������*7000 + �������*6000 + ���ļ�*5000) + "��");
	}
	
	public static void main(String[] args) {
		new Order_Screen();
	}

}
