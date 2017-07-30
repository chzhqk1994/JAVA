package 네번째과제;

public class 처리기4_2 {
	private int 정식, 갈비탕, 비빔밥, 정식가격, 갈비탕가격, 비빔밥가격, 총액;
	
	public void 자료설정 (int 정식, int 갈비탕, int 비빔밥){
		this.정식 = 정식;
		this.갈비탕 = 갈비탕;
		this.비빔밥 = 비빔밥;
	}
	
	public int 정식가격 (){
		정식가격 = 정식 * 9000;
		return 정식가격;
	}
	
	public int 갈비탕가격 (){
		갈비탕가격 = 갈비탕 * 7000;
		return 갈비탕가격;
	}
	
	public int 비빔밥가격 (){
		비빔밥가격 = 비빔밥 * 5000;
		return 비빔밥가격;
	}
	
	public int 총액 (){
		총액 = 정식가격 + 갈비탕가격 + 비빔밥가격;
		return 총액;
	}
}
