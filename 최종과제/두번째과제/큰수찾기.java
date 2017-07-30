package 두번째과제;

public class 큰수찾기 {
	public void Compare (double num1, double num2){
		if (num1 != num2){
			if (num1 > num2) System.out.println("큰 수는 " + num1 + "입니다.\n");
			else			 System.out.println("큰 수는 " + num2 + "입니다.\n");
		}
		else
			System.out.println("두 수는 같습니다.");
	}
}