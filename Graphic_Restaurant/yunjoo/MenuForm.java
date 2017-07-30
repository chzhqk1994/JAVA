package yunjoo;

import java.awt.*;
import java.awt.event.*;

public class MenuForm extends Frame implements ActionListener, ItemListener{
  private Label label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12;
  private TextField 고기국수, 콩국수, 멸치국수, 순대국밥, 돼지국밥, 해물탕, 
                    매운탕, 해물파전;
  private Button btn, btn2;
  private Controller con;
	
  public MenuForm(Controller con){
    super("주문표");   	
    this.con = con;
	    	
    setSize(430,450);
    setLayout(null);
    setVisible(true);
	    	
    label1 = new Label("주문표");
    label2 = new Label("고기국수");
    label3 = new Label("콩국수");
    label4 = new Label("돼지국밥");
    label5 = new Label("매운탕");
    label6 = new Label("멸치국수");
    label7 = new Label("순대국밥");
    label8 = new Label("해물탕");
    label9 = new Label("해물파전");
	        
    label10 = new Label("합계: 0 원");
    label11 = new Label("할인액: 0 원");
    label12 = new Label("수령액: 0 원");
	        
    고기국수 = new TextField(8); 고기국수.setText("0");
    콩국수 = new TextField(8); 콩국수.setText("0");
    멸치국수 = new TextField(8); 멸치국수.setText("0");
    순대국밥 = new TextField(8); 순대국밥.setText("0");
    돼지국밥 = new TextField(8); 돼지국밥.setText("0");
    해물탕 = new TextField(8); 해물탕.setText("0");
    매운탕 = new TextField(8); 매운탕.setText("0");
    해물파전 = new TextField(8); 해물파전.setText("0");
	        
    btn = new Button("계산");
    btn2 = new Button("돌아가기");
      
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

    label2.setBounds(50, 60, 80, 30); 고기국수.setBounds(140, 65, 30, 20);
    label3.setBounds(50, 90, 80, 30); 콩국수.setBounds(140, 95, 30, 20);
    label4.setBounds(50, 120, 80, 30); 돼지국밥.setBounds(140, 125, 30, 20);
    label5.setBounds(50, 150, 80, 30); 매운탕.setBounds(140, 155, 30, 20);
	        
    label6.setBounds(200, 60, 80, 30); 멸치국수.setBounds(290, 65, 30, 20);
    label7.setBounds(200, 90, 80, 30); 순대국밥.setBounds(290, 95, 30, 20);
    label8.setBounds(200, 120, 80, 30); 해물탕.setBounds(290, 125, 30, 20);
    label9.setBounds(200, 150, 80, 30); 해물파전.setBounds(290, 155, 30, 20);
	        
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
	        
    add(고기국수); add(멸치국수);
    add(콩국수); add(순대국밥);
    add(돼지국밥); add(해물탕);
    add(매운탕); add(해물파전);
	       
    add(btn); add(btn2);
  }

  public void output(){
    int 합계, 할인액, 수령액;
    	
    합계 = con.합계;
    할인액 = con.할인액;
    수령액 = con.수령액;
	    	
    label10.setText("합계: " + 합계 + " 원");
    label11.setText("할인액: " + 할인액 + " 원");
    label12.setText("수령액: " + 수령액 + " 원");
  }
	    
  public void reset(){
    고기국수.setText("0"); 콩국수.setText("0");
    멸치국수.setText("0"); 순대국밥.setText("0");
    돼지국밥.setText("0"); 해물탕.setText("0");
    매운탕.setText("0");   해물파전.setText("0");
	        
    label10.setText("합계: 0 원");
    label11.setText("할인액: 0 원");
    label12.setText("수령액: 0 원");
  }
	    
  public void itemStateChanged(ItemEvent ie){ }
  public void actionPerformed(ActionEvent e) {
    if(e.getActionCommand() == "계산") {
      int 고기국수수, 멸치국수수, 콩국수수, 순대국밥수, 
          해물탕수, 매운탕수, 해물파전수,돼지국밥수;
            	
      고기국수수 = Integer.parseInt(고기국수.getText());
      멸치국수수 = Integer.parseInt(멸치국수.getText());
      콩국수수 = Integer.parseInt(콩국수.getText());
      순대국밥수 = Integer.parseInt(순대국밥.getText());
      해물탕수 = Integer.parseInt(해물탕.getText());
      해물파전수 = Integer.parseInt(해물파전.getText());
      돼지국밥수 = Integer.parseInt(돼지국밥.getText());
      매운탕수 = Integer.parseInt(매운탕.getText());
            	
      con.set개수(고기국수수, 멸치국수수, 콩국수수, 순대국밥수, 해물탕수, 해물파전수, 		매운탕수, 돼지국밥수);
      con.계산();
      output();
    }
    else if(e.getActionCommand() == "돌아가기") {
      reset();
    }
  }

  public static void main(String args[]) {
    new MenuForm(new Controller());
  }
}