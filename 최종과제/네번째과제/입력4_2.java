package 네번째과제;

import java.util.Scanner;

public class 입력4_2 {
	private Scanner sc;
	private int 정식, 갈비탕, 비빔밥;
	
	public 입력4_2 (){
		 sc = new Scanner (System.in);
	}
	
	public void 주문 (){
		System.out.println ("정식 개수를 입력하세요 : " );
		정식 = sc.nextInt ();
		System.out.println ("갈비탕 개수를 입력하세요 : " );
		갈비탕 = sc.nextInt ();
		System.out.println ("비빔밥 개수를 입력하세요 : " );
		비빔밥 = sc.nextInt ();
	}

	public int 정식수 (){
		return 정식;
	}
	public int 갈비탕수 (){
		return 갈비탕;
	}
	public int 비빔밥수 (){
		return 비빔밥;
	}
}