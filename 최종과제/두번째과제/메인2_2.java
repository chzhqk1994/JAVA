package �ι�°����;

public class ����2_2 {
	public static void main (String args[]){
		�Է�2_2 inp1 = new �Է�2_2 ();
		
		double num1 = inp1.Input_Data ();
		double num2 = inp1.Input_Data ();
		
		���� cal = new ���� ();
		ū��ã�� bn = new ū��ã�� ();
		
		cal.add (num1, num2);
		cal.sub (num1, num2);
		cal.mul (num1, num2);
		cal.div (num1, num2);
		
		bn.Compare (num1, num2);
	}
}
