package 식당관리프로그램과제;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;



public class 주문화면6 extends JFrame{

    private JButton [] 주메뉴;
    private JButton [] 주문취소;
    private JButton 계산, 뒤로가기;
    private DefaultTableModel 테이블모델;
    private 차림표6 차림;
    private 계산화면6 계산창;
    private 할인계산6 할인;


    주문화면6 (int 테이블번호, 메인6 주화면){
    	super ((테이블번호 + 1) + " 번 테이블");     //상단에 몇번 테이블인지 알수 있게 표시

        차림 = new 차림표6 ();

        String column [] = {"음식", "개수 ", "가격 "};
        Object Data [][] = {};

        테이블모델 = new DefaultTableModel (Data, column);    //테이블에 적용할 테이블 모델

		JTable jTable = new JTable (테이블모델);
		jTable.setAutoResizeMode (JTable.AUTO_RESIZE_OFF);
		
		JScrollPane jScrollPane = new JScrollPane (jTable);
		jScrollPane.setBounds (450, 50, 300, 300);
		getContentPane ().add (jScrollPane);
		
		주메뉴 = new JButton [9];		//버튼들 생성
		주문취소 = new JButton [9];
		계산 = new JButton ("계산");
		뒤로가기 = new JButton ("뒤로가기");
		
		for (int i = 0; i < 주메뉴.length; i++){                    //음식 버튼 객체 생성
		    주메뉴[i] = new JButton (차림.음식 [i]);
		}
		
		for (int j = 0; j < 주문취소.length; j++){			// 주문취소 버튼 객체 생성
			주문취소 [j] = new JButton ("-");
		}

		주메뉴 [0].setBounds (50, 40, 100, 60);
		주메뉴 [1].setBounds (200, 40, 100, 60);
		주메뉴 [2].setBounds (50, 120, 100, 60);
		주메뉴 [3].setBounds (200, 120, 100, 60);
		주메뉴 [4].setBounds (50, 200, 100, 60);
		주메뉴 [5].setBounds (200, 200, 100, 60);
		주메뉴 [6].setBounds (50, 280, 100, 60);
		주메뉴 [7].setBounds (200, 280, 100, 60);
		주메뉴 [8].setBounds (50, 360, 100, 60);
		
	    주문취소 [0].setBounds (150, 70, 30, 30);  // 주문취소 버튼 위치 설정
	    주문취소 [1].setBounds (300, 70, 30, 30);
	    주문취소 [2].setBounds (150, 150, 30, 30);
	    주문취소 [3].setBounds (300, 150, 30, 30);
	    주문취소 [4].setBounds (150, 230, 30, 30);
	    주문취소 [5].setBounds (300, 230, 30, 30);
	    주문취소 [6].setBounds (150, 310, 30, 30);
	    주문취소 [7].setBounds (300, 310, 30, 30);
	    주문취소 [8].setBounds (150, 390, 30, 30);
		
		계산.setBounds (645, 364, 80, 60);  	// 계산, 뒤로가기 버튼 위치 설정
		뒤로가기.setBounds (509, 364, 100, 60);

	
		for (int i = 0; i < 주메뉴.length; i++){
		    int finalI = i+1;
		    주메뉴 [i].addActionListener (new ActionListener () {
		        @Override
		        public void actionPerformed (ActionEvent e) {
		        	주문내역생성 (finalI * 10);
		        }
		    });
		}
	
		for (int i=0; i < 주문취소.length; i++){
		    int finalI = i;
		    주문취소 [i].addActionListener (new ActionListener () {
		        @Override
		        public void actionPerformed (ActionEvent e) {
		        	주문내역삭제 (차림.음식코드 [finalI]);
		        }
		    });
		}
	
		뒤로가기.addActionListener (new ActionListener () {
		    @Override
		    public void actionPerformed (ActionEvent e) {
		        setVisible (false);
		        주화면.setVisible (true);
		    }
		});
		
		계산.addActionListener (e -> {
		    // TODO Auto-generated method stub
			int 총액 = 0;
			double 할인된금액 = 0;
			double 최종금액 = 0;
		        for (int i = 0; i < 테이블모델.getRowCount (); i++){
		            총액 += (Integer)테이블모델.getValueAt (i, 2);
		        }
		
		        setVisible (false);
		        주화면.테이블 [테이블번호].setBackground (Color.WHITE);
		        주화면.setVisible (true);
		    
		        할인 = new 할인계산6 (총액);
				할인된금액 = 할인.할인금액계산 (); // 할인계산 클래스에서 할인된금액을 받아옴
				최종금액 = 할인.최종금액계산 (); // 할인계산 클래스에서 최종금액을 받아옴
		        계산창 = new 계산화면6 (할인된금액, 최종금액);
		
		        
		        if (테이블모델.getRowCount () > 0) {
		            for (int i = 테이블모델.getRowCount () - 1; i > -1; i--) {
		                테이블모델.removeRow (i);
		            }
		        }
		    });
		
		for (int i = 0; i < 9; i++){
			getContentPane ().add (주메뉴 [i]);
		}
		
		for (int i =0; i < 9; i++){
			getContentPane ().add (주문취소 [i]);
		}
		
		getContentPane ().add (계산);
		getContentPane ().add (뒤로가기);

	    setSize (800,700);
	    getContentPane ().setLayout (null);
	    setVisible (false);
	    }
    
    void 주문내역생성 (int 코드) {           //주문내역을 생성해서 임시객체로 보내고 임시객체를 테이블에 추가한다.
    	if (테이블모델.getRowCount () == 0){
	        Object [] 임시객체 = {차림.음식명얻기 (코드), 0,0};
	        테이블모델.addRow (임시객체);
	    }
	
	    if (테이블존재여부 (코드) == true) {
	        for (int i = 0; i < 테이블모델.getRowCount(); i++){
	            if (테이블모델.getValueAt (i, 0) == 차림.음식명얻기 (코드)){
	                테이블모델.setValueAt ((Integer) 테이블모델.getValueAt (i, 1) + 1, i, 1);
	                테이블모델.setValueAt ((Integer) 테이블모델.getValueAt (i, 2) + 차림.가격얻기 (코드), i, 2);
	            }
	
	        }
	    }
	    else{
	        Object [] 임시객체 = {차림.음식명얻기 (코드), 1, 차림.가격얻기 (코드)};
	        테이블모델.addRow (임시객체);
	    }
    }
	
	boolean 테이블존재여부 (int 코드){                //테이블 존재 여부를 뒤로가기해서 테이블을 추가할지 수정할지 정할수 있게 함
	    int 카운트 = 0;
	    for(int i = 0 ; i < 테이블모델.getRowCount (); i++){
	        if (테이블모델.getValueAt (i, 0) == 차림.음식명얻기 (코드)){
	            카운트 += 1;
	        }
	    }
	    if (카운트 > 0)
	        return true;
	    else
	        return false;
	}
	
	void 주문내역삭제 (int 코드) {        //주문내역에서 개수가 0이되면 테이블에서 제거 되도록함.
        for (int i = 0; i < 테이블모델.getRowCount (); i++) {
            if (테이블모델.getValueAt (i, 0) == 차림.음식명얻기 (코드)) {
                	테이블모델.setValueAt ((Integer) 테이블모델.getValueAt (i, 1) - 1, i, 1);
                	테이블모델.setValueAt ((Integer) 테이블모델.getValueAt (i, 2) + 차림.가격얻기 (코드), i, 2);
                	if ((Integer) 테이블모델.getValueAt (i, 1) == 0) {
                		테이블모델.removeRow (i);
                }
            }
        }
	}
}
