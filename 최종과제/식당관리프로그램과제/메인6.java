package �Ĵ�������α׷�����;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ����6 extends JFrame{
	private �ֹ�ȭ��6 [] �ֹ�;
	public JButton [] ���̺�;
	public JButton ���̺�1, ���̺�2, ���̺�3, ���̺�4, ���̺�5, ���̺�6;
	private final int ���α��� = 800;
	private final int ���α��� = 700;
	private int ��ư���α��� = ���α��� / 5;
	private int ��ư���α��� = ���α��� / 5;

    public ����6() {
    	super ("�Ĵ����α׷�");
    	�ֹ� = new �ֹ�ȭ��6 [9];

    	��ư���� (9);

    	setSize (800, 700);
    	getContentPane ().setLayout (null);
    	setVisible (true);
    }

    private void ��ư���� (int ���̺��){         //�¼��� ��ŭ ��ư�� �������ִ� �Լ��Դϴ�.
        ���̺� = new JButton [���̺��];

    	for (int i = 0; i < ���̺��; i++){
        	int �� = (i / 3) + 1;
            int �� = (i % 3) + 1;
            �ֹ� [i] = new �ֹ�ȭ��6 (i, this);

            ���̺� [i] = new JButton ((i + 1) + " �� ���̺�");
        	���̺� [i].setBounds (��ư���α��� * ��, ��ư���α��� * ��, ��ư���α��� - 20, ��ư���α��� - 20);
            ���̺� [i].setBackground (Color.WHITE);

            int number = i;
            ���̺� [i].addActionListener (new ActionListener () {     //�� ���̺� ���ؼ� �̺�Ʈ�� �߻����� ���
                @Override
                public void actionPerformed (ActionEvent e) {
                    �ֹ� [number].setVisible (true);
                    setVisible (false);
                    ���̺� [number].setBackground (Color.YELLOW);
                }
            });
            getContentPane ().add (���̺� [i]);
        }
    }
    public static void main (String[] args){
        new ����6 ();
    }
}
