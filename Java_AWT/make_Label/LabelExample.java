package make_Label;

import java.awt.*;

public class LabelExample extends Frame{ //�������� ��ӹ���
	Label L1, L2; // �� ��ü L1, L2 �� ������
	
	LabelExample(){	//������ �Լ�
		L1 = new Label("First Label"); //���̸��� ��ġ�� ũ�⸦ ����
		L1.setBounds(50, 100, 100, 30); // ũ�Ⱑ ������� ���� ��� �ؽ�Ʈ�� �߸���
		
		L2 = new Label("Second Label");
		L2.setBounds(50, 150, 100, 30);
		
		add(L1); // �����ӿ� �� �߰�
		add(L2);
		
		setSize(400, 400);  // ������ �Ӽ� ����
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String args[]){
		LabelExample LE = new LabelExample();
	}

}
