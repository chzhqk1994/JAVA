package 두번째과제;

public class 메인2_1 {
	public static void main (String args []){
		입력2_1 inp1 = new 입력2_1 ();
		비교2_1 com = new 비교2_1 ();
		
		double num1 = inp1.Input_data ();
		double num2 = inp1.Input_data ();
		double num3 = inp1.Input_data ();

		com.First (num1, num2, num3);
		com.Second (num1, num2, num3);
	}
}