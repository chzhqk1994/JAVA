package yunjoo;

import java.awt.*;
import java.awt.event.*;

public class MenuForm extends Frame implements ActionListener, ItemListener{
  private Label label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12;
  private TextField ��ⱹ��, �ᱹ��, ��ġ����, ���뱹��, ��������, �ع���, 
                    �ſ���, �ع�����;
  private Button btn, btn2;
  private Controller con;
	
  public MenuForm(Controller con){
    super("�ֹ�ǥ");   	
    this.con = con;
	    	
    setSize(430,450);
    setLayout(null);
    setVisible(true);
	    	
    label1 = new Label("�ֹ�ǥ");
    label2 = new Label("��ⱹ��");
    label3 = new Label("�ᱹ��");
    label4 = new Label("��������");
    label5 = new Label("�ſ���");
    label6 = new Label("��ġ����");
    label7 = new Label("���뱹��");
    label8 = new Label("�ع���");
    label9 = new Label("�ع�����");
	        
    label10 = new Label("�հ�: 0 ��");
    label11 = new Label("���ξ�: 0 ��");
    label12 = new Label("���ɾ�: 0 ��");
	        
    ��ⱹ�� = new TextField(8); ��ⱹ��.setText("0");
    �ᱹ�� = new TextField(8); �ᱹ��.setText("0");
    ��ġ���� = new TextField(8); ��ġ����.setText("0");
    ���뱹�� = new TextField(8); ���뱹��.setText("0");
    �������� = new TextField(8); ��������.setText("0");
    �ع��� = new TextField(8); �ع���.setText("0");
    �ſ��� = new TextField(8); �ſ���.setText("0");
    �ع����� = new TextField(8); �ع�����.setText("0");
	        
    btn = new Button("���");
    btn2 = new Button("���ư���");
      
    formLocation();
    addFrame();
	        
    btn.addActionListener(this);
    btn2.addActionListener(this);
	        
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        dispose();
      }
    });
  }
	    
  public void formLocation(){
    label1.setBounds(180, 30, 100, 30);

    label2.setBounds(50, 60, 80, 30); ��ⱹ��.setBounds(140, 65, 30, 20);
    label3.setBounds(50, 90, 80, 30); �ᱹ��.setBounds(140, 95, 30, 20);
    label4.setBounds(50, 120, 80, 30); ��������.setBounds(140, 125, 30, 20);
    label5.setBounds(50, 150, 80, 30); �ſ���.setBounds(140, 155, 30, 20);
	        
    label6.setBounds(200, 60, 80, 30); ��ġ����.setBounds(290, 65, 30, 20);
    label7.setBounds(200, 90, 80, 30); ���뱹��.setBounds(290, 95, 30, 20);
    label8.setBounds(200, 120, 80, 30); �ع���.setBounds(290, 125, 30, 20);
    label9.setBounds(200, 150, 80, 30); �ع�����.setBounds(290, 155, 30, 20);
	        
    label10.setBounds(60, 200, 100, 30);
    label11.setBounds(200, 200, 100, 30);
	        
    label12.setBounds(100, 250, 100, 30);
	        
    btn.setBounds(100,290,100,30); btn2.setBounds(200,290,100,30);
  }	    
  public void addFrame() {
    add(label1); add(label2);
    add(label3); add(label4);
    add(label5); add(label6);
    add(label7); add(label8);
    add(label9); add(label10);
    add(label11); add(label12);
	        
    add(��ⱹ��); add(��ġ����);
    add(�ᱹ��); add(���뱹��);
    add(��������); add(�ع���);
    add(�ſ���); add(�ع�����);
	       
    add(btn); add(btn2);
  }

  public void output(){
    int �հ�, ���ξ�, ���ɾ�;
    	
    �հ� = con.�հ�;
    ���ξ� = con.���ξ�;
    ���ɾ� = con.���ɾ�;
	    	
    label10.setText("�հ�: " + �հ� + " ��");
    label11.setText("���ξ�: " + ���ξ� + " ��");
    label12.setText("���ɾ�: " + ���ɾ� + " ��");
  }
	    
  public void reset(){
    ��ⱹ��.setText("0"); �ᱹ��.setText("0");
    ��ġ����.setText("0"); ���뱹��.setText("0");
    ��������.setText("0"); �ع���.setText("0");
    �ſ���.setText("0");   �ع�����.setText("0");
	        
    label10.setText("�հ�: 0 ��");
    label11.setText("���ξ�: 0 ��");
    label12.setText("���ɾ�: 0 ��");
  }
	    
  public void itemStateChanged(ItemEvent ie){ }
  public void actionPerformed(ActionEvent e) {
    if(e.getActionCommand() == "���") {
      int ��ⱹ����, ��ġ������, �ᱹ����, ���뱹���, 
          �ع�����, �ſ�����, �ع�������,���������;
            	
      ��ⱹ���� = Integer.parseInt(��ⱹ��.getText());
      ��ġ������ = Integer.parseInt(��ġ����.getText());
      �ᱹ���� = Integer.parseInt(�ᱹ��.getText());
      ���뱹��� = Integer.parseInt(���뱹��.getText());
      �ع����� = Integer.parseInt(�ع���.getText());
      �ع������� = Integer.parseInt(�ع�����.getText());
      ��������� = Integer.parseInt(��������.getText());
      �ſ����� = Integer.parseInt(�ſ���.getText());
            	
      con.set����(��ⱹ����, ��ġ������, �ᱹ����, ���뱹���, �ع�����, �ع�������, 		�ſ�����, ���������);
      con.���();
      output();
    }
    else if(e.getActionCommand() == "���ư���") {
      reset();
    }
  }

  public static void main(String args[]) {
    new MenuForm(new Controller());
  }
}