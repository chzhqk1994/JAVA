package make_Table;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;    
public class TableExample extends Frame{    
    String data[][]={ 
    				{"101","Amit","670000"},    
    				{"102","Jai","780000"},    
    				{"101","Sachin","700000"}};    
    String column[]={"ID","NAME","SALARY"};     

    TableExample(){ 
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    add(sp);          
    setSize(300,400);    
    setVisible(true);
    
    WindowAdapter WA = new WindowAdapter(){
		public void windowClosing(WindowEvent windowEvent){
			System.exit(0);
		}
	};
	addWindowListener(WA);
}     
public static void main(String[] args) {    
    new TableExample();    
}    
}  