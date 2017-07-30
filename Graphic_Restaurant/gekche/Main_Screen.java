package gekche;
import java.awt.*;
import java.awt.event.*;
// ���ĺ� ����, �ݾ׺� ����   �Է� �ֹ��Է� ��� ���ε��â 
public class Main_Screen extends Frame implements ActionListener{

	private Button food_button, order_button;
	private MenuBar �޴���;
	private Menu ����, �Ӽ�;
	private MenuItem i1, i2, i3;
	
	Main_Screen(){
		super("�ֹ� ���α׷�");
		
		�޴��� = new MenuBar();
		���� = new Menu("����");
		�Ӽ� = new Menu("�Ӽ�");
			i1 = new MenuItem("������1");
			i2 = new MenuItem("������2");
			i3 = new MenuItem("������3");
		
		����.add(i1);
		����.add(i2);
		�Ӽ�.add(i3);

		�޴���.add(����);
		�޴���.add(�Ӽ�);
		
		setMenuBar(�޴���);
		
		food_button = new Button("�޴�����");
		food_button.setBounds(100, 150, 80, 50);
		food_button.addActionListener(this);
		
		order_button = new Button("�ֹ�");
		order_button.setBounds(200, 150, 80, 50);
		order_button.addActionListener(this);
		
		add(food_button);
		add(order_button);
		
		setSize(800,600);
		setLayout(null);
		setVisible(true);
		
		WindowAdapter WA = new WindowAdapter(){
			public void windowClosing(WindowEvent windowEvent){
				System.exit(0);
			}
		};
		addWindowListener(WA);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == order_button){
			Order_Screen order = new Order_Screen();
		}
		else if (e.getSource() == food_button){
			Menu_Screen ms = new Menu_Screen();
		}
	}
	
	public static void main(String args[]){
		new Main_Screen();
	}
}
