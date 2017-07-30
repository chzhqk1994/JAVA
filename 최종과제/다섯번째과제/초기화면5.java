package 다섯번째과제;

public class 초기화면5 {
    private 입력5 input;
    private 처리기5 process;
    private int select;
    private int [] array;

    public void 선택 ()
    {
        input = new 입력5 ();
        process = new 처리기5 ();
        array = new int [6];

        System.out.println ("1.합 출력      2. 제일 큰 수 출력     3. 홀수 짝수 개수 출력      4. 큰 순으로 배열");
        select = input.입력하기 ();

        array = input.입력반복 ();

        switch (select)
        {
            case 1:
                process.합 (array);
                break;

            case 2:
                process.큰수 (array);
                break;

            case 3:
                process.홀짝수 (array);
                break;

            case 4:
                process.순서 (array);
                break;

            default:
                System.out.println ("잘못된 입력 입니다.");
        }
    }
}
