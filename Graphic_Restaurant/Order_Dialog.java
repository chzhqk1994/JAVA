import java.awt.*;
import java.awt.event.*;

public class Order_Dialog extends Frame implements ActionListener{
	Dialog order;
	Label order_data;
	Button clear;
	
	Order_Dialog(String data){
		
		order = new Dialog(this);
		
		order_data = new Label();
		order_data.setText(data);
		order_data.setBounds(100, 50, 200, 30);
		
		clear = new Button("»Æ¿Œ");
		clear.setBounds(120, 100, 60, 30);
		clear.addActionListener(this);
		
		add(order_data);
		add(clear);
		setSize(300,200);
		setLayout(null);
		setVisible(true);
		
        WindowAdapter WA = new WindowAdapter(){
        	public void windowClosing(WindowEvent windowEvent) {
              setVisible(false);
        	}
        };
        addWindowListener(WA);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setVisible(false);
	}
}
