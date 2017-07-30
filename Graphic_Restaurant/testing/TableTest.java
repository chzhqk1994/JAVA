package testing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TableTest extends JFrame {

	private DefaultTableModel 모델;
	private JPanel 주문화면;
	private JTable 주문내역;
	private JButton 갈비탕버튼, 육개장버튼, 정식버튼;
	private String column[]={"메뉴이름", "갯수"};
	private String data[][]={
			{"갈비탕", "0"},
			{"육개장", "0"},
			{"정식", "0"}};

	public TableTest() {
		setBounds(100, 100, 450, 300);
		주문화면 = new JPanel();
		setContentPane(주문화면);
		주문화면.setLayout(null);
		
		모델 = new DefaultTableModel();
		
		
		주문내역 = new JTable(data, column);
		주문내역.setBounds(240, 65, 200, 250);
		주문화면.add(주문내역);
		
		갈비탕버튼 = new JButton("갈비탕");
		갈비탕버튼.setBounds(14, 59, 105, 27);
		갈비탕버튼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int 임시변수 = Integer.parseInt(data[0][1]) + 1;
				data[0][1] = Integer.toString(임시변수);
			}
		});
		주문화면.add(갈비탕버튼);
		
		육개장버튼 = new JButton("육개장");
		육개장버튼.setBounds(14, 98, 105, 27);
		육개장버튼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int 임시변수 = Integer.parseInt(data[1][1]) + 1;
				data[1][1] = Integer.toString(임시변수);
			}
		});
		주문화면.add(육개장버튼);
		
		정식버튼 = new JButton("정식");
		정식버튼.setBounds(14, 137, 105, 27);
		정식버튼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int 임시변수 = Integer.parseInt(data[2][1]) + 1;
				data[2][1] = Integer.toString(임시변수);
			}
		});
		주문화면.add(정식버튼);
		
		setSize(500, 500);
		setVisible(true);
		주문화면.setLayout(null);
	}

	public static void main(String[] args) {
		new TableTest();
	}
}
