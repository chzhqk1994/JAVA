package �Ĵ�������α׷�����;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ���ȭ��6 extends JDialog {
	private JLabel ��곻��;
	private JButton Ȯ��;
	private �ֹ�ȭ��6 �ֹ�;
	private ����6 ����;

    public ���ȭ��6 (double ���εȱݾ�, double �����ݾ�){
        ��곻�� = new JLabel ();
        ��곻��.setBounds (50, 50, 400, 50);
        ��곻��.setText ("���ε� �ݾ��� " + ���εȱݾ� + "�� �̸� �� �ݾ��� " + �����ݾ� + "�� �Դϴ�.");

        getContentPane ().add (��곻��);
        
        setSize (500, 300);
        getContentPane ().setLayout (null);
        
        Ȯ�� = new JButton ("Ȯ��");
        Ȯ��.addActionListener (new ActionListener () {
        	public void actionPerformed (ActionEvent e) {
        		setVisible (false);
        	}
        });
        
        Ȯ��.setBounds (180, 170, 105, 27);
        getContentPane ().add (Ȯ��);
        setVisible (true);
    }

    public static void main (String args []){
        new ���ȭ��6 (0, 0);
    }
}
