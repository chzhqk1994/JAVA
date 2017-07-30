package gekche;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.*;

public class Order_Screen extends Frame implements ActionListener{
	private Button 갈비탕, 정식, 육개장;
	private DefaultTableModel model;
	private Dialog d_menu;
	private JTable table_order;
	private JScrollPane table;
	private String column[] = {"메뉴", "가격"};
	private String data[][]={{"갈비탕", "0"},
					  		 {"정식", "0"},
							 {"육개장", "0"}};
	
	Order_Screen(){ // 기본 생성자 함수
		
		super("주문하기");
		d_menu = new Dialog(this);
		
		갈비탕 = new Button("갈비탕");
		갈비탕.setBounds(50, 100, 100, 60);
		갈비탕.addActionListener(this);
		add(갈비탕);
		
		정식 = new Button("정식");
		정식.setBounds(50, 170, 100, 60);
		정식.addActionListener(this);
		add(정식);
		
		육개장 = new Button("육개장");
		육개장.setBounds(50, 240, 100, 60);
		육개장.addActionListener(this);
		add(육개장);
		
		model = new DefaultTableModel(data, column);
		table_order = new JTable(model);
		table_order.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		table = new JScrollPane(table_order);
		table.setBounds(500, 100, 200, 300);
		add(table);
		
		setSize(800, 600);
		setLayout(null);
		setVisible(true);
		
		WindowAdapter WA = new WindowAdapter(){  // 윈도우의 X버튼을 눌렀을 때 꺼지는 기능
			public void windowClosing(WindowEvent windowEvent){
				setVisible(false); // 다이얼로그 화면만 사라짐
			}
		};
		addWindowListener(WA);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == 갈비탕){
			int cnt = Integer.parseInt(data[0][1]);
			cnt ++;
			data[0][1] = Integer.toString(cnt);
			
		}
		else if(e.getSource() == 정식){
			int cnt = Integer.parseInt(data[0][1]);
			cnt ++;
			data[1][1] = Integer.toString(cnt);
		}
		else if(e.getSource() == 육개장){
			int cnt = Integer.parseInt(data[0][1]);
			cnt ++;
			data[2][1] = Integer.toString(cnt);
		}
		
		model.fireTableDataChanged(); // 표에 변경사항이 생길때 마다 업데이트 시켜서 보여준다
	}
	
	public static void main(String args[]){
		new Order_Screen();
	}
}
