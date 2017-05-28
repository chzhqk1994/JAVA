package make_Choice;

import java.awt.*;
import java.awt.event.*;

public class ChoiceExample_with_ActionListener extends Frame implements ActionListener{
	Label L_state;
	Button B_show;
	Choice group;
	
	ChoiceExample_with_ActionListener(){
		L_state = new Label();
		L_state.setSize(400,100);
		L_state.setAlignment(Label.CENTER);
		
		B_show = new Button("Show");
		B_show.setBounds(200, 100, 50, 20);
		B_show.addActionListener(this);
		
		group = new Choice();
		group.setBounds(100, 100, 75, 75);
		group.add("C");
		group.add("JAVA");
		group.add("PHP");
		group.add("Android");
		
		add(L_state);
		add(B_show);
		add(group);
		
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


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
/**/	String data = "Programming language Selected : " + group.getItem(group.getSelectedIndex());
/**/	L_state.setText(data); // getSelecedIndex() 함수를 통해 선택한 데이터의 Index 값을 리턴받아 getItem() 함수의 인수로 넘기면 텍스트 값을 가져올 수 있다
	}
	
	

	public static void main(String args[]){
		ChoiceExample_with_ActionListener cwa = new ChoiceExample_with_ActionListener();
		
	}
}
