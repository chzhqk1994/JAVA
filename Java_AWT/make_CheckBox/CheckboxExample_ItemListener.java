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
		
		cb2 = new Checkbox("JAVA");
		cb2.setBounds(100, 150, 50, 50);
		
		add(select);
		add(cb1);
		add(cb2);
		
		cb1.addItemListener(new ItemListener(){ // üũ�ڽ��� ���°� �ٲ���� �� �̺�Ʈ ����
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if (e.getStateChange()==0)
					select.setText("C++ Checkbox : Checked");
				else
					select.setText("C++ Checkbox : Unchecked");
			}
		});
		
		cb2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if (e.getStateChange()==1)
					select.setText("JAVA Checkbox : Checked");
				else
					select.setText("JAVA Checkbox : Unchecked");
			}
		});
		
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}

	
	// ���ݱ��� ����ٰ� �̺�Ʈ ������ �����µ� ���⼱ �����;;
//	@Override
//	public void itemStateChanged(ItemEvent e) {
//		// TODO Auto-generated method stub
//		
//	}

	
	
	
	
}
