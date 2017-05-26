package make_TextArea;

import java.awt.*;

public class TextAreaExample extends Frame{
	TextArea TA;
	
	TextAreaExample(){
		TA = new TextArea("Welcome to javapoint");
		TA.setBounds(30, 50, 300, 300);
		add(TA);
		
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String args[]){
		TextAreaExample TAE = new TextAreaExample();
	}

}
