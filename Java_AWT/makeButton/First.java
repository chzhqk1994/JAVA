package makeButton;

import java.awt.*;

public class First extends Frame{   // Frame 을 상속받는다
	First(){ // 생성자 함수
		
		Button b = new Button("날 눌러줭"); // 버튼 객체 생성
		b.setBounds(30, 100, 80, 30); // 버튼의 위치와 버튼 크기  setBounds(x, y, width, height);
		add(b); // 버튼을 프레임에 올려놓는다
		
		setSize(300, 300);  // 프레임의 사이즈를 정한다. setSize(width, height)
		setLayout(null); // 레이아웃 없음
		setVisible(true); // 프레임이 눈에 보이게 한다. 기본값으로하면 안보인다
	}
	
	public static void main(String args[]){
		First f = new First();  // 현재 클래스의 객체 생성, 이걸 해야 실행했을 때 창이 뜬다
	}
}
