package �׹�°����;

public class ó����4_2 {
	private int ����, ������, �����, ���İ���, ����������, ����䰡��, �Ѿ�;
	
	public void �ڷἳ�� (int ����, int ������, int �����){
		this.���� = ����;
		this.������ = ������;
		this.����� = �����;
	}
	
	public int ���İ��� (){
		���İ��� = ���� * 9000;
		return ���İ���;
	}
	
	public int ���������� (){
		���������� = ������ * 7000;
		return ����������;
	}
	
	public int ����䰡�� (){
		����䰡�� = ����� * 5000;
		return ����䰡��;
	}
	
	public int �Ѿ� (){
		�Ѿ� = ���İ��� + ���������� + ����䰡��;
		return �Ѿ�;
	}
}
