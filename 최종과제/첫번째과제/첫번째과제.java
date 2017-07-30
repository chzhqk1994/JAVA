package 첫번째과제;

//10000원으로 각기 200, 300, 500 원 짜리 물건을 살 수 있는 조합을 구하는 프로그램을 작성하시오.
public class 첫번째과제 {
	public static void main (String args[]){
		int have = 10000; //소지한 금액
		int max_200 = have/200; //소지금액으로 각 물건을 살 수 있는 최대 갯수
		int max_300 = have/300;
		int max_500 = have/500;

		for (int i = 0; i <= max_200; i++){
			for (int j = 0; j <= max_300; j++){
				for (int k = 0; k <= max_500; k++){
					if ((i * 200) + (j * 300) + (k * 500) == have)
						System.out.println ("(" + i + ", " + j + ", " + k + ")");
					
					else
						continue;
					
				}
			}
		}
	}
}