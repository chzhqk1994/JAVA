package �׹�°����;

public class ����4_1 {
	private int ����1, ����2;
	private int ��, ��, ��, �μ���;
	private double ������;
	
	public void ���� (){
		�Է�4_1 input = new �Է�4_1 ();
		ó����4_1 calculate = new ó����4_1 ();
		���4_1 output = new ���4_1 ();
		
		input.���Է� ();
		����1 = input.ù��°�� ();
		����2 = input.�ι�°�� ();
		
		calculate.�ڷἳ�� (����1, ����2);
		�� = calculate.�� ();
		�� = calculate.�� ();
		�� = calculate.�� ();
		������ = calculate.������ ();
		�μ��� = calculate.�μ��� ();
		
		output.�ڷἳ�� (��, ��, ��, ������, �μ���);
		output.������ ();
	}
	
	public static void main (String args []){
		����4_1 controller = new ����4_1 ();
		controller.���� ();
	}
}