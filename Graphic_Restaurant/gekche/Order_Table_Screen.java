package gekche;

import java.awt.*;
import java.awt.event.*;

public class Order_Table_Screen extends Frame{
	private Frame f;
	private Button[] ��ư;
	private int table_number = 6;
	
	Order_Table_Screen(){
		super("���̺� ȭ��");
		
		��ư = new Button[table_number];
		
		for (int i=0; i<table_number; i++){
			��ư[i] = new Button((i+1) + "�� ���̺�");
			��ư[i].setBounds(50 + 100 + (i % 3) *110, 50 +  110 * (i / 3), 100, 100);
			add(��ư[i]);
		}


		setSize(600, 500);
		setLayout(null);
		setVisible(true);
		
        WindowAdapter WA = new WindowAdapter(){
        	public void windowClosing(WindowEvent windowEvent) {
              setVisible(false);
        	}
        };
        addWindowListener(WA);
        
        ��ư[0].addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Order_Screen order = new Order_Screen();
			}
        	
        });
	}
	
	public static void main(String args[]){
		new Order_Table_Screen();
	}
}
