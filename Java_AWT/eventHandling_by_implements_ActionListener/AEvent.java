package eventHandling_by_implements_ActionListener;

import java.awt.*;
import java.awt.event.*;

// extends 는 상속이다. 부모의 메소드를 오버라이딩 할 필요 없지 직접 사용 가능하다.
// implements 이것도 상속같은건가 근데 오버라이딩 해서 써야 하는 듯



public class AEvent extends Frame implements ActionListener{
	
	TextField tf; // 텍스트 필드의 객체를 만든다
	Button b; // 버튼 객체 생성
	
	AEvent(){  //생성자 함수
		
		
		// 구성요소를 만든다(버튼, 텍스트 필드)
		tf = new TextField(); //텍스트 필드를 만든다.
		tf.setBounds(60, 50, 170, 20);  // 텍스트 필드의 위치와 크기 지정, setBounds(x, y, width, height);
		
		b = new Button("날 눌러줭"); 		// 버튼 생성
		b.setBounds(100, 120, 80, 30); // 버튼의 위치와 크기 지정
		
		// 액션 기능을 하는 코드
/**/	b.addActionListener(this);	 //  버튼을 눌러서 이벤트가 발생하면 this를 넘긴다
									//근데 여기서 this가 뭐징?
		
		// 프레임에 버튼과 텍스트 필드를 추가하고 프레임의 크기와 레이아웃 지정
		add(b);
		add(tf);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}
	
		// 액션 기능을 하는 코드
/**/public void actionPerformed(ActionEvent e){ // 액션 이벤트가 발생하면 실행될 코드를 적는다.
		tf.setText("어서왕"); // 텍스트 필드에 "어서왕" 을 출력시킨다.
	}
	
	
	
	public static void main(String args[]){
		AEvent AE = new AEvent();
	}

}
