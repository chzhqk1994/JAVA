package testing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TableTest extends JFrame {

	private DefaultTableModel ��;
	private JPanel �ֹ�ȭ��;
	private JTable �ֹ�����;
	private JButton ��������ư, �������ư, ���Ĺ�ư;
	private String column[]={"�޴��̸�", "����"};
	private String data[][]={
			{"������", "0"},
			{"������", "0"},
			{"����", "0"}};

	public TableTest() {
		setBounds(100, 100, 450, 300);
		�ֹ�ȭ�� = new JPanel();
		setContentPane(�ֹ�ȭ��);
		�ֹ�ȭ��.setLayout(null);
		
		�� = new DefaultTableModel();
		
		
		�ֹ����� = new JTable(data, column);
		�ֹ�����.setBounds(240, 65, 200, 250);
		�ֹ�ȭ��.add(�ֹ�����);
		
		��������ư = new JButton("������");
		��������ư.setBounds(14, 59, 105, 27);
		��������ư.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int �ӽú��� = Integer.parseInt(data[0][1]) + 1;
				data[0][1] = Integer.toString(�ӽú���);
			}
		});
		�ֹ�ȭ��.add(��������ư);
		
		�������ư = new JButton("������");
		�������ư.setBounds(14, 98, 105, 27);
		�������ư.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int �ӽú��� = Integer.parseInt(data[1][1]) + 1;
				data[1][1] = Integer.toString(�ӽú���);
			}
		});
		�ֹ�ȭ��.add(�������ư);
		
		���Ĺ�ư = new JButton("����");
		���Ĺ�ư.setBounds(14, 137, 105, 27);
		���Ĺ�ư.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int �ӽú��� = Integer.parseInt(data[2][1]) + 1;
				data[2][1] = Integer.toString(�ӽú���);
			}
		});
		�ֹ�ȭ��.add(���Ĺ�ư);
		
		setSize(500, 500);
		setVisible(true);
		�ֹ�ȭ��.setLayout(null);
	}

	public static void main(String[] args) {
		new TableTest();
	}
}
