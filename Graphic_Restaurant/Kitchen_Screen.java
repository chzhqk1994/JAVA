import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Kitchen_Screen extends Frame{
	Button B_yes;
	List order_list;
	
	Kitchen_Screen(){
		B_yes = new Button("요리시작");
		B_yes.setBounds(600, 50, 100, 100);
		
		order_list = new List(10);
		order_list.setBounds(100, 50, 400, 400);
		
		add(B_yes);
		add(order_list);
		
		setSize(800, 600);
		setLayout(null);
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
