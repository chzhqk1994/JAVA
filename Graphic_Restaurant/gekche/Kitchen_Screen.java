package gekche;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Kitchen_Screen extends Frame{
	Button B_clear, B_stock;
	Panel p;
	JTable expense;
	JScrollPane table;
	String column[] = {"�޴�", "����"};
	String data[][]={{"������", "2��"},
					 {"����", "5��"}};
	
	Kitchen_Screen(){
		B_clear = new Button("�����Ϸ�");
		B_stock = new Button("������ ����");
		
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
