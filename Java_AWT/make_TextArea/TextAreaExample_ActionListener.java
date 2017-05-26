package make_TextArea;

import java.awt.*;
import java.awt.event.*;

public class TextAreaExample_ActionListener extends Frame implements ActionListener{
	Label L1, L2, L3;
	TextArea TA;
	Button B1;

	TextAreaExample_ActionListener(){
		L1 = new Label("Words : ");
		L1.setBounds(50, 50, 100, 30);
		
		L2 = new Label("Characters : ");
		L2.setBounds(160, 50, 100, 30);
		
		L3 = new Label("Inputed string : ");
		L3.setBounds(50, 80, 300, 30);
		
		TA = new TextArea();
		TA.setBounds(20, 120, 300, 300);
		
		B1 = new Button("Count Words");
		B1.setBounds(100, 420, 100, 30);
		B1.addActionListener(this);
		
		add(L1);
		add(L2);
		add(L3);
		add(TA);
		add(B1);
		
		setSize(500, 500);
		setLayout(null);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String text = TA.getText();
		String words[] = text.split("\\s");  // 스페이스를 기준으로 단어를 나눠서 words에 저장
		
		L1.setText("Words : " + words.length); // 리스트 words 의 길이를 나타내게 함
		L2.setText("Characters : " + text.length()); // 입력받은 텍스트의 길이를 나타내게 함
		L3.setText("Inputed string : " + text);
	}
	
	public static void main(String args[]){
		TextAreaExample_ActionListener TAA = new TextAreaExample_ActionListener();
	}
}
