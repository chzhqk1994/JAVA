package �ټ���°����;

import java.util.Scanner;

public class �Է�5 {
    private Scanner sc;
    private ó����5 process;
    private int num;
    private int [] array;

    public int �Է��ϱ� (){
        sc = new Scanner (System.in);
        num = sc.nextInt ();
        return num;
    }

    public int[] �Է¹ݺ� ()
    {
        process = new ó����5 ();
        array = new int [6];
        
        for (int i = 0; i < 6; i++)
        {
            System.out.println ("���ڸ� �Է��ϼ��� : ");
            array [i] = sc.nextInt ();
        }

        return array;
    }
}
