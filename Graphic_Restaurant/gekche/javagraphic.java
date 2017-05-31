package gekche;
import java.awt.*;
import java.awt.event.*;

public class javagraphic {
    private Frame mainFrame;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel, buttonPanel;
 
    public javagraphic() {
        prepareGUI();
    }
 
    public static void main(String[] args) {
        javagraphic awtControlDemo = new javagraphic();
        awtControlDemo.showTextField();
    }
 
    private void prepareGUI() {
        // Frame 에 대한 셋팅
        mainFrame = new Frame("식당 주문 프로그램");
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(new GridLayout(4, 1)); //레이아웃을 4행 1열로 나눔
        
        
        
        WindowAdapter WA = new WindowAdapter(){
	        	public void windowClosing(WindowEvent windowEvent) {
	              System.exit(0);
	        	}
        };
        mainFrame.addWindowListener(WA);
        

        
//        mainFrame.addWindowListener(new WindowAdapter() { // 윈도우의 X버튼을 누르면 꺼지게 한다
//            public void windowClosing(WindowEvent windowEvent) {
//                System.exit(0);
//            }
//        });
 
        
        
        
        // 상단에 있는 라벨
        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        headerLabel.setText("메뉴와 수량을 입력하세요");
 
        // 하단에 주문 결과를 표시해 준다
        statusLabel = new Label();
        statusLabel.setText("주문 결과");
        statusLabel.setAlignment(Label.CENTER);
        statusLabel.setSize(350, 100);
 
        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());
 
        buttonPanel = new Panel();
        buttonPanel.setLayout(new FlowLayout());
 
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(buttonPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }
 
    private void showTextField() {
        Label 메뉴라벨 = new Label("메뉴 : ", Label.RIGHT);
        Label 수량라벨 = new Label("수량 : ", Label.CENTER);
        final TextField 메뉴 = new TextField(6);
        final TextField 수량 = new TextField(6);
 
        Button 주문 = new Button("주문");
 
        주문.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "메뉴 : " + 메뉴.getText();
                data += ", 수량 : " + 수량.getText();
                statusLabel.setText(data);
            }
        });
 
         
        controlPanel.add(메뉴라벨);
        controlPanel.add(메뉴);
        controlPanel.add(수량라벨);
        controlPanel.add(수량);
        controlPanel.add(주문);
        mainFrame.setVisible(true);
    }
    
}
