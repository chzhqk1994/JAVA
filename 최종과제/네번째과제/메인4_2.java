package �׹�°����;

public class ����4_2 {
	private int ����, ������, �����, ���İ���, ����������, ����䰡��, �Ѿ�;
	
	public void ���� (){
		�Է�4_2 input = new �Է�4_2 ();
		ó����4_2 order = new ó����4_2 ();
		���4_2 output = new ���4_2 ();
		
		input.�ֹ� ();
		���� = input.���ļ� ();
		������ = input.�������� ();
		����� = input.������ ();
		
		order.�ڷἳ�� (����, ������, �����);
		���İ��� = order.���İ��� ();
		���������� = order.���������� ();
		����䰡�� = order.����䰡�� ();
		�Ѿ� = order.�Ѿ�();
		
		output.�ڷἳ�� (���İ���, ����������, ����䰡��, �Ѿ�);
		output.�ֹ����� ();
	}
	
	public static void main (String args []){
		����4_2 controller = new ����4_2 ();
		controller.���� ();
	}
}