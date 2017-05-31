package gekche;
import java.awt.*;
import java.awt.event.*;

public class Order_Dialog extends Frame implements ActionListener{
	private Dialog order;
	private Label order_data, order_amount;
	private Button clear;
	private int menu_amount;
	
	Order_Dialog(String menu_name, String number, int price){
		
		order = new Dialog(this);
		
		order_data = new Label();
		String menu = menu_name; // �޴��� �Է��ϴ� TextField ���� �޴��̸��� �޾ƿ�
		String data = number; // ������ �Է��ϴ� TextField ���� ������ �޾ƿ�
		int menu_number = Integer.parseInt(data); // �޾ƿ� ����(���ڿ�)�� ���ڷ� ��ȯ

		String order_info = "�޴� : " + menu_name + ", ���� : " + menu_number;
		
		order_data.setText(order_info);
		order_data.setBounds(100, 50, 200, 30);
		
		menu_amount = price * menu_number;  // �ֹ��� ������ �Ѿ��� ���
		String amount = "�ֹ��� ������ �� �ݾ��� : " + menu_amount + "�� �Դϴ�.";
		
		order_amount = new Label();
		order_amount.setText(amount);
		order_amount.setBounds(50, 100, 250, 30);
		
		clear = new Button("Ȯ��");
		clear.setBounds(150, 200, 60, 30);
		clear.addActionListener(this);
		
		add(order_data);
		add(order_amount);
		add(clear);
		setSize(400,300);
		setLayout(null);
		setVisible(true);
		
        WindowAdapter WA = new WindowAdapter(){
        	public void windowClosing(WindowEvent windowEvent) {
              setVisible(false);
        	}
        };
        addWindowListener(WA);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setVisible(false);
	}
}
