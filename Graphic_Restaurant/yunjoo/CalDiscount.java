package yunjoo;

public class CalDiscount {
	  private double 이만원이상할인율, 삼만원이상할인율, 
	  		사만원이상할인율, 육만원이상할인율;
	  private int 할인액, 수령액;

	  public CalDiscount(){
	    이만원이상할인율 = 0.01;
	    삼만원이상할인율 = 0.02;
	    사만원이상할인율 = 0.03;
	    육만원이상할인율 = 0.05;
	  }
		
	  public void calReceipt(int 합계){
	    if(20000 <= 합계 && 합계 < 30000){
	      할인액 = (int)(합계 * 이만원이상할인율);
	      수령액 = 합계 - 할인액;
	    }
	    else if(30000 <= 합계 && 합계 < 40000){
	      할인액 = (int)(합계 * 삼만원이상할인율);
	      수령액 = 합계 - 할인액;
	    }
	    else if(40000 <= 합계 && 합계 < 60000){
	      할인액 = (int)(합계 * 사만원이상할인율);
	      수령액 = 합계 - 할인액;
	    }
	    else if(합계 >= 60000){
	      할인액 = (int)(합계 * 육만원이상할인율);
	      수령액 = 합계 - 할인액;
	    }
	    else{
	      할인액 = 0;
	      수령액 = 합계;
	    }

	    수령액 = 수령액 - (수령액 % 100);//100이하자리 버림
	  }
		
	  public int get할인액(){return 할인액;}
	  public int get수령액(){return 수령액;}
	}