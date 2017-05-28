package make_CheckBox;

import java.awt.*;
import java.awt.event.*;

public class CheckboxExample_ItemListener extends Frame implements ItemListener{
	Label select;
	Checkbox cb1, cb2;
	
	CheckboxExample_ItemListener(){
		select = new Label("Selected subject : ");
		select.setAlignment(Label.CENTER); // 라벨의 위치를 가운데로 잡음
		select.setSize(400, 100); //setSize(width, height);
		
		cb1 = new Checkbox("C++");
		cb1.setBounds(100, 100, 50, 50);
		cb1.addItemListener(this); // ActionListener 처럼 사용하면 될 것 같다.
		
		cb2 = new Checkbox("JAVA");
		cb2.setBounds(100, 150, 50, 50);
		cb2.addItemListener(this);
		
		add(select);
		add(cb1);
		add(cb2);
		
		setSize(400,400);
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
		CheckboxExample_ItemListener ci = new CheckboxExample_ItemListener();
	}



	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==cb1){ // C++ 체크박스에서 이벤트가 발생하면 아래의 내용을 실행
			select.setText("C++ Checkbox : " + (e.getStateChange()==1 ? "Checked" : "Unchecked"));
		}
		else if(e.getSource()==cb2){ // JAVA 체크박스에서 이벤트가 발생하면 아래의 내용을 실행
			select.setText("JAVA checkbox : " + (e.getStateChange()==1 ? "Chcked" : "Unchekced"));
		} // (조건 ? 참 : 거짓) 조건이 참이면 참을 실행, 거짓이면 거짓을 실행
	}
	
	
	
	
}
