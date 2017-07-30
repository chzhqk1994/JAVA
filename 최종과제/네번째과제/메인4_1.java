package 네번째과제;

public class 메인4_1 {
	private int 숫자1, 숫자2;
	private int 합, 차, 곱, 두수비교;
	private double 나누기;
	
	public void 실행 (){
		입력4_1 input = new 입력4_1 ();
		처리기4_1 calculate = new 처리기4_1 ();
		출력4_1 output = new 출력4_1 ();
		
		input.수입력 ();
		숫자1 = input.첫번째수 ();
		숫자2 = input.두번째수 ();
		
		calculate.자료설정 (숫자1, 숫자2);
		합 = calculate.합 ();
		차 = calculate.차 ();
		곱 = calculate.곱 ();
		나누기 = calculate.나누기 ();
		두수비교 = calculate.두수비교 ();
		
		output.자료설정 (합, 차, 곱, 나누기, 두수비교);
		output.결과출력 ();
	}
	
	public static void main (String args []){
		메인4_1 controller = new 메인4_1 ();
		controller.실행 ();
	}
}