package �׹�°����;

import java.util.Scanner;

public class �Է�4_2 {
	private Scanner sc;
	private int ����, ������, �����;
	
	public �Է�4_2 (){
		 sc = new Scanner (System.in);
	}
	
	public void �ֹ� (){
		System.out.println ("���� ������ �Է��ϼ��� : " );
		���� = sc.nextInt ();
		System.out.println ("������ ������ �Է��ϼ��� : " );
		������ = sc.nextInt ();
		System.out.println ("����� ������ �Է��ϼ��� : " );
		����� = sc.nextInt ();
	}

	public int ���ļ� (){
		return ����;
	}
	public int �������� (){
		return ������;
	}
	public int ������ (){
		return �����;
	}
}