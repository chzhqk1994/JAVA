// 3:19 PM

package ����ó��;

import java.awt.*;
import java.awt.event.*;

public class �Է�ȭ��_�⸻ extends Frame implements ActionListener {
	
	private final int �ټ� = 15;
	private TextField [] �й�txt, �̸�txt, �߰�txt, �⸻txt, �⼮txt, ����txt;
	private TextField �߰�����, �⸻����, �⼮����, ��������;
	private Label �߰�������, �⸻������, �⼮������, ����������;
	public TextField Aplus, Azero, Aminor, Bplus, Bzero, Bminor, Cplus, Czero, Cminor, Dplus, Dzero, Dminor;
	private Label ���̻�, ��������, ���̸��̳�, ���, ������, ���̳�, ����, ������, �����̳�, ���, ������, ���̳�, �߰�����, �⸻����, �⼮��, ������;
	
	public �Է�ȭ��_�⸻ () {
	      super ("�����ڷ� �Է�");
	      int i, x, y;
					
	      Label �й��� = new Label ("��   ��", Label.CENTER);
	      Label �̸��� = new Label ("��   ��", Label.CENTER);
	      Label �߰��� = new Label ("��   ��", Label.CENTER);
	      Label �⸻�� = new Label ("��   ��", Label.CENTER);
	      Label �⼮�� = new Label ("��   ��", Label.CENTER);
	      Label ������ = new Label ("��   ��", Label.CENTER);
					
	      �й�txt = new TextField [�ټ�];  
	      �̸�txt = new TextField [�ټ�];
	      �߰�txt = new TextField [�ټ�];  
	      �⸻txt = new TextField [�ټ�];
	      �⼮txt = new TextField [�ټ�];  
	      ����txt = new TextField [�ټ�];

	      for (i = 0; i < �ټ�; i++) {
	         �й�txt [i] = new TextField (3);  
	         �̸�txt [i] = new TextField (4);
	         �߰�txt [i] = new TextField (2);  
	         �⸻txt [i] = new TextField (2);
	         �⼮txt [i] = new TextField (2);  
	         ����txt [i] = new TextField (2);
	      }

	      setLayout (null);
	      �й���.setBounds ( 10, 30, 50, 30);  
	      �̸���.setBounds ( 70, 30, 50, 30);
	      �߰���.setBounds (130, 30, 50, 30); 
	      �⸻��.setBounds (190, 30, 50, 30);
	      �⼮��.setBounds (250, 30, 50, 30);
	      ������.setBounds (310, 30, 50, 30);
					
	      x = 10;  y = 70;
	      for (i = 0; i < �ټ�; i++) {
	         �й�txt [i].setBounds (x, y, 50, 20);       
	         �̸�txt [i].setBounds (x + 60, y, 50, 20);
	         �߰�txt [i].setBounds (x + 120, y, 30, 20); 
	         �⸻txt [i].setBounds (x + 190, y, 30, 20);
	         �⼮txt [i].setBounds (x + 250, y, 30, 20);  
	         ����txt [i].setBounds (x + 310, y, 30, 20);
	         y = y + 25;
	      }

	      add (�й���);
	      add (�̸���);
	      add (�߰���);  
	      add (�⸻��); 
	      add (�⼮��);  
	      add (������);
	      
	      for (i = 0; i < �ټ�; i++) {
	         add (�й�txt [i]);  
	         add (�̸�txt [i]);  
	         add (�߰�txt [i]);
	         add (�⸻txt [i]);  
	         add (�⼮txt [i]); 
	         add (����txt [i]);
	      }
				
			���̻� = new Label ("A+");
			�������� = new Label ("A0");
			���̸��̳� = new Label ("A-");
			��� = new Label ("B+");
			������ = new Label ("B0");
			���̳� = new Label ("B-");
			���� = new Label ("C+");
			������ = new Label ("C0");
			�����̳� = new Label ("C-");
			��� = new Label ("D+");
			������ = new Label ("D0");
			���̳� = new Label ("D-");
			
			���̻�.setBounds (15, 500, 30, 18);
			��������.setBounds (15, 530, 30, 18);
			���̸��̳�.setBounds (15, 560, 30, 18);
			���.setBounds (15, 590, 30, 18);
			������.setBounds (15, 620, 30, 18);
			���̳�.setBounds (15, 650, 30, 18);
			����.setBounds (200, 500, 30, 18);
			������.setBounds (200, 530, 30, 18);
			�����̳�.setBounds (200, 560, 30, 18);
			���.setBounds (200, 590, 30, 18);
			������.setBounds (200, 620, 30, 18);
			���̳�.setBounds (200, 650, 30, 18);
			
			add (���̻�);
			add (��������);
			add (���̸��̳�);
			add (���);
			add (������);
			add (���̳�);
			add (����);
			add (������);
			add (�����̳�);
			add (���);
			add (������);
			add (���̳�);
			
			Aplus = new TextField ();
			Azero = new TextField ();
			Aminor = new TextField ();
			Bplus = new TextField ();
			Bzero = new TextField ();
			Bminor = new TextField ();
			Cplus = new TextField ();
			Czero = new TextField ();
			Cminor = new TextField ();
			Dplus = new TextField ();
			Dzero = new TextField ();
			Dminor = new TextField ();
			
			Aplus.setBounds (50, 500, 30, 25);
			Azero.setBounds (50, 530, 30, 25);
			Aminor.setBounds (50, 560, 30, 25);
			Bplus.setBounds (50, 590, 30, 25);
			Bzero.setBounds (50, 620, 30, 25);
			Bminor.setBounds (50, 650, 30, 25);
			Cplus.setBounds (230, 500, 30, 25);
			Czero.setBounds (230, 530, 30, 25);
			Cminor.setBounds (230, 560, 30, 25);
			Dplus.setBounds (230, 590, 30, 25);
			Dzero.setBounds (230, 620, 30, 25);
			Dminor.setBounds (230, 650, 30, 25);
			
			add (Aplus);
			add (Azero);
			add (Aminor);
			add (Bplus);		
			add (Bzero);
			add (Bminor);
			add (Cplus);
			add (Czero);
			add (Cminor);
			add (Dplus);
			add (Dzero);
			add (Dminor);
	      
	      �߰������� = new Label ("�߰�����");
	      �⸻������ = new Label ("�⸻����");
	      �⼮������ = new Label ("�⼮����");
	      ���������� = new Label ("��������");
	      
	      �߰�������.setBounds (10, 700, 50, 30);
	      �⸻������.setBounds (80, 700, 50, 30);
	      �⼮������.setBounds (150, 700, 50, 30);
	      ����������.setBounds (220, 700, 50, 30);
	      
	      add (�߰�������);
	      add (�⸻������);
	      add (�⼮������);
	      add (����������);

	      �߰����� = new TextField ();
	      �⸻���� = new TextField ();
	      �⼮���� = new TextField ();
	      �������� = new TextField ();
	      
	      �߰�����.setBounds (10, 730, 50, 20);
	      �⸻����.setBounds (80, 730, 50, 20);
	      �⼮����.setBounds (150, 730, 50, 20);
	      ��������.setBounds (220, 730, 50, 20);
	      
	      add (�߰�����);
	      add (�⸻����);
	      add (�⼮����);
	      add (��������);
	      
	      Button �Ϸ���� = new Button ("�Է¿Ϸ�");
	      �Ϸ����.addActionListener (this);
	      �Ϸ����.setBounds (300, 730, 60, 25);
	      add (�Ϸ����);
	      
	      addWindowListener (new WindowAdapter () {
	         public void windowClosing (WindowEvent we) {
	            dispose ();
	         }
	      });
	   }

	@Override
	public void actionPerformed (ActionEvent arg0) {
		// TODO Auto-generated method stub
		���ȭ��_�⸻ output = new ���ȭ��_�⸻ (�й�txt, �̸�txt, �߰�txt, �⸻txt, �⼮txt, ����txt,
									�߰�����.getText (), �⸻����.getText (), �⼮����.getText (), ��������.getText (),
									Aplus, Azero, Aminor, Bplus, Bzero, Bminor, Cplus, Czero, Cminor, Dplus, Dzero, Dminor);
	}

   public static void main (String [] args) {
      Frame f = new Frame ();
      �Է�ȭ��_�⸻ c = new �Է�ȭ��_�⸻ ();
			      
      c.setSize      (400, 900);
      c.setResizable (false);
      c.setVisible   (true);
   }
}
