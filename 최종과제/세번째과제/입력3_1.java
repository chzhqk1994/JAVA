package 세번째과제;

import java.util.Scanner;

public class 입력3_1 {
	public double Input_data (){
		Scanner scan = new Scanner (System.in);
		System.out.println ("숫자를 입력하세요 : ");
		double num = scan.nextDouble ();
		
		return num;
	}
}