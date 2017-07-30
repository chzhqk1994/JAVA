package testing;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;

public class Order_Screen extends JFrame implements ActionListener{
	private JPanel 주문화면;
	private JTextField 갈비탕주문;
	private JTextField 육개장주문;
	private JTextField 정식주문;
	private JLabel 화면이름, 갈비탕라벨, 육개장라벨, 정식라벨, 갯수;
	private JButton 계산버튼;

	public Order_Screen() {
		super("주문화면");
		주문화면 = new JPanel();
		setContentPane(주문화면);
		주문화면.setLayout(null);
		
		화면이름 = new JLabel("주문표");
		화면이름.setBounds(169, 12, 62, 18);
		주문화면.add(화면이름);
		
		갈비탕라벨 = new JLabel("갈비탕 7000원");
		갈비탕라벨.setBounds(14, 72, 101, 18);
		주문화면.add(갈비탕라벨);
		
		육개장라벨 = new JLabel("육개장 6000원");
		육개장라벨.setBounds(14, 127, 101, 18);
		주문화면.add(육개장라벨);
		
		정식라벨 = new JLabel("정식 5000원");
		정식라벨.setBounds(14, 184, 101, 18);
		주문화면.add(정식라벨);
		
		갈비탕주문 = new JTextField();
		갈비탕주문.setBounds(129, 69, 45, 24);
		갈비탕주문.setText("0");
		주문화면.add(갈비탕주문);
		
		육개장주문 = new JTextField();
		육개장주문.setColumns(10);
		육개장주문.setBounds(129, 124, 45, 24);
		육개장주문.setText("0");
		주문화면.add(육개장주문);
		
		정식주문 = new JTextField();
		정식주문.setColumns(10);
		정식주문.setBounds(129, 181, 45, 24);
		정식주문.setText("0");
		주문화면.add(정식주문);
		
		갯수 = new JLabel("총 금액 : 0원");
		갯수.setBounds(14, 248, 125, 18);
		주문화면.add(갯수);
		
		계산버튼 = new JButton("계산");
		계산버튼.addActionListener(this);
		계산버튼.setBounds(14, 300, 105, 27);
		주문화면.add(계산버튼);
		
		setVisible(true);
		setSize(400, 400);
		getContentPane().setLayout(null);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int 갈비탕수 = Integer.parseInt(갈비탕주문.getText());
		int 육개장수 = Integer.parseInt(육개장주문.getText());
		int 정식수 = Integer.parseInt(정식주문.getText());
		
		갯수.setText("총 금액 : "+ (갈비탕수*7000 + 육개장수*6000 + 정식수*5000) + "원");
	}
	
	public static void main(String[] args) {
		new Order_Screen();
	}

}
