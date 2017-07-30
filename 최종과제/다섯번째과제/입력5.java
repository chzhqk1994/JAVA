package 다섯번째과제;

import java.util.Scanner;

public class 입력5 {
    private Scanner sc;
    private 처리기5 process;
    private int num;
    private int [] array;

    public int 입력하기 (){
        sc = new Scanner (System.in);
        num = sc.nextInt ();
        return num;
    }

    public int[] 입력반복 ()
    {
        process = new 처리기5 ();
        array = new int [6];
        
        for (int i = 0; i < 6; i++)
        {
            System.out.println ("숫자를 입력하세요 : ");
            array [i] = sc.nextInt ();
        }

        return array;
    }
}
