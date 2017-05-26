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
		
		cb2 = new Checkbox("JAVA");
		cb2.setBounds(100, 150, 50, 50);
		
		add(select);
		add(cb1);
		add(cb2);
		
		cb1.addItemListener(new ItemListener(){ // 체크박스의 상태가 바뀌었을 때 이벤트 실행
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if (e.getStateChange()==0)
					select.setText("C++ Checkbox : Checked");
				else
					select.setText("C++ Checkbox : Unchecked");
			}
		});
		
		cb2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if (e.getStateChange()==1)
					select.setText("JAVA Checkbox : Checked");
				else
					select.setText("JAVA Checkbox : Unchecked");
			}
		});
		
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}

	
	// 지금까진 여기다가 이벤트 동작을 적었는데 여기선 어떡하지;;
//	@Override
//	public void itemStateChanged(ItemEvent e) {
//		// TODO Auto-generated method stub
//		
//	}

	
	
	
	
}
