package gekche;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.*;

public class Order_Screen extends Frame implements ActionListener{
	private Button ������, ����, ������;
	private DefaultTableModel model;
	private Dialog d_menu;
	private JTable table_order;
	private JScrollPane table;
	private String column[] = {"�޴�", "����"};
	private String data[][]={{"������", "0"},
					  		 {"����", "0"},
							 {"������", "0"}};
	
	Order_Screen(){ // �⺻ ������ �Լ�
		
		super("�ֹ��ϱ�");
		d_menu = new Dialog(this);
		
		������ = new Button("������");
		������.setBounds(50, 100, 100, 60);
		������.addActionListener(this);
		add(������);
		
		���� = new Button("����");
		����.setBounds(50, 170, 100, 60);
		����.addActionListener(this);
		add(����);
		
		������ = new Button("������");
		������.setBounds(50, 240, 100, 60);
		������.addActionListener(this);
		add(������);
		
		model = new DefaultTableModel(data, column);
		table_order = new JTable(model);
		table_order.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		table = new JScrollPane(table_order);
		table.setBounds(500, 100, 200, 300);
		add(table);
		
		setSize(800, 600);
		setLayout(null);
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
		if(e.getSource() == ������){
			int cnt = Integer.parseInt(data[0][1]);
			cnt ++;
			data[0][1] = Integer.toString(cnt);
			
		}
		else if(e.getSource() == ����){
			int cnt = Integer.parseInt(data[0][1]);
			cnt ++;
			data[1][1] = Integer.toString(cnt);
		}
		else if(e.getSource() == ������){
			int cnt = Integer.parseInt(data[0][1]);
			cnt ++;
			data[2][1] = Integer.toString(cnt);
		}
		
		model.fireTableDataChanged(); // ǥ�� ��������� ���涧 ���� ������Ʈ ���Ѽ� �����ش�
	}
	
	public static void main(String args[]){
		new Order_Screen();
	}
}
