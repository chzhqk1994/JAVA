package eventHandling_by_implements_ActionListener;

import java.awt.*;
import java.awt.event.*;

// extends �� ����̴�. �θ��� �޼ҵ带 �������̵� �� �ʿ� ���� ���� ��� �����ϴ�.
// implements �̰͵� ��Ӱ����ǰ� �ٵ� �������̵� �ؼ� ��� �ϴ� ��



public class AEvent extends Frame implements ActionListener{
	
	TextField tf; // �ؽ�Ʈ �ʵ��� ��ü�� �����
	Button b; // ��ư ��ü ����
	
	AEvent(){  //������ �Լ�
		
		
		// ������Ҹ� �����(��ư, �ؽ�Ʈ �ʵ�)
		tf = new TextField(); //�ؽ�Ʈ �ʵ带 �����.
		tf.setBounds(60, 50, 170, 20);  // �ؽ�Ʈ �ʵ��� ��ġ�� ũ�� ����, setBounds(x, y, width, height);
		
		b = new Button("�� �����a"); 		// ��ư ����
		b.setBounds(100, 120, 80, 30); // ��ư�� ��ġ�� ũ�� ����
		
		// �׼� ����� �ϴ� �ڵ�
/**/	b.addActionListener(this);	 //  ��ư�� ������ �̺�Ʈ�� �߻��ϸ� this�� �ѱ��
									//�ٵ� ���⼭ this�� ��¡?
		
		// �����ӿ� ��ư�� �ؽ�Ʈ �ʵ带 �߰��ϰ� �������� ũ��� ���̾ƿ� ����
		add(b);
		add(tf);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}
	
		// �׼� ����� �ϴ� �ڵ�
/**/public void actionPerformed(ActionEvent e){ // �׼� �̺�Ʈ�� �߻��ϸ� ����� �ڵ带 ���´�.
		tf.setText("���"); // �ؽ�Ʈ �ʵ忡 "���" �� ��½�Ų��.
	}
	
	
	
	public static void main(String args[]){
		AEvent AE = new AEvent();
	}

}
