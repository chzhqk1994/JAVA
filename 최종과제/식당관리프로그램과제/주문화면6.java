package �Ĵ�������α׷�����;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;



public class �ֹ�ȭ��6 extends JFrame{

    private JButton [] �ָ޴�;
    private JButton [] �ֹ����;
    private JButton ���, �ڷΰ���;
    private DefaultTableModel ���̺��;
    private ����ǥ6 ����;
    private ���ȭ��6 ���â;
    private ���ΰ��6 ����;


    �ֹ�ȭ��6 (int ���̺��ȣ, ����6 ��ȭ��){
    	super ((���̺��ȣ + 1) + " �� ���̺�");     //��ܿ� ��� ���̺����� �˼� �ְ� ǥ��

        ���� = new ����ǥ6 ();

        String column [] = {"����", "���� ", "���� "};
        Object Data [][] = {};

        ���̺�� = new DefaultTableModel (Data, column);    //���̺� ������ ���̺� ��

		JTable jTable = new JTable (���̺��);
		jTable.setAutoResizeMode (JTable.AUTO_RESIZE_OFF);
		
		JScrollPane jScrollPane = new JScrollPane (jTable);
		jScrollPane.setBounds (450, 50, 300, 300);
		getContentPane ().add (jScrollPane);
		
		�ָ޴� = new JButton [9];		//��ư�� ����
		�ֹ���� = new JButton [9];
		��� = new JButton ("���");
		�ڷΰ��� = new JButton ("�ڷΰ���");
		
		for (int i = 0; i < �ָ޴�.length; i++){                    //���� ��ư ��ü ����
		    �ָ޴�[i] = new JButton (����.���� [i]);
		}
		
		for (int j = 0; j < �ֹ����.length; j++){			// �ֹ���� ��ư ��ü ����
			�ֹ���� [j] = new JButton ("-");
		}

		�ָ޴� [0].setBounds (50, 40, 100, 60);
		�ָ޴� [1].setBounds (200, 40, 100, 60);
		�ָ޴� [2].setBounds (50, 120, 100, 60);
		�ָ޴� [3].setBounds (200, 120, 100, 60);
		�ָ޴� [4].setBounds (50, 200, 100, 60);
		�ָ޴� [5].setBounds (200, 200, 100, 60);
		�ָ޴� [6].setBounds (50, 280, 100, 60);
		�ָ޴� [7].setBounds (200, 280, 100, 60);
		�ָ޴� [8].setBounds (50, 360, 100, 60);
		
	    �ֹ���� [0].setBounds (150, 70, 30, 30);  // �ֹ���� ��ư ��ġ ����
	    �ֹ���� [1].setBounds (300, 70, 30, 30);
	    �ֹ���� [2].setBounds (150, 150, 30, 30);
	    �ֹ���� [3].setBounds (300, 150, 30, 30);
	    �ֹ���� [4].setBounds (150, 230, 30, 30);
	    �ֹ���� [5].setBounds (300, 230, 30, 30);
	    �ֹ���� [6].setBounds (150, 310, 30, 30);
	    �ֹ���� [7].setBounds (300, 310, 30, 30);
	    �ֹ���� [8].setBounds (150, 390, 30, 30);
		
		���.setBounds (645, 364, 80, 60);  	// ���, �ڷΰ��� ��ư ��ġ ����
		�ڷΰ���.setBounds (509, 364, 100, 60);

	
		for (int i = 0; i < �ָ޴�.length; i++){
		    int finalI = i+1;
		    �ָ޴� [i].addActionListener (new ActionListener () {
		        @Override
		        public void actionPerformed (ActionEvent e) {
		        	�ֹ��������� (finalI * 10);
		        }
		    });
		}
	
		for (int i=0; i < �ֹ����.length; i++){
		    int finalI = i;
		    �ֹ���� [i].addActionListener (new ActionListener () {
		        @Override
		        public void actionPerformed (ActionEvent e) {
		        	�ֹ��������� (����.�����ڵ� [finalI]);
		        }
		    });
		}
	
		�ڷΰ���.addActionListener (new ActionListener () {
		    @Override
		    public void actionPerformed (ActionEvent e) {
		        setVisible (false);
		        ��ȭ��.setVisible (true);
		    }
		});
		
		���.addActionListener (e -> {
		    // TODO Auto-generated method stub
			int �Ѿ� = 0;
			double ���εȱݾ� = 0;
			double �����ݾ� = 0;
		        for (int i = 0; i < ���̺��.getRowCount (); i++){
		            �Ѿ� += (Integer)���̺��.getValueAt (i, 2);
		        }
		
		        setVisible (false);
		        ��ȭ��.���̺� [���̺��ȣ].setBackground (Color.WHITE);
		        ��ȭ��.setVisible (true);
		    
		        ���� = new ���ΰ��6 (�Ѿ�);
				���εȱݾ� = ����.���αݾװ�� (); // ���ΰ�� Ŭ�������� ���εȱݾ��� �޾ƿ�
				�����ݾ� = ����.�����ݾװ�� (); // ���ΰ�� Ŭ�������� �����ݾ��� �޾ƿ�
		        ���â = new ���ȭ��6 (���εȱݾ�, �����ݾ�);
		
		        
		        if (���̺��.getRowCount () > 0) {
		            for (int i = ���̺��.getRowCount () - 1; i > -1; i--) {
		                ���̺��.removeRow (i);
		            }
		        }
		    });
		
		for (int i = 0; i < 9; i++){
			getContentPane ().add (�ָ޴� [i]);
		}
		
		for (int i =0; i < 9; i++){
			getContentPane ().add (�ֹ���� [i]);
		}
		
		getContentPane ().add (���);
		getContentPane ().add (�ڷΰ���);

	    setSize (800,700);
	    getContentPane ().setLayout (null);
	    setVisible (false);
	    }
    
