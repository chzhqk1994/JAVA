package gekche;
import java.awt.*;
import java.awt.event.*;

public class Order_Screen extends Frame implements ActionListener{

	private Label headerLabel, statusLabel, menu, number;
	private Button menu_button, order_button;
	private TextField T_menu, T_number;
	
	Order_Screen(){
		headerLabel = new Label("�޴��� ������ �Է��ϼ���");
		headerLabel.setBounds(150, 50, 150, 30);
		
		menu = new Label("�޴� : ");
		menu.setBounds(50, 100, 50, 30);
		
		T_menu = new TextField();
		T_menu.setBounds(100, 100, 70, 20);
		
		number = new Label("���� : ");
		number.setBounds(250, 100, 50, 30);
		
		T_number = new TextField();
		T_number.setBounds(300, 100, 70, 20);
		
		menu_button = new Button("�޴�����");
		menu_button.setBounds(100, 150, 80, 50);
		menu_button.addActionListener(this);
		
		order_button = new Button("�ֹ�");
		order_button.setBounds(200, 150, 80, 50);
		order_button.addActionListener(this);
		
		add(headerLabel);
		add(menu);
		add(T_menu);
		add(number);
		add(T_number);
		add(menu_button);
		add(order_button);
		
		setSize(500,300);
		setLayout(null);
		setVisible(true);
		
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
		if (e.getSource() == order_button){
			int price= 0;
			
			Menu_Screen ms = new Menu_Screen(T_menu.getText()); // �޴��� ������ �޾ƿ��� �ڵ�
			for(int i=0; i< ms.data.length; i++){ // �޴��� �� ��ŭ �ݺ��ϸ� �޴��� ã�ư�
				if(ms.data[i][0].equals(T_menu.getText())){ // �޴����� �޴��� �Է¹��� �޴��� �̸��� ���Ͽ� ���� �̸��� ã�´�
					price = Integer.parseInt(ms.data[i][1]); // �ش��ϴ� �޴��� ������ ���������� ��ȯ
				}
			}
			Order_Dialog od = new Order_Dialog(T_menu.getText(), T_number.getText(), price); // ����� ���� ���ݵ� ���� �ѱ��					
		}
		
		else if (e.getSource() == menu_button){
			Menu_Screen ms = new Menu_Screen();
		}
	}
	
	public static void main(String args[]){
		Order_Screen os = new Order_Screen();
	}
}
