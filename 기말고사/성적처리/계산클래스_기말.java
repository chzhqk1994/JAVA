package ����ó��;

import java.awt.*;

public class ���Ŭ����_�⸻ {
	private int ���;
	private String ����;
	
	public int ������� (TextField �й�txt, TextField �̸�txt, TextField �߰�txt, TextField �⸻txt, TextField �⼮txt, TextField ����txt, 
			String �߰�����, String �⸻����, String �⼮����, String ��������){

		��� = (int) // Double ���� int ������ ĳ���ú�ȯ
			((Integer.parseInt (�߰�txt.getText ()) * Double.parseDouble (�߰�����)) + 
			(Integer.parseInt (�⸻txt.getText ()) * Double.parseDouble (�⸻����)) + 
			(Integer.parseInt (�⼮txt.getText ()) * Double.parseDouble (�⼮����)) + 
			(Integer.parseInt (����txt.getText ()) * Double.parseDouble (��������)));
		
		return ���;
	}
	
	public String ������� (int ����, String Aplus, String Azero, String Aminor, String Bplus, String Bzero, String Bminor, String Cplus, String Czero, String Cminor, String Dplus, String Dzero, String Dminor){
		
		if (���� > Integer.parseInt (Aplus))
			���� = "A+";
		
		else if (Integer.parseInt (Aplus) >= ���� && ���� > Integer.parseInt (Azero))
			���� = "A0";
		
		else if (Integer.parseInt (Azero) >= ���� && ���� > Integer.parseInt (Aminor))
			���� = "A-";
		
		else if (Integer.parseInt (Aminor) >= ���� && ���� > Integer.parseInt (Bplus))
			���� = "B+";
		
		else if (Integer.parseInt (Bplus) >= ���� && ���� > Integer.parseInt (Bzero))
			���� = "B0";
		
		else if (Integer.parseInt (Bzero) >= ���� && ���� > Integer.parseInt (Bminor))
			���� = "B-";
		
		else if (Integer.parseInt (Bminor) >= ���� && ���� > Integer.parseInt (Cplus))
			���� = "C+";
		
		else if (Integer.parseInt (Cplus) >= ���� && ���� > Integer.parseInt (Czero))
			���� = "C0";
		
		else if (Integer.parseInt (Czero) >= ���� && ���� > Integer.parseInt (Cminor))
			���� = "C-";
		
		else if (Integer.parseInt (Cminor) >= ���� && ���� > Integer.parseInt (Dplus))
			���� = "D+";
		
		else if (Integer.parseInt (Dplus) >= ���� && ���� > Integer.parseInt (Dzero))
			���� = "D0";
		
		else if (Integer.parseInt (Dzero) >= ���� && ���� > Integer.parseInt (Dminor))
			���� = "D-";
		
		else
			���� = "F";
		
		return ����;

	}
}
