package �׹�°����;

import java.util.Scanner;

public class �Է�4_1 {
	private Scanner sc;
	private int ����1, ����2;
	
	public �Է�4_1 (){
		 sc = new Scanner(System.in);
	}
	
	public void ���Է� (){
		System.out.print ("ù��° ���� �Է����ּ��� : ");
		����1 = sc.nextInt ();
		System.out.print ("�ι�° ���� �Է����ּ��� : ");
		����2 = sc.nextInt ();	
	}
	
	public int ù��°�� (){
		return ����1;
	}
	
	public int �ι�°�� (){
		return ����2;
	}
	
}
