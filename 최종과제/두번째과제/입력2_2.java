package 두번째과제;

import java.util.Scanner;

public class 입력2_2 {
	public double Input_Data ()
	{
		Scanner scan = new Scanner (System.in);
		System.out.println ("숫자 입력 : ");
		
		double input =  scan.nextDouble ();
		
		return input;
	}
}