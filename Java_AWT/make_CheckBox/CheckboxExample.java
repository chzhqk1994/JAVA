package make_CheckBox;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
		
        WindowAdapter WA = new WindowAdapter(){    //윈도우의 X 버튼을 누르면 꺼지게 한다.
        	public void windowClosing(WindowEvent windowEvent) {
              System.exit(0);
        	}
    };
    addWindowListener(WA);
	}
	
	public static void main(String args[]){
		CheckboxExample CE = new CheckboxExample();
	}
}
