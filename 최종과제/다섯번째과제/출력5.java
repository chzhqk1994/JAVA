package 다섯번째과제;

public class 출력5 {
	
    public void 합출력 (int 합){
        System.out.println("모든 수의 합은 : " + 합 + " 입니다.");
    }

    public void 큰수출력 (int 큰수){
        System.out.println("제일 큰 수는 : " + 큰수 + " 입니다.");
    }

    public void 홀짝수 (int 배열길이, int 짝수){
        System.out.println ("짝수의 갯수 : " + 짝수 + " 개 입니다.");
        System.out.println ("홀수의 갯수 : " + (배열길이 - 짝수) + " 개 입니다.");
    }

    public void 순서 (int[] array){
        for (int i = 0; i < array.length; i++)
            System.out.print (array[i] + " ");
    }
}
