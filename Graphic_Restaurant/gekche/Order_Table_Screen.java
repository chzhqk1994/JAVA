package gekche;

import java.awt.*;
import java.awt.event.*;

public class Order_Table_Screen extends Frame{
	private Frame f;
	private Button[] 버튼;
	private int table_number = 6;
	
	Order_Table_Screen(){
		super("테이블 화면");
		
		버튼 = new Button[table_number];
		
		for (int i=0; i<table_number; i++){
			버튼[i] = new Button((i+1) + "번 테이블");
			버튼[i].setBounds(50 + 100 + (i % 3) *110, 50 +  110 * (i / 3), 100, 100);
			add(버튼[i]);
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
        
        버튼[0].addActionListener(new ActionListener(){

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
