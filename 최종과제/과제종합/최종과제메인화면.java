package ��������;


import java.awt.*;
import java.awt.event.*;

import ù��°����.*;
import �ι�°����.*;
import ����°����.*;
import �׹�°����.*;
import �ټ���°����.*;
import �Ĵ�������α׷�����.*;

class ������������ȭ�� extends Frame implements ActionListener{
	private MenuBar �޴���;
	private Menu �޴�;
	private Menu i1, i2, i3, i4, i5, i6;
	private MenuItem i1_1, i2_1, i2_2, i3_1, i3_2, i4_1, i4_2, i5_1, i6_1;
	private Label ����;
	
	private ù��°���� ù��°;
	private ����2_1 �ι�°_1;
	private ����2_2 �ι�°_2;
	private ����3_1 ����°_1;
	private ����3_2 ����°_2;
	private ����4_1 �׹�°_1;
	private ����4_2 �׹�°_2;
	private ����5 �ټ���°;
	private ����6 ������°;
	
	������������ȭ�� (){  
		super("2013108193 ������ ���հ���");
		�޴���=new MenuBar ();  
		
		�޴� = new Menu ("�����������α׷��� ����");  
		
		i1=new Menu ("1�� ���� ");
		i1_1 = new MenuItem ("200��,300��,500������ 10000���� ���� �� �ִ� ��츦 ����Ͻÿ�");
		i1_1.addActionListener (this);
		i1.add (i1_1);
		
		i2 = new Menu ("2�� ����");
		i2_1 = new MenuItem ("3���� ���� �Է¹޾� ���� ū ���� �ι�°�� ū ���� ����ϴ� ���α׷�");
		i2_1.addActionListener (this);
		i2_2 = new MenuItem ("2���� ���� �Է¹޾� ��Ģ������ �ϰ� ū ���� ����ϴ� ���α׷�");
		i2_2.addActionListener (this);
		i2.add (i2_1);
		i2.add (i2_2);
		
		i3=new Menu ("3�� ���� ");
		i3_1 = new MenuItem ("����");
		i3_1.addActionListener (this);
		i3.add (i3_1);
		
		i4=new Menu ("4�� ����");  
		i4_1 = new MenuItem ("���� ���α׷�");
		i4_1.addActionListener (this);
		i4_2 = new MenuItem ("�Ĵ� ���α׷�");
		i4_2.addActionListener (this);
		i4.add (i4_1);
		i4.add (i4_2);
		
		i5 = new Menu ("5�� ���� ");
		i5_1 = new MenuItem ("�迭�� �̿��Ͽ� ���ڵ��� ��, ���� ū ��, Ȧ���� ¦���� ����, ū ������ ����Ͻÿ�");
		i5_1.addActionListener (this);
		i5.add (i5_1);
		
		i6 = new Menu ("6 ~ 10�� ���� ");
		i6_1 = new MenuItem ("GUI�� �̿��Ͽ� ������ �ֹ����α׷� �ֹ�ȭ��� ���̺����ȭ��, ���ΰ��� ȭ���� ����ÿ�");
		i6_1.addActionListener (this);
		i6.add (i6_1);
		
		�޴�.add (i1);  
		�޴�.add (i2);  
		�޴�.add (i3);  
		�޴�.add (i4);  
		�޴�.add (i5);  
		�޴�.add (i6);  
		
		�޴���.add (�޴�);  
		setMenuBar (�޴���); 
		
		���� = new Label ("�������� ���� ���α׷� (1~5�� ����) ���� �ܼ�â�� ��Ÿ���ϴ�.");
		����.setBounds (30, 100, 350, 30);
		add (����);
		
		setSize (500,300);  
		setLayout (null);  
		setVisible (true);  
		
		addWindowListener (new WindowAdapter () {
			public void windowClosing (WindowEvent we) {
				dispose ();
			}
		});
	}  
	
	@Override
	public void actionPerformed (ActionEvent e) {
		// TODO Auto-generated method stub
		if (i1_1 == e.getSource ()){
			ù��° = new ù��°���� ();
			ù��°.main (null);
		}
		
		else if (i2_1 == e.getSource ()){
			�ι�°_1 = new ����2_1 ();
			�ι�°_1.main (null);
		}
		
		else if (i2_2 == e.getSource ()){
			�ι�°_2 = new ����2_2 ();
			�ι�°_2.main (null);
		}
		
		else if (i3_1 == e.getSource ()){
			����°_1 = new ����3_1 ();
			����°_1.main (null);
		}
		
		else if (i3_2 == e.getSource()){
			����°_2 = new ����3_2 ();
			����°_2.main (null);
		}
		
		else if (i4_1 == e.getSource ()){
			�׹�°_1 = new ����4_1 ();
			�׹�°_1.main (null);
		}
		
		else if (i4_2 == e.getSource ()){
			�׹�°_2 = new ����4_2 ();
			�׹�°_2.main (null);
		}
		
		else if (i5_1 == e.getSource ()){
			�ټ���° = new ����5 ();
			�ټ���°.main (null);
		}
		
		else if (i6_1 == e.getSource ()){
			������° = new ����6 ();
		}
			
		addWindowListener (new WindowAdapter () {
	         public void windowClosing (WindowEvent we) {
	            dispose ();
	         }
		});
	}  
	
	public static void main(String args [])  
	{  
		new ������������ȭ�� ();  
	}
}  