package make_List;

import java.awt.*;
import java.awt.event.*;

public class ListExample_with_ActionListener extends Frame implements ActionListener{
	Label L_state;
	List L1, L2;
	Button B_show;
	
	ListExample_with_ActionListener(){
		super("황민선씨");
		
		L_state = new Label("State display : ");
		L_state.setBounds(100, 20, 800, 100);
		
		L1 = new List(4, false); // ???
		L1.setBounds(100, 150, 70, 70);
		L1.add("C");
		L1.add("C++");
		L1.add("JAVA");
		L1.add("PHP");
		
		L2 = new List(4, true);
		L2.setBounds(100, 250, 70, 70);
		L2.add("Turbo C++");
		L2.add("Spring");
		L2.add("Hibernate");
		L2.add("CodeIgniter");
		
		B_show = new Button("Show");
		B_show.setBounds(200, 200, 80, 30);
		B_show.addActionListener(this);  // 버튼을 누르면 이벤트가 실행되므로 버튼에다가 추가
		
		setSize(800, 800);
		setLayout(null);
		setVisible(true);
		
		add(L_state);
		add(L1);
		add(L2);
		add(B_show);
		
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
		
		try{  // 에러가 아닐시에 수행할 문장
			String data = "Programming language Selected : " + L1.getItem(L1.getSelectedIndex());
			data += ", Framework Selected : ";  // getSelecedIndex() 함수를 통해 선택한 데이터의 Index 값을 리턴받아 getItem() 함수의 인수로 넘기면 텍스트 값을 가져올 수 있다
			
			for(String frame:L2.getSelectedItems()){ // ??????????????????????????????이거 뭔지 모르겠당
				data += frame += "  "; // 이것도 나자ㅜㅇ에 알아봐야징
				L_state.setText(data);
			}
		}
		catch(ArrayIndexOutOfBoundsException error){ // 에러가 발생하면 실행할 문장
			System.out.println("에러당");
		}
		
	}
	
	public static void main(String args[]){
		ListExample_with_ActionListener LwA = new ListExample_with_ActionListener();
	}

}