    void �ֹ��������� (int �ڵ�) {           //�ֹ������� �����ؼ� �ӽð�ü�� ������ �ӽð�ü�� ���̺� �߰��Ѵ�.
    	if (���̺��.getRowCount () == 0){
	        Object [] �ӽð�ü = {����.���ĸ��� (�ڵ�), 0,0};
	        ���̺��.addRow (�ӽð�ü);
	    }
	
	    if (���̺����翩�� (�ڵ�) == true) {
	        for (int i = 0; i < ���̺��.getRowCount(); i++){
	            if (���̺��.getValueAt (i, 0) == ����.���ĸ��� (�ڵ�)){
	                ���̺��.setValueAt ((Integer) ���̺��.getValueAt (i, 1) + 1, i, 1);
	                ���̺��.setValueAt ((Integer) ���̺��.getValueAt (i, 2) + ����.���ݾ�� (�ڵ�), i, 2);
	            }
	
	        }
	    }
	    else{
	        Object [] �ӽð�ü = {����.���ĸ��� (�ڵ�), 1, ����.���ݾ�� (�ڵ�)};
	        ���̺��.addRow (�ӽð�ü);
	    }
    }
	
	boolean ���̺����翩�� (int �ڵ�){                //���̺� ���� ���θ� �ڷΰ����ؼ� ���̺��� �߰����� �������� ���Ҽ� �ְ� ��
	    int ī��Ʈ = 0;
	    for(int i = 0 ; i < ���̺��.getRowCount (); i++){
	        if (���̺��.getValueAt (i, 0) == ����.���ĸ��� (�ڵ�)){
	            ī��Ʈ += 1;
	        }
	    }
	    if (ī��Ʈ > 0)
	        return true;
	    else
	        return false;
	}
	
	void �ֹ��������� (int �ڵ�) {        //�ֹ��������� ������ 0�̵Ǹ� ���̺��� ���� �ǵ�����.
        for (int i = 0; i < ���̺��.getRowCount (); i++) {
            if (���̺��.getValueAt (i, 0) == ����.���ĸ��� (�ڵ�)) {
                	���̺��.setValueAt ((Integer) ���̺��.getValueAt (i, 1) - 1, i, 1);
                	���̺��.setValueAt ((Integer) ���̺��.getValueAt (i, 2) + ����.���ݾ�� (�ڵ�), i, 2);
                	if ((Integer) ���̺��.getValueAt (i, 1) == 0) {
                		���̺��.removeRow (i);
                }
            }
        }
	}
}
