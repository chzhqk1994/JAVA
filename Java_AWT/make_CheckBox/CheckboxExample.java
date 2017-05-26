package make_CheckBox;

import java.awt.*;

public class CheckboxExample extends Frame{
	Checkbox cb1, cb2;
	
	CheckboxExample(){
		cb1 = new Checkbox("C++");
		cb1.setBounds(100, 100, 50, 50);
		
		cb2 = new Checkbox("JAVA");
		cb2.setBounds(100, 150, 50, 50);
		
		add(cb1);
		add(cb2);
		
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String args[]){
		CheckboxExample CE = new CheckboxExample();
	}
}
