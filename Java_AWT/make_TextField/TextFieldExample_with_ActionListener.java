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
		
		Bplus = new Button("���ϱ�");
		Bplus.setBounds(50, 200, 100, 30);
		Bplus.addActionListener(this);
		
		Bminor = new Button("����");
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
	
	
	
	
	// ��ư�� �ΰ����� ���� �Լ��� �ϳ��̴�. �ȿ��� if ������ ������.
	@Override
	public void actionPerformed(ActionEvent e) { // �߻��� �̺�Ʈ�� e�� �޾ƿ´�
		// TODO Auto-generated method stub
		String s1 = TF1.getText(); // �ؽ�Ʈ�ʵ�1 ���� �Ѿ�� ���ڿ��� �޴´�(���ڵ� �ϴ� ���ڿ��� �޴´�)
		String s2 = TF2.getText();
		
		int num1 = Integer.parseInt(s1); // ���� ���ڿ��� ���ڷ� �ٲپ� �ش�(�̷��� �Ҽ��ۿ� ���µ�)
		int num2 = Integer.parseInt(s2);
		int c = 0; // ����� ������ ����
		
		if(e.getSource()==Bplus){
			c = num1 + num2;
		}
		else if(e.getSource()==Bminor){
			c = num1 - num2;
		}
		String result = String.valueOf(c); // �������� ������ ������ C �� ���ڿ� result�� �ٲپ� �ش�
		TFresult.setText(result); //setText(String) �̱� ������ �Ķ���ʹ� ���ڿ� �̾�� �Ѵ�
	}
	
	
	
	public static void main(String args[]){
		TextFieldExample_with_ActionListener TA = new TextFieldExample_with_ActionListener();
	}

}
