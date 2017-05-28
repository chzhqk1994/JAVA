package make_List;

import java.awt.*;
import java.awt.event.*;

public class ListExample extends Frame{
	List select;
	
	ListExample(){
		select = new List(); //new List(5); 이렇게 숫자를 넣는것과 안넣는것 차이가 뭐지
		select.setBounds(100, 100, 75, 75);
		select.add("Item 1");
		select.add("Item 2");
		select.add("Item 3");
		select.add("Item 4");
		select.add("Item 5");
		select.add("Item 6");

		
		add(select);
		
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
		
		WindowAdapter WA = new WindowAdapter(){
			public void windowClosing(WindowEvent windowEvent){
				System.exit(0);
			}
		};
		addWindowListener(WA);
	}
	
	public static void main(String args[]){
		ListExample LE = new ListExample();
	}
}
