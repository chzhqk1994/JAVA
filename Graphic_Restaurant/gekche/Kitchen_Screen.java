package gekche;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Kitchen_Screen extends Frame{
	Button B_clear;
	Panel p;
	JTable expense;
	JScrollPane table;
	String column[] = {"�޴�", "����"};
	String data[][]={{"������", "2��"},
					 {"����", "5��"}};
	
	Kitchen_Screen(){
		B_clear = new Button("�����Ϸ�");
		
		expense = new JTable(data, column);
		expense.setBounds(30, 40, 600, 600);
		table = new JScrollPane(expense);
		
		p = new Panel();
		
		add(table, BorderLayout.WEST);
		add(p, BorderLayout.CENTER);
		p.add(B_clear);

		
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
		Kitchen_Screen ks = new Kitchen_Screen();
	}
}
