package 네번째과제;

public class 출력4_2 {
	private int 정식가격, 갈비탕가격, 비빔밥가격, 총액;
	
	public void 자료설정 (int 정식가격, int 갈비탕가격, int 비빔밥가격, int 총액){
		this.정식가격 = 정식가격;
		this.갈비탕가격 = 갈비탕가격;
		this.비빔밥가격 = 비빔밥가격;
		this.총액 = 총액;
	}
	
	public void 주문내용 (){
		System.out.println ("정식의 가격은 : " +정식가격 + "원 입니다.");
		System.out.println ("갈비탕의 가격은 : " +갈비탕가격 + "원 입니다.");
		System.out.println ("비빔밥의 가격은 : " +비빔밥가격 + "원 입니다.");
		System.out.println ("총 가격은 : " + 총액 + "원 입니다.");
	}
}