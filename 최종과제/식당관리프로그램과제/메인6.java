package 식당관리프로그램과제;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class 메인6 extends JFrame{
	private 주문화면6 [] 주문;
	public JButton [] 테이블;
	public JButton 테이블1, 테이블2, 테이블3, 테이블4, 테이블5, 테이블6;
	private final int 가로길이 = 800;
	private final int 세로길이 = 700;
	private int 버튼가로길이 = 가로길이 / 5;
	private int 버튼세로길이 = 세로길이 / 5;

    public 메인6() {
    	super ("식당프로그램");
    	주문 = new 주문화면6 [9];

    	버튼생성 (9);

    	setSize (800, 700);
    	getContentPane ().setLayout (null);
    	setVisible (true);
    }

    private void 버튼생성 (int 테이블수){         //좌석수 만큼 버튼을 생성해주는 함수입니다.
        테이블 = new JButton [테이블수];

    	for (int i = 0; i < 테이블수; i++){
        	int 열 = (i / 3) + 1;
            int 행 = (i % 3) + 1;
            주문 [i] = new 주문화면6 (i, this);

            테이블 [i] = new JButton ((i + 1) + " 번 테이블");
        	테이블 [i].setBounds (버튼가로길이 * 행, 버튼세로길이 * 열, 버튼가로길이 - 20, 버튼세로길이 - 20);
            테이블 [i].setBackground (Color.WHITE);

            int number = i;
            테이블 [i].addActionListener (new ActionListener () {     //각 테이블에 대해서 이벤트가 발생했을 경우
                @Override
                public void actionPerformed (ActionEvent e) {
                    주문 [number].setVisible (true);
                    setVisible (false);
                    테이블 [number].setBackground (Color.YELLOW);
                }
            });
            getContentPane ().add (테이블 [i]);
        }
    }
    public static void main (String[] args){
        new 메인6 ();
    }
}
