package �ټ���°����;

public class �ʱ�ȭ��5 {
    private �Է�5 input;
    private ó����5 process;
    private int select;
    private int [] array;

    public void ���� ()
    {
        input = new �Է�5 ();
        process = new ó����5 ();
        array = new int [6];

        System.out.println ("1.�� ���      2. ���� ū �� ���     3. Ȧ�� ¦�� ���� ���      4. ū ������ �迭");
        select = input.�Է��ϱ� ();

        array = input.�Է¹ݺ� ();

        switch (select)
        {
            case 1:
                process.�� (array);
                break;

            case 2:
                process.ū�� (array);
                break;

            case 3:
                process.Ȧ¦�� (array);
                break;

            case 4:
                process.���� (array);
                break;

            default:
                System.out.println ("�߸��� �Է� �Դϴ�.");
        }
    }
}
