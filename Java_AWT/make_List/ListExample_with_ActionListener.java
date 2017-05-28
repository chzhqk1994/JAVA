package make_List;

import java.awt.*;
import java.awt.event.*;

public class ListExample_with_ActionListener extends Frame implements ActionListener{
	Label L_state;
	List L1, L2;
	Button B_show;
	
	ListExample_with_ActionListener(){
		super("Ȳ�μ���");
		
		L_state = new Label("State display : ");
		L_state.setBounds(100, 20, 800, 100);
		
		L1 = new List(4, false); // ???
		L1.setBounds(100, 150, 70, 70);
		L1.add("C");
		L1.add("C++");
		L1.add("JAVA");
		L1.add("PHP");
		
		L2 = new List(4, true);
		L2.setBounds(100, 250, 70, 70);
		L2.add("Turbo C++");
		L2.add("Spring");
		L2.add("Hibernate");
		L2.add("CodeIgniter");
		
		B_show = new Button("Show");
		B_show.setBounds(200, 200, 80, 30);
		B_show.addActionListener(this);  // ��ư�� ������ �̺�Ʈ�� ����ǹǷ� ��ư���ٰ� �߰�
		
		setSize(800, 800);
		setLayout(null);
		setVisible(true);
		
		add(L_state);
		add(L1);
		add(L2);
		add(B_show);
		
		WindowAdapter WA = new WindowAdapter(){
			public void windowClosing(WindowEvent windowEvent){
				System.exit(0);
			}
		};
		addWindowListener(WA);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		try{  // ������ �ƴҽÿ� ������ ����
			String data = "Programming language Selected : " + L1.getItem(L1.getSelectedIndex());
			data += ", Framework Selected : ";  // getSelecedIndex() �Լ��� ���� ������ �������� Index ���� ���Ϲ޾� getItem() �Լ��� �μ��� �ѱ�� �ؽ�Ʈ ���� ������ �� �ִ�
			
			for(String frame:L2.getSelectedItems()){ // ??????????????????????????????�̰� ���� �𸣰ڴ�
				data += frame += "  "; // �̰͵� ���ڤ̤��� �˾ƺ���¡
				L_state.setText(data);
			}
		}
		catch(ArrayIndexOutOfBoundsException error){ // ������ �߻��ϸ� ������ ����
			System.out.println("������");
		}
		
	}
	
	public static void main(String args[]){
		ListExample_with_ActionListener LwA = new ListExample_with_ActionListener();
	}

}
