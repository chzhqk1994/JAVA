package makeButton;

import java.awt.*;

public class First extends Frame{   // Frame �� ��ӹ޴´�
	First(){ // ������ �Լ�
		
		Button b = new Button("�� �����a"); // ��ư ��ü ����
		b.setBounds(30, 100, 80, 30); // ��ư�� ��ġ�� ��ư ũ��  setBounds(x, y, width, height);
		add(b); // ��ư�� �����ӿ� �÷����´�
		
		setSize(300, 300);  // �������� ����� ���Ѵ�. setSize(width, height)
		setLayout(null); // ���̾ƿ� ����
		setVisible(true); // �������� ���� ���̰� �Ѵ�. �⺻�������ϸ� �Ⱥ��δ�
	}
	
	public static void main(String args[]){
		First f = new First();  // ���� Ŭ������ ��ü ����, �̰� �ؾ� �������� �� â�� ���
	}
}
