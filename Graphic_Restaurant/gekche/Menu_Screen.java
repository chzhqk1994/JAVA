package gekche;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Menu_Screen extends Frame implements ActionListener{
	private Dialog d_menu;
	private JTable table_menu;
	private JScrollPane table;
	private String column[] = {"�޴�", "����"};
	public String data[][]={{"������", "6000"},
							{"����", "5000"},
							{"������", "6000"}};
	
	Button ok;
	
	Menu_Screen(String menu_name){	// �޴� ������ �������ֱ� ���� ������ �Լ�
		String menu = menu_name;
		
	}
	
	Menu_Screen(){ // �⺻ ������ �Լ�
		super("�޴�����");
		d_menu = new Dialog(this);
		
		table_menu = new JTable(data, column);
		table_menu.setBounds(30, 40, 600, 600);
		table = new JScrollPane(table_menu);

		ok = new Button("Ȯ��");
		ok.addActionListener(this);
		
		add(table, BorderLayout.WEST);
		add(ok, BorderLayout.SOUTH);
		
		setSize(600, 500);
		setVisible(true);
		
		WindowAdapter WA = new WindowAdapter(){  // �������� X��ư�� ������ �� ������ ���
			public void windowClosing(WindowEvent windowEvent){
				setVisible(false); // ���̾�α� ȭ�鸸 �����
			}
		};
		addWindowListener(WA);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setVisible(false); // Ȯ�� ��ư�� ������ ���̾�α� ȭ���� �����
	}
}
