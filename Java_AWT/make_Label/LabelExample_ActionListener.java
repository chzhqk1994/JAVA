package make_Label;

import java.awt.*;
import java.awt.event.*;

// ActionListener �� ���� �����Ǹ� �˾Ƴ��� ���α׷�

public class LabelExample_ActionListener extends Frame implements ActionListener{
	Button B1;
	Label L1, L2;
	TextField TF1;
	
	
	LabelExample_ActionListener(){
		TF1 = new TextField();
		TF1.setBounds(150, 50, 150, 20);

		L1 = new Label("������ �Է� : ");
		L1.setBounds(50, 50, 250, 20);
		
		L2 = new Label();
		L2.setBounds(50, 100, 250, 20);
		
		B1 = new Button("�����Ǹ� �˾ƺ���");
		B1.setBounds(50, 150, 120, 30);
		B1.addActionListener(this);  // ��ư�� ������ ���� ������ �� �ְ� �Ѵ�.
		
		add(TF1);
		add(L1);
		add(L2);
		add(B1);
		
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
	}

	
	
	@Override
	public void actionPerformed(ActionEvent e) { // �߻��� �̺�Ʈ�� e �� �޾ƿ´�
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
