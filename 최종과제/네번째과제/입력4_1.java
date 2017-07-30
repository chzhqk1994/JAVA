package 네번째과제;

import java.util.Scanner;

public class 입력4_1 {
	private Scanner sc;
	private int 숫자1, 숫자2;
	
	public 입력4_1 (){
		 sc = new Scanner(System.in);
	}
	
	public void 수입력 (){
		System.out.print ("첫번째 수를 입력해주세요 : ");
		숫자1 = sc.nextInt ();
		System.out.print ("두번째 수를 입력해주세요 : ");
		숫자2 = sc.nextInt ();	
	}
	
	public int 첫번째수 (){
		return 숫자1;
	}
	
	public int 두번째수 (){
		return 숫자2;
	}
	
}
