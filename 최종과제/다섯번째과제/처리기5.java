package �ټ���°����;

public class ó����5 {
    private ���5 output;
    private int i;

    public ó����5 ()
    {
        output = new ���5 ();
    }

    public void �� (int[] array)
    {
        int sum = 0;

        for (i = 0; i < array.length; i++)
            sum += array [i];
        output.����� (sum);
    }

    public void ū�� (int [] array)
    {
        int �ִ밪, �ӽú���;

        �ִ밪 = array [0];
        for (i = 1; i < array.length; i++)
        {
            if (�ִ밪 < array[i])
            {
                �ӽú��� = array [i];
                array [i] = �ִ밪;
                �ִ밪 = �ӽú���;
            }
        }

        output.ū����� (�ִ밪);
    }

    public void Ȧ¦�� (int [] array)
    {
        int ¦�� = 0;

        for (i = 0; i < array.length; i++)
            if (array [i] % 2 == 0) ¦��++;
        output.Ȧ¦�� (array.length, ¦��);
    }

    public void ���� (int [] array){
        int �ӽú���;
        int �迭���� = array.length;

        for (i = 0; i < �迭���� - 1; i++)
            for (int j = 1; j < �迭���� - i; j++)
            {
                if (array [j] > array [j - 1])
                {
                    �ӽú��� = array [j - 1];
                    array [j - 1] = array [j];
                    array [j] = �ӽú���;
                }
            }
            output.���� (array);
    }
}
