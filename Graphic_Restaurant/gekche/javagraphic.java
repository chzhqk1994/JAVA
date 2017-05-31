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
        // Frame �� ���� ����
        mainFrame = new Frame("�Ĵ� �ֹ� ���α׷�");
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(new GridLayout(4, 1)); //���̾ƿ��� 4�� 1���� ����
        
        
        
        WindowAdapter WA = new WindowAdapter(){
	        	public void windowClosing(WindowEvent windowEvent) {
	              System.exit(0);
	        	}
        };
        mainFrame.addWindowListener(WA);
        

        
//        mainFrame.addWindowListener(new WindowAdapter() { // �������� X��ư�� ������ ������ �Ѵ�
//            public void windowClosing(WindowEvent windowEvent) {
//                System.exit(0);
//            }
//        });
 
        
        
        
        // ��ܿ� �ִ� ��
        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        headerLabel.setText("�޴��� ������ �Է��ϼ���");
 
        // �ϴܿ� �ֹ� ����� ǥ���� �ش�
        statusLabel = new Label();
        statusLabel.setText("�ֹ� ���");
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
        Label �޴��� = new Label("�޴� : ", Label.RIGHT);
        Label ������ = new Label("���� : ", Label.CENTER);
        final TextField �޴� = new TextField(6);
        final TextField ���� = new TextField(6);
 
        Button �ֹ� = new Button("�ֹ�");
 
        �ֹ�.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "�޴� : " + �޴�.getText();
                data += ", ���� : " + ����.getText();
                statusLabel.setText(data);
            }
        });
 
         
        controlPanel.add(�޴���);
        controlPanel.add(�޴�);
        controlPanel.add(������);
        controlPanel.add(����);
        controlPanel.add(�ֹ�);
        mainFrame.setVisible(true);
    }
    
}
