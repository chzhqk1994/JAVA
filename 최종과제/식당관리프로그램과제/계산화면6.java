package 식당관리프로그램과제;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class 계산화면6 extends JDialog {
	private JLabel 계산내역;
	private JButton 확인;
	private 주문화면6 주문;
	private 메인6 메인;

    public 계산화면6 (double 할인된금액, double 최종금액){
        계산내역 = new JLabel ();
        계산내역.setBounds (50, 50, 400, 50);
        계산내역.setText ("할인된 금액은 " + 할인된금액 + "원 이며 총 금액은 " + 최종금액 + "원 입니다.");

        getContentPane ().add (계산내역);
        
        setSize (500, 300);
        getContentPane ().setLayout (null);
        
        확인 = new JButton ("확인");
        확인.addActionListener (new ActionListener () {
        	public void actionPerformed (ActionEvent e) {
        		setVisible (false);
        	}
        });
        
        확인.setBounds (180, 170, 105, 27);
        getContentPane ().add (확인);
        setVisible (true);
    }

    public static void main (String args []){
        new 계산화면6 (0, 0);
    }
}
