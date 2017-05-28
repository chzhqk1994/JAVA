package make_CheckBox;

import java.awt.*;
import java.awt.event.*;

public class CheckboxExample_ItemListener extends Frame implements ItemListener{
	Label select;
	Checkbox cb1, cb2;
	
	CheckboxExample_ItemListener(){
		select = new Label("Selected subject : ");
		select.setAlignment(Label.CENTER); // ���� ��ġ�� ����� ����
		select.setSize(400, 100); //setSize(width, height);
		
		cb1 = new Checkbox("C++");
		cb1.setBounds(100, 100, 50, 50);
		cb1.addItemListener(this); // ActionListener ó�� ����ϸ� �� �� ����.
		
		cb2 = new Checkbox("JAVA");
		cb2.setBounds(100, 150, 50, 50);
		cb2.addItemListener(this);
		
		add(select);
		add(cb1);
		add(cb2);
		
		setSize(400,400);
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
		CheckboxExample_ItemListener ci = new CheckboxExample_ItemListener();
	}



	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==cb1){ // C++ üũ�ڽ����� �̺�Ʈ�� �߻��ϸ� �Ʒ��� ������ ����
			select.setText("C++ Checkbox : " + (e.getStateChange()==1 ? "Checked" : "Unchecked"));
		}
		else if(e.getSource()==cb2){ // JAVA üũ�ڽ����� �̺�Ʈ�� �߻��ϸ� �Ʒ��� ������ ����
			select.setText("JAVA checkbox : " + (e.getStateChange()==1 ? "Chcked" : "Unchekced"));
		} // (���� ? �� : ����) ������ ���̸� ���� ����, �����̸� ������ ����
	}
	
	
	
	
}
