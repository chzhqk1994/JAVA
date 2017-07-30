package 네번째과제;

public class 출력4_1 {
	private int 합, 차, 곱, 두수비교;
	private double 나누기;
	
	public void 자료설정 (int 합, int 차, int 곱, double 나누기,  int 두수비교){
		this.합 = 합;
		this.차 = 차;
		this.곱 = 곱;
		this.나누기 = 나누기;
		this.두수비교 = 두수비교;
	}
	
	public void 결과출력 (){
		System.out.println ("합 : " + 합);
		System.out.println ("차 : " + 차);
		System.out.println ("곱 : " + 곱);
		System.out.println ("나눈 몫 : " + 나누기);
		System.out.println ("두수중 큰수는 : " + 두수비교 + "입니다.");
		
	}
	

}
