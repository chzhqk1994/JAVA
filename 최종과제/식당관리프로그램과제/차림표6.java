package 식당관리프로그램과제;

public class 차림표6{
    public int[] 음식코드;
    public String[] 음식;
    private int[] 가격;

    차림표6(){
        음식코드 = new int [] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 101, 102, 0};
        음식 = new String [] {"갈비탕", "비빔밥", "설렁탕", "고기국밥", "순대국밥", "고기국수", "멸치국수", "비빔국수", "냉면", "소주", "막걸리", "음료수", "에러"};
        가격 = new int [] {7000, 6000, 8000, 4500, 4500, 5000, 5000, 5000, 5000, 3500, 3500, 2000, 0};
    }

    String 음식명얻기 (int 코드){
        int 배열번호 = 0;

        for(int i = 0;  i < 음식코드.length; i++){
            if (음식코드 [i] == 코드){
                배열번호 = i;
            }
        }

        return 음식 [배열번호];
    }

    public int 가격얻기 (int 코드){
        int 배열번호 = 0;

        for (int i = 0;  i < 음식코드.length; i++){
            if (음식코드 [i] == 코드){
                배열번호 = i;
            }
        }
        return 가격 [배열번호];
    }

    public static void main (String args []){
        차림표6 차림 = new 차림표6 ();
        String 음식명;

        음식명 = 차림.음식명얻기 (10);
        System.out.println (음식명);
    }
}
