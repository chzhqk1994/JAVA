package make_Choice;

import java.awt.*;
import java.awt.event.*;

public class ChoiceExample extends Frame{
	Choice c; // 선택 묶음이 한 묶음이므로 하나만 선언(뭔 개소리ㅑㅇ)
	
	ChoiceExample(){
		c = new Choice();
		c.setBounds(100, 100, 75, 75); // 선택 창 안에 목록이 들어있으므로 선택 창의 위치와 크기를 지정한다
		
		c.add("Item 1"); // 선택 창에 들어갈 목록들을 추가
		c.add("Item 2");
		c.add("Item 3");
		c.add("Item 4");
		c.add("Item 5");
		
		add(c); // 프레임에 선택창을 올리는것도 잊지 않는다

		setSize(400, 400);
		setLayout(null);
		setVisible(true);
		
		
		// X 버튼을 눌렀을 때 꺼지게 하는 코드를 작성하려면
		// import java.awt.event.*; 을 추가해야 한다.
		WindowAdapter WA = new WindowAdapter(){
			public void windowClosing(WindowEvent windowEvent){
				System.exit(0);
			}
		};
		addWindowListener(WA);
	}
		
	
	
	public static void main(String args[]){
		ChoiceExample ce = new ChoiceExample();
	}
}
