package ����ó��;

import java.awt.*;
import java.awt.event.*;

public class ���ȭ��_�⸻ extends Frame implements ActionListener {
   private final int �ټ� = 15;
   private Label [] �й�ǥ��, �̸�ǥ��, �߰�ǥ��, �⸻ǥ��, �⼮ǥ��, ����ǥ��, �Ѱ�ǥ��, ����ǥ��;
   private int ���� [];
   private ���Ŭ����_�⸻ �������ϱ�;
   
   ���ȭ��_�⸻ (TextField [] �й�txt, TextField [] �̸�txt, TextField [] �߰�txt, TextField [] �⸻txt, TextField [] �⼮txt, TextField [] ����txt, String �߰�����, String �⸻����, String �⼮����, String ��������,
		   TextField Aplus, TextField Azero, TextField Aminor, TextField Bplus, TextField Bzero, TextField Bminor, TextField Cplus, TextField Czero, TextField Cminor, TextField Dplus, TextField Dzero, TextField Dminor){
	  
	  super ("�������");
      int i, x, y;
				
      Label �й��� = new Label ("��   ��", Label.CENTER);
      Label �̸��� = new Label ("��   ��", Label.CENTER);
      Label �߰��� = new Label ("��   ��", Label.CENTER);
      Label �⸻�� = new Label ("��   ��", Label.CENTER);
      Label �⼮�� = new Label ("��   ��", Label.CENTER);
      Label ������ = new Label ("��   ��", Label.CENTER);
      Label �Ѱ�� = new Label ("��   ��", Label.CENTER);
      Label ������ = new Label ("��   ��", Label.CENTER);
				
      �й�ǥ�� = new Label [�ټ�]; 
      �̸�ǥ�� = new Label [�ټ�];
      �߰�ǥ�� = new Label [�ټ�];  
      �⸻ǥ�� = new Label [�ټ�];
      �⼮ǥ�� = new Label [�ټ�];
      ����ǥ�� = new Label [�ټ�];
      �Ѱ�ǥ�� = new Label [�ټ�]; 
      ����ǥ�� = new Label [�ټ�];

      for (i = 0; i < �ټ�; i++) {
         �й�ǥ�� [i] = new Label ();
         �̸�ǥ�� [i] = new Label ();
         �߰�ǥ�� [i] = new Label ();
         �⸻ǥ�� [i] = new Label ();
         �⼮ǥ�� [i] = new Label ();
         ����ǥ�� [i] = new Label ();
         �Ѱ�ǥ�� [i] = new Label ();
         ����ǥ�� [i] = new Label ();
      }
      
      Button Ȯ�δ��� = new Button ("Ȯ�οϷ�");
      Ȯ�δ���.addActionListener (this);

      setLayout (null);
      �й���.setBounds ( 10, 30, 50, 30); 
      �̸���.setBounds ( 70, 30, 50, 30);
      �߰���.setBounds (130, 30, 50, 30); 
      �⸻��.setBounds (190, 30, 50, 30);
      �⼮��.setBounds (250, 30, 50, 30);
      ������.setBounds (310, 30, 50, 30);
      �Ѱ��.setBounds (370, 30, 50, 30);
      ������.setBounds (440, 30, 50, 30);
				
      x = 10;  y = 70;
      for (i = 0; i < �ټ�; i++) {
         �й�ǥ�� [i].setBounds (x, y, 50, 20);       
         �̸�ǥ�� [i].setBounds (x + 60, y, 50, 20);
         �߰�ǥ�� [i].setBounds (x + 120, y, 30, 20); 
         �⸻ǥ�� [i].setBounds (x + 190, y, 30, 20);
         �⼮ǥ�� [i].setBounds (x + 250, y, 30, 20);  
         ����ǥ�� [i].setBounds (x + 310, y, 30, 20);
         �Ѱ�ǥ�� [i].setBounds (x + 370, y, 30, 20);
         ����ǥ�� [i].setBounds (x + 440, y, 30, 20);
         y = y + 25;
      }
      Ȯ�δ���.setBounds (220, 450, 60, 25);
      
      // �Է�â���� ���� ������ ������ִ� �ڵ�
      for (i =0; i < �ټ�; i++){
    	  �й�ǥ�� [i].setText (�й�txt [i].getText ());
    	  �̸�ǥ�� [i].setText (�̸�txt [i].getText ());
    	  �߰�ǥ�� [i].setText (�߰�txt [i].getText ());
    	  �⸻ǥ�� [i].setText (�⸻txt [i].getText ());
    	  �⼮ǥ�� [i].setText (�⼮txt [i].getText ());
    	  ����ǥ�� [i].setText (����txt [i].getText ());
      }
      
      // �� ������ �ݿ������� ����Ͽ� �Ѿ��� ���
      int ��� = 0;
      ���� = new int [�ټ�];
      �������ϱ� = new ���Ŭ����_�⸻ ();
      
      for (i = 0; i < �ټ�; i++){

    	 ��� = �������ϱ�.������� (�й�txt [i], �̸�txt [i], �߰�txt [i], �⸻txt [i], �⼮txt [i], ����txt [i], �߰�����, �⸻����, �⼮����, ��������);

    	  ���� [i] = ���; // String �� �迭�� ������ ���ڿ��� ��ȯ�� �Ѱ踦 ����

    	  String �Ѱ蹮�ڿ� = Integer.toString (���); //int���� "�Ѱ�" �� String ������ �ٲ���    	  
    	  �Ѱ�ǥ�� [i].setText (�Ѱ蹮�ڿ�);  // ���� ����� ȭ�鿡 ǥ��
      }
      
      // �Ѿ��� �������� ���� ���
      String ����;
      for (i = 0; i < �ټ�; i++){
    	  ���� = �������ϱ�.������� (���� [i], Aplus.getText (), Azero.getText (), Aminor.getText (), Bplus.getText (), Bzero.getText (), Bminor.getText (), Cplus.getText (), Czero.getText (), Cminor.getText (), Dplus.getText (), Dzero.getText (), Dminor.getText ());
    	 
    	  ����ǥ�� [i].setText (����); // ���� ������ Label�� ���ȭ�鿡 ǥ��
      }
      
      
      add (�й���);  
      add (�̸���);
      add (�߰���);  
      add (�⸻��);
      add (�⼮��); 
      add (������);
      add (�Ѱ��);  
      add (������);

      for (i = 0; i < �ټ�; i++) {
         add (�й�ǥ�� [i]); 
         add (�̸�ǥ�� [i]);  
         add (�߰�ǥ�� [i]);
         add (�⸻ǥ�� [i]);  
         add (�⼮ǥ�� [i]); 
         add (����ǥ�� [i]);
         add (�Ѱ�ǥ�� [i]);
         add (����ǥ�� [i]);
      }
      add (Ȯ�δ���);
				
      addWindowListener (new WindowAdapter () {
         public void windowClosing (WindowEvent we) {
            dispose ();
         }
      });
      
      setSize     (600, 500);
      setLocation (400, 400);
      setResizable(false);
      setVisible  (true);
   }
   
			
   public void actionPerformed (ActionEvent e) {
	   setVisible (false);
   }

}