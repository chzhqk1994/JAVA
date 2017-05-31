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
		String menu = menu_name; // 메뉴를 입력하는 TextField 에서 메뉴이름을 받아옴
		String data = number; // 수량을 입력하는 TextField 에서 수량을 받아옴
		int menu_number = Integer.parseInt(data); // 받아온 수량(문자열)을 숫자로 변환

		String order_info = "메뉴 : " + menu_name + ", 수량 : " + menu_number;
		
		order_data.setText(order_info);
		order_data.setBounds(100, 50, 200, 30);
		
		menu_amount = price * menu_number;  // 주문한 내용의 총액을 계산
		String amount = "주문한 내용의 총 금액은 : " + menu_amount + "원 입니다.";
		
		order_amount = new Label();
		order_amount.setText(amount);
		order_amount.setBounds(50, 100, 250, 30);
		
		clear = new Button("확인");
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
