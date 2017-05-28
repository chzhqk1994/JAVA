package make_CheckBox;

import java.awt.*;
import java.awt.event.*;

public class CheckboxGroupExample extends Frame{
	CheckboxGroup group; // 체크박스 그룹과 체크박스 객체들을 모두 선언
	Checkbox cb1;
	Checkbox cb2;
	
	CheckboxGroupExample(){
		super("Window's Name");  // 윈도우 창의 이름을 정한다
		
		group = new CheckboxGroup();
		
		cb1 = new Checkbox("C++", group, false); // 체크박스의 이름과 그룹, 상태를 지정한다
		cb1.setBounds(100, 100, 50, 50);
		
		cb2 = new Checkbox("JAVA", group, false); // 초기상태는 모든 박스가 체크되지 않은 상태여도 상관 없다
		cb2.setBounds(100, 150, 50, 50);
		
		add(cb1); // 그룹객체는 추가하지 않는다!!!
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
		CheckboxGroupExample CGE = new CheckboxGroupExample();
	}
}
