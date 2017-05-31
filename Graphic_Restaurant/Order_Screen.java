import java.awt.*;
import java.awt.event.*;

public class Order_Screen extends Frame implements ActionListener{

	private Label headerLabel, statusLabel, menu, number;
	private Button OrderButton;
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
		
		OrderButton = new Button("�ֹ�");
		OrderButton.setBounds(200, 150, 80, 50);
		OrderButton.addActionListener(this);
		
		add(headerLabel);
		add(menu);
		add(T_menu);
		add(number);
		add(T_number);
		add(OrderButton);
		
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
		String order = "�޴� : " + T_menu.getText() + ", ���� : " + T_number.getText();
		Order_Dialog od = new Order_Dialog(order);
	}
	
	
	public static void main(String args[]){
		Order_Screen os = new Order_Screen();
	}
}
