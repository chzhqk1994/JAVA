package gekche;
import java.awt.*;
import java.awt.event.*;

public class Order_Screen extends Frame implements ActionListener{

	private Label headerLabel, statusLabel, menu, number;
	private Button menu_button, order_button;
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
		
		menu_button = new Button("메뉴보기");
		menu_button.setBounds(100, 150, 80, 50);
		menu_button.addActionListener(this);
		
		order_button = new Button("주문");
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
			
			Menu_Screen ms = new Menu_Screen(T_menu.getText()); // 메뉴의 가격을 받아오는 코드
			for(int i=0; i< ms.data.length; i++){ // 메뉴의 수 만큼 반복하며 메뉴를 찾아감
				if(ms.data[i][0].equals(T_menu.getText())){ // 메뉴판의 메뉴와 입력받은 메뉴의 이름을 비교하여 같은 이름을 찾는다
					price = Integer.parseInt(ms.data[i][1]); // 해당하는 메뉴의 가격을 숫자형으로 변환
				}
			}
			Order_Dialog od = new Order_Dialog(T_menu.getText(), T_number.getText(), price); // 여기다 음식 가격도 같이 넘긴다					
		}
		
		else if (e.getSource() == menu_button){
			Menu_Screen ms = new Menu_Screen();
		}
	}
	
	public static void main(String args[]){
		Order_Screen os = new Order_Screen();
	}
}
