package make_CheckBox;

import java.awt.*;
import java.awt.event.*;

public class CheckboxGroupExample_with_ItemListener extends Frame implements ItemListener{
	private Label L_state;
	private CheckboxGroup group;
	private Checkbox cb1;
	private Checkbox cb2;
	
	CheckboxGroupExample_with_ItemListener(){
		super("체크박스 그룹 ItemListener 연습중");
		
		L_state = new Label("State : ");
		L_state.setAlignment(Label.CENTER);
		L_state.setSize(400, 100);
		
		group = new CheckboxGroup();
		
		cb1 = new Checkbox("C++", group, false);
		cb1.setBounds(100, 100, 50, 50);
		cb1.addItemListener(this);
		
		cb2 = new Checkbox("JAVA", group, false);
		cb2.setBounds(100, 150, 50, 50);
		cb2.addItemListener(this);
		
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
		
		add(L_state);
		add(cb1);
		add(cb2);
		
		WindowAdapter WA = new WindowAdapter(){
			public void windowClosing(WindowEvent windowEvent){
				System.exit(0);
			}
		};
		addWindowListener(WA);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==cb1)
			L_state.setText("C++ Checkbox : checked"); // 체크박스 그룹에선 하나만 선택 가능하므로 Unchecked는 안써도 된다.
		else if(e.getSource()==cb2)
			L_state.setText("JAVA Checkbox : checked");
	}
	
	public static void main(String argsp[]){
		CheckboxGroupExample_with_ItemListener cwi = new CheckboxGroupExample_with_ItemListener();
	}
}
