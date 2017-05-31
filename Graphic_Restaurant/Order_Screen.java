import java.awt.*;
import java.awt.event.*;

public class Order_Screen extends Frame implements ActionListener{

	private Label headerLabel, statusLabel, menu, number;
	private Button OrderButton;
	private TextField T_menu, T_number;
	
	Order_Screen(){
		headerLabel = new Label("메뉴와 수량을 입력하세요");
		headerLabel.setBounds(150, 50, 150, 30);
		
		menu = new Label("메뉴 : ");
		menu.setBounds(50, 100, 50, 30);
		
		T_menu = new TextField();
		T_menu.setBounds(100, 100, 70, 20);
		
		number = new Label("수량 : ");
		number.setBounds(250, 100, 50, 30);
		
		T_number = new TextField();
		T_number.setBounds(300, 100, 70, 20);
		
		OrderButton = new Button("주문");
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
		String order = "메뉴 : " + T_menu.getText() + ", 수량 : " + T_number.getText();
		Order_Dialog od = new Order_Dialog(order);
	}
	
	
	public static void main(String args[]){
		Order_Screen os = new Order_Screen();
	}
}
