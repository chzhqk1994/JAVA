package �ι�°����;

public class ��2_1 {
	public void First (double num1, double num2, double num3){
	    if (num1 >= num2) //num1�� num2 ���� Ŭ ��
	    {
	        if (num1 >= num3) // num1 �� num3 ���� ũ�� num1�� ���� ũ��
	        	System.out.println ("���� ū ���� : " + num1 + "�Դϴ�.\n");
	        else // num1���� num3�� ũ�� num3�� ���� ū ��
	        	System.out.println ("���� ū ���� : " + num3 + "�Դϴ�.\n");
	    }
		
	    else //num1�� num2 ���� ���� ��
	    {
	        if (num2 >= num3)
	        	System.out.println ("���� ū ���� : " + num2 + "�Դϴ�.\n");
	        else //num3�� num2 ���� Ŭ ��
	        	System.out.println ("���� ū ���� : " + num3 + "�Դϴ�.\n");
	    }
	}
	
	public void Second (double num1, double num2, double num3){
	    if (num1 >= num2) //num1�� num2���� ũ�ų� ���� ��
	    {
	        if (num3 >= num1) //num3�� num1 ���� ũ��  num3>=num1>=num2
	        	System.out.println("�ι�°�� ū ���� : " + num1 + "�Դϴ�.\n");
	        else { // num1�� num2, num3 ���� Ŭ ��
	        	if (num2 >= num3) //num2 �� num3 ���� ũ�� �ι�°�� ū ���� num2
	        		System.out.println ("�ι�°�� ū ���� : " + num2 + "�Դϴ�.\n");
	        	else
	        		System.out.println ("�ι�°�� ū ���� : " + num3 + "�Դϴ�.\n");
	        }
	    }
		
	    else //num2�� num1 ���� Ŭ ��
	    {
	        if (num2 <= num3) //num3�� num2 ���� ũ�� �ι�°�� ū ���� num2
	        	System.out.println ("�ι�°�� ū ���� : " + num2 + "�Դϴ�.\n");
	        else { // num2 �� num1, num3 ���� Ŭ ��
	        	if (num1 >= num3) //num2 �� num3 ���� ũ�� �ι�°�� ū ���� num2
	        		System.out.println ("�ι�°�� ū ���� : " + num1 + "�Դϴ�.\n");
	        	else
	        		System.out.println ("�ι�°�� ū ���� : " + num3 + "�Դϴ�.\n");
	        }
	    }
	}
}
