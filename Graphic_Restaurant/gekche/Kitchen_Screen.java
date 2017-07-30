package gekche;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Kitchen_Screen extends Frame{
	Button B_clear, B_stock;
	Panel p;
	JTable expense;
	JScrollPane table;
	String column[] = {"메뉴", "수량"};
	String data[][]={{"갈비탕", "2개"},
					 {"정식", "5개"}};
	
	Kitchen_Screen(){
		B_clear = new Button("조리완료");
		B_stock = new Button("식자재 관리");
		
		expense = new JTable(data, column);
		expense.setBounds(30, 40, 600, 600);
		table = new JScrollPane(expense);
		
		p = new Panel();
		
		add(table, BorderLayout.WEST);
		add(p, BorderLayout.CENTER);
		p.add(B_clear);
		p.add(B_stock);
		
		setSize(800, 600);
		setVisible(true);
		
        WindowAdapter WA = new WindowAdapter(){
        	public void windowClosing(WindowEvent windowEvent) {
              setVisible(false);
        	}
        };
        addWindowListener(WA);
	}
	
	public static void main(String args[]){
		new Kitchen_Screen();
	}
}
