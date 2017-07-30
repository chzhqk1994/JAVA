package gekche;
import java.awt.*;
import java.awt.event.*;
// 음식별 할인, 금액별 할인   입력 주문입력 출력 할인등록창 
public class Main_Screen extends Frame implements ActionListener{

	private Button food_button, order_button;
	private MenuBar 메뉴바;
	private Menu 파일, 속성;
	private MenuItem i1, i2, i3;
	
	Main_Screen(){
		super("주문 프로그램");
		
		메뉴바 = new MenuBar();
		파일 = new Menu("파일");
		속성 = new Menu("속성");
			i1 = new MenuItem("아이템1");
			i2 = new MenuItem("아이템2");
			i3 = new MenuItem("아이템3");
		
		파일.add(i1);
		파일.add(i2);
		속성.add(i3);

		메뉴바.add(파일);
		메뉴바.add(속성);
		
		setMenuBar(메뉴바);
		
		food_button = new Button("메뉴보기");
		food_button.setBounds(100, 150, 80, 50);
		food_button.addActionListener(this);
		
		order_button = new Button("주문");
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
