package yunjoo;

public class Controller {
	  public int 고기국수수, 멸치국수수, 콩국수수, 순대국밥수, 해물탕수, 
	            해물파전수, 매운탕수, 돼지국밥수, 합계, 할인액, 수령액;
		
	  private CalDiscount discount;
	  private CalSum sum;
		
	  public Controller(){
	    discount = new CalDiscount();
	    sum = new CalSum();
	  }
		
	  public void set개수(int c고기국수수, int c멸치국수수, int c콩국수수, int c순대국밥수, int c해물탕수, int c해물파전수, int c매운탕수, int c돼지국밥수){
	    고기국수수 = c고기국수수;
	    멸치국수수 = c멸치국수수;
	    콩국수수 = c콩국수수;
	    순대국밥수 = c순대국밥수;
	    해물탕수 = c해물탕수;
	    해물파전수 = c해물파전수;
	    매운탕수 = c매운탕수;
	    돼지국밥수 = c돼지국밥수;	
	  }
		
	  public void 계산(){
	    sum.set개수(고기국수수, 멸치국수수, 콩국수수, 순대국밥수, 해물탕수, 해물파전수, 
			매운탕수, 돼지국밥수);
	    합계 = sum.calSum();
	    discount.calReceipt(합계);
	    할인액 = discount.get할인액();
	    수령액 = discount.get수령액();
	  }
	}