package 네번째과제;

public class 처리기4_1 {

	private int 숫자1, 숫자2, 합, 차, 곱;
	private double 나누기;
	
	public void 자료설정 (int 숫자1, int 숫자2){
		this.숫자1 = 숫자1;
		this.숫자2 = 숫자2;
	}
	
	public int 합 (){
		합 = 숫자1 + 숫자2;
		return 합;
	}
	
	public int 차 (){
		차 = 숫자1 - 숫자2;
		return 차;
	}
	
	public int 곱 (){
		곱 = 숫자1 * 숫자2;
		return 곱;
	}
	
	public double 나누기 (){
		나누기 = 숫자1 / 숫자2;
		return 나누기;
	}


	public int 두수비교 () {
		if (숫자1 < 숫자2)
			return 숫자2;
		else
			return 숫자1;
	}
}

