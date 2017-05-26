package make_Label;

import java.awt.*;

public class LabelExample extends Frame{ //프레임을 상속받음
	Label L1, L2; // 라벨 객체 L1, L2 를 생성함
	
	LabelExample(){	//생성자 함수
		L1 = new Label("First Label"); //라벨이름과 위치와 크기를 지정
		L1.setBounds(50, 100, 100, 30); // 크기가 충분하지 않을 경우 텍스트가 잘린다
		
		L2 = new Label("Second Label");
		L2.setBounds(50, 150, 100, 30);
		
		add(L1); // 프레임에 라벨 추가
		add(L2);
		
		setSize(400, 400);  // 프레임 속성 지정
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String args[]){
		LabelExample LE = new LabelExample();
	}

}
