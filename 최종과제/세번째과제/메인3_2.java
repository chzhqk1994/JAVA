package 세번째과제;

public class 메인3_2 {
	public static void main (String args[]){
		입력3_2 inp1 = new 입력3_2 ();
		
		double num1 = inp1.Input_Data ();
		double num2 = inp1.Input_Data ();
		
		계산기 cal = new 계산기 ();
		큰수찾기 bn = new 큰수찾기 ();
		
		cal.add (num1, num2);
		cal.sub (num1, num2);
		cal.mul (num1, num2);
		cal.div (num1, num2);
		
		bn.Compare (num1, num2);
	}
}
