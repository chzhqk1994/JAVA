package 두번째과제;

public class 비교2_1 {
	public void First (double num1, double num2, double num3){
	    if (num1 >= num2) //num1이 num2 보다 클 때
	    {
	        if (num1 >= num3) // num1 이 num3 보다 크면 num1이 제일 크다
	        	System.out.println ("가장 큰 수는 : " + num1 + "입니다.\n");
	        else // num1보다 num3이 크면 num3이 제일 큰 수
	        	System.out.println ("가장 큰 수는 : " + num3 + "입니다.\n");
	    }
		
	    else //num1이 num2 보다 작을 때
	    {
	        if (num2 >= num3)
	        	System.out.println ("가장 큰 수는 : " + num2 + "입니다.\n");
	        else //num3가 num2 보다 클 때
	        	System.out.println ("가장 큰 수는 : " + num3 + "입니다.\n");
	    }
	}
	
	public void Second (double num1, double num2, double num3){
	    if (num1 >= num2) //num1이 num2보다 크거나 같을 때
	    {
	        if (num3 >= num1) //num3이 num1 보다 크면  num3>=num1>=num2
	        	System.out.println("두번째로 큰 수는 : " + num1 + "입니다.\n");
	        else { // num1이 num2, num3 보다 클 때
	        	if (num2 >= num3) //num2 가 num3 보다 크면 두번째로 큰 수는 num2
	        		System.out.println ("두번째로 큰 수는 : " + num2 + "입니다.\n");
	        	else
	        		System.out.println ("두번째로 큰 수는 : " + num3 + "입니다.\n");
	        }
	    }
		
	    else //num2가 num1 보다 클 때
	    {
	        if (num2 <= num3) //num3가 num2 보다 크면 두번째로 큰 수는 num2
	        	System.out.println ("두번째로 큰 수는 : " + num2 + "입니다.\n");
	        else { // num2 가 num1, num3 보다 클 때
	        	if (num1 >= num3) //num2 가 num3 보다 크면 두번째로 큰 수는 num2
	        		System.out.println ("두번째로 큰 수는 : " + num1 + "입니다.\n");
	        	else
	        		System.out.println ("두번째로 큰 수는 : " + num3 + "입니다.\n");
	        }
	    }
	}
}
