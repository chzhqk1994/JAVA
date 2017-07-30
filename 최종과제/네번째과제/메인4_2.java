package 네번째과제;

public class 메인4_2 {
	private int 정식, 갈비탕, 비빔밥, 정식가격, 갈비탕가격, 비빔밥가격, 총액;
	
	public void 실행 (){
		입력4_2 input = new 입력4_2 ();
		처리기4_2 order = new 처리기4_2 ();
		출력4_2 output = new 출력4_2 ();
		
		input.주문 ();
		정식 = input.정식수 ();
		갈비탕 = input.갈비탕수 ();
		비빔밥 = input.비빔밥수 ();
		
		order.자료설정 (정식, 갈비탕, 비빔밥);
		정식가격 = order.정식가격 ();
		갈비탕가격 = order.갈비탕가격 ();
		비빔밥가격 = order.비빔밥가격 ();
		총액 = order.총액();
		
		output.자료설정 (정식가격, 갈비탕가격, 비빔밥가격, 총액);
		output.주문내용 ();
	}
	
	public static void main (String args []){
		메인4_2 controller = new 메인4_2 ();
		controller.실행 ();
	}
}