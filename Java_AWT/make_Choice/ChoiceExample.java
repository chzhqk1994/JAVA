package make_Choice;

import java.awt.*;
import java.awt.event.*;

public class ChoiceExample extends Frame{
	Choice c; // ���� ������ �� �����̹Ƿ� �ϳ��� ����(�� ���Ҹ�����)
	
	ChoiceExample(){
		c = new Choice();
		c.setBounds(100, 100, 75, 75); // ���� â �ȿ� ����� ��������Ƿ� ���� â�� ��ġ�� ũ�⸦ �����Ѵ�
		
		c.add("Item 1"); // ���� â�� �� ��ϵ��� �߰�
		c.add("Item 2");
		c.add("Item 3");
		c.add("Item 4");
		c.add("Item 5");
		
		add(c); // �����ӿ� ����â�� �ø��°͵� ���� �ʴ´�

		setSize(400, 400);
		setLayout(null);
		setVisible(true);
		
		
		// X ��ư�� ������ �� ������ �ϴ� �ڵ带 �ۼ��Ϸ���
		// import java.awt.event.*; �� �߰��ؾ� �Ѵ�.
		WindowAdapter WA = new WindowAdapter(){
			public void windowClosing(WindowEvent windowEvent){
				System.exit(0);
			}
		};
		addWindowListener(WA);
	}
		
	
	
	public static void main(String args[]){
		ChoiceExample ce = new ChoiceExample();
	}
}
