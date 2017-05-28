package make_CheckBox;

import java.awt.*;
import java.awt.event.*;

public class test extends Frame implements ItemListener{
	Label L1;
	Checkbox cb1, cb2;
	
	test(){
		L1 = new Label("Checkbox : ");
		L1.setAlignment(Label.CENTER);
		L1.setSize(400, 100);
		
		cb1 = new Checkbox("C++");
		cb1.setBounds(100, 100, 50, 50);
		cb1.addItemListener(this);
		
		cb2 = new Checkbox("JAVA");
		cb2.setBounds(100, 150, 50, 50);
		cb2.addItemListener(this);
		
		
        WindowAdapter WA = new WindowAdapter(){
        	public void windowClosing(WindowEvent windowEvent) {
              System.exit(0);
        	}
    };
    addWindowListener(WA);

		
		//		cb1.addItemListener(new ItemListener (){
//			public void itemStateChanged(ItemEvent e){
//				L1.setText("c++ Checkbox : " + (e.getStateChange()==1? "Checked" : "unchecked"));
//			}
//		});
//		
//		
//		cb2.addItemListener(new ItemListener (){
//			public void itemStateChanged(ItemEvent e){
//				L1.setText("JAVA Checkbox : " + (e.getStateChange()==1? "Checked" : "unchecked"));
//			}
//		});
		
		
		
		add(L1);
		add(cb1);
		add(cb2);
		
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		L1.setText("State : " + (e.getStateChange()==1 ? "Checked" : "Unchecked"));
	}

	
	
	public static void main(String args[]){
		test t = new test();
	}

}
