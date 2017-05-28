package make_CheckBox;

import java.awt.*;
import java.awt.event.*;

public class CheckboxGroupExample extends Frame{
	CheckboxGroup group; // üũ�ڽ� �׷�� üũ�ڽ� ��ü���� ��� ����
	Checkbox cb1;
	Checkbox cb2;
	
	CheckboxGroupExample(){
		super("Window's Name");  // ������ â�� �̸��� ���Ѵ�
		
		group = new CheckboxGroup();
		
		cb1 = new Checkbox("C++", group, false); // üũ�ڽ��� �̸��� �׷�, ���¸� �����Ѵ�
		cb1.setBounds(100, 100, 50, 50);
		
		cb2 = new Checkbox("JAVA", group, false); // �ʱ���´� ��� �ڽ��� üũ���� ���� ���¿��� ��� ����
		cb2.setBounds(100, 150, 50, 50);
		
		add(cb1); // �׷찴ü�� �߰����� �ʴ´�!!!
		add(cb2);
		
		setSize(400, 400);
		setLayout(null);
		setVisible(true);

		
        WindowAdapter WA = new WindowAdapter(){    //�������� X ��ư�� ������ ������ �Ѵ�.
        	public void windowClosing(WindowEvent windowEvent) {
              System.exit(0);
        	}
        };
    addWindowListener(WA);
	}
	
	public static void main(String args[]){
		CheckboxGroupExample CGE = new CheckboxGroupExample();
	}
}
