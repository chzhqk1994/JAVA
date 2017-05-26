package make_Label;

import java.awt.*;
import java.awt.event.*;

// ActionListener 를 통해 아이피를 알아내는 프로그램

public class LabelExample_ActionListener extends Frame implements ActionListener{
	Button B1;
	Label L1, L2;
	TextField TF1;
	
	
	LabelExample_ActionListener(){
		TF1 = new TextField();
		TF1.setBounds(150, 50, 150, 20);

		L1 = new Label("도메인 입력 : ");
		L1.setBounds(50, 50, 250, 20);
		
		L2 = new Label();
		L2.setBounds(50, 100, 250, 20);
		
		B1 = new Button("아이피를 알아보자");
		B1.setBounds(50, 150, 120, 30);
		B1.addActionListener(this);  // 버튼을 눌렀을 때의 반응할 수 있게 한다.
		
		add(TF1);
		add(L1);
		add(L2);
		add(B1);
		
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
	}

	
	
	@Override
	public void actionPerformed(ActionEvent e) { // 발생한 이벤트를 e 로 받아온다
		// TODO Auto-generated method stub
		
		try{
			String host = TF1.getText();
			String ip = java.net.InetAddress.getByName(host).getHostAddress();
			L2.setText("IP of " + host + " is " + ip);
		}catch(Exception ex){System.out.println(ex);}
	}
	
	public static void main(String args[]){
		LabelExample_ActionListener LA = new LabelExample_ActionListener();
	}

}
