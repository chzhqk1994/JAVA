package 성적처리;

import java.awt.*;

public class 계산클래스_기말 {
	private int 계산;
	private String 학점;
	
	public int 총점계산 (TextField 학번txt, TextField 이름txt, TextField 중간txt, TextField 기말txt, TextField 출석txt, TextField 과제txt, 
			String 중간비율, String 기말비율, String 출석비율, String 과제비율){

		계산 = (int) // Double 형을 int 형으로 캐스팅변환
			((Integer.parseInt (중간txt.getText ()) * Double.parseDouble (중간비율)) + 
			(Integer.parseInt (기말txt.getText ()) * Double.parseDouble (기말비율)) + 
			(Integer.parseInt (출석txt.getText ()) * Double.parseDouble (출석비율)) + 
			(Integer.parseInt (과제txt.getText ()) * Double.parseDouble (과제비율)));
		
		return 계산;
	}
	
	public String 학점계산 (int 총점, String Aplus, String Azero, String Aminor, String Bplus, String Bzero, String Bminor, String Cplus, String Czero, String Cminor, String Dplus, String Dzero, String Dminor){
		
		if (총점 > Integer.parseInt (Aplus))
			학점 = "A+";
		
		else if (Integer.parseInt (Aplus) >= 총점 && 총점 > Integer.parseInt (Azero))
			학점 = "A0";
		
		else if (Integer.parseInt (Azero) >= 총점 && 총점 > Integer.parseInt (Aminor))
			학점 = "A-";
		
		else if (Integer.parseInt (Aminor) >= 총점 && 총점 > Integer.parseInt (Bplus))
			학점 = "B+";
		
		else if (Integer.parseInt (Bplus) >= 총점 && 총점 > Integer.parseInt (Bzero))
			학점 = "B0";
		
		else if (Integer.parseInt (Bzero) >= 총점 && 총점 > Integer.parseInt (Bminor))
			학점 = "B-";
		
		else if (Integer.parseInt (Bminor) >= 총점 && 총점 > Integer.parseInt (Cplus))
			학점 = "C+";
		
		else if (Integer.parseInt (Cplus) >= 총점 && 총점 > Integer.parseInt (Czero))
			학점 = "C0";
		
		else if (Integer.parseInt (Czero) >= 총점 && 총점 > Integer.parseInt (Cminor))
			학점 = "C-";
		
		else if (Integer.parseInt (Cminor) >= 총점 && 총점 > Integer.parseInt (Dplus))
			학점 = "D+";
		
		else if (Integer.parseInt (Dplus) >= 총점 && 총점 > Integer.parseInt (Dzero))
			학점 = "D0";
		
		else if (Integer.parseInt (Dzero) >= 총점 && 총점 > Integer.parseInt (Dminor))
			학점 = "D-";
		
		else
			학점 = "F";
		
		return 학점;

	}
}
