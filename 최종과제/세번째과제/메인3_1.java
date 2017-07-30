package 세번째과제;

public class 메인3_1 {
	public static void main (String args []){
		입력3_1 inp1 = new 입력3_1 ();
		비교3_1 com = new 비교3_1 ();
		
		double num1 = inp1.Input_data ();
		double num2 = inp1.Input_data ();
		double num3 = inp1.Input_data ();

		com.First (num1, num2, num3);
		com.Second (num1, num2, num3);
	}
}