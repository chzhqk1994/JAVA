package 다섯번째과제;

public class 처리기5 {
    private 출력5 output;
    private int i;

    public 처리기5 ()
    {
        output = new 출력5 ();
    }

    public void 합 (int[] array)
    {
        int sum = 0;

        for (i = 0; i < array.length; i++)
            sum += array [i];
        output.합출력 (sum);
    }

    public void 큰수 (int [] array)
    {
        int 최대값, 임시변수;

        최대값 = array [0];
        for (i = 1; i < array.length; i++)
        {
            if (최대값 < array[i])
            {
                임시변수 = array [i];
                array [i] = 최대값;
                최대값 = 임시변수;
            }
        }

        output.큰수출력 (최대값);
    }

    public void 홀짝수 (int [] array)
    {
        int 짝수 = 0;

        for (i = 0; i < array.length; i++)
            if (array [i] % 2 == 0) 짝수++;
        output.홀짝수 (array.length, 짝수);
    }

    public void 순서 (int [] array){
        int 임시변수;
        int 배열길이 = array.length;

        for (i = 0; i < 배열길이 - 1; i++)
            for (int j = 1; j < 배열길이 - i; j++)
            {
                if (array [j] > array [j - 1])
                {
                    임시변수 = array [j - 1];
                    array [j - 1] = array [j];
                    array [j] = 임시변수;
                }
            }
            output.순서 (array);
    }
}
