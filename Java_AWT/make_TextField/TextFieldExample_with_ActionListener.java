package make_TextField;

import java.awt.*;
import java.awt.event.*;

public class TextFieldExample_with_ActionListener extends Frame implements ActionListener{
	TextField TF1, TF2, TFresult;
	Button Bplus, Bminor;
	
	TextFieldExample_with_ActionListener(){
		TF1 = new TextField();
		TF1.setBounds(50, 50, 100, 30);
		
		TF2 = new TextField();
		TF2.setBounds(50, 100, 100, 30);
		
		TFresult = new TextField();
		TFresult.setBounds(50, 150, 100, 30);
		
		Bplus = new Button("더하기");
		Bplus.setBounds(50, 200, 100, 30);
		Bplus.addActionListener(this);
		
		Bminor = new Button("빼기");
		Bminor.setBounds(200,200, 100, 30);
		Bminor.addActionListener(this);
		
		add(TF1);
		add(TF2);
		add(TFresult);
		add(Bplus);
		add(Bminor);
		
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
		
	}
	
	
	
	
	// 버튼은 두개지만 동작 함수는 하나이다. 안에서 if 문으로 나눈다.
	@Override
	public void actionPerformed(ActionEvent e) { // 발생한 이벤트를 e로 받아온다
		// TODO Auto-generated method stub
		String s1 = TF1.getText(); // 텍스트필드1 에서 넘어온 문자열을 받는다(숫자도 일단 문자열로 받는다)
		String s2 = TF2.getText();
		
		int num1 = Integer.parseInt(s1); // 받은 문자열을 숫자로 바꾸어 준다(이렇게 할수밖에 없는듯)
		int num2 = Integer.parseInt(s2);
		int c = 0; // 결과를 저장할 변수
		
		if(e.getSource()==Bplus){
			c = num1 + num2;
		}
		else if(e.getSource()==Bminor){
			c = num1 - num2;
		}
		String result = String.valueOf(c); // 연산결과인 정수형 변수인 C 를 문자열 result로 바꾸어 준다
		TFresult.setText(result); //setText(String) 이기 때문에 파라미터는 문자열 이어야 한다
	}
	
	
	
	public static void main(String args[]){
		TextFieldExample_with_ActionListener TA = new TextFieldExample_with_ActionListener();
	}

}
