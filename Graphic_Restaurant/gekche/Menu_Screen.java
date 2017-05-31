package gekche;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Menu_Screen extends Frame implements ActionListener{
	private Dialog d_menu;
	private JTable table_menu;
	private JScrollPane table;
	private String column[] = {"메뉴", "가격"};
	public String data[][]={{"갈비탕", "6000"},
							{"정식", "5000"},
							{"육개장", "6000"}};
	
	Button ok;
	
	Menu_Screen(String menu_name){	// 메뉴 가격을 리턴해주기 위한 생성자 함수
		String menu = menu_name;
		
	}
	
	Menu_Screen(){ // 기본 생성자 함수
		super("메뉴보기");
		d_menu = new Dialog(this);
		
		table_menu = new JTable(data, column);
		table_menu.setBounds(30, 40, 600, 600);
		table = new JScrollPane(table_menu);

		ok = new Button("확인");
		ok.addActionListener(this);
		
		add(table, BorderLayout.WEST);
		add(ok, BorderLayout.SOUTH);
		
		setSize(600, 500);
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
		setVisible(false); // 확인 버튼을 누르면 다이얼로그 화면이 사라짐
	}
}
