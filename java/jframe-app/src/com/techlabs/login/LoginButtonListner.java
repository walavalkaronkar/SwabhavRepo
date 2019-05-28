package com.techlabs.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginButtonListner implements ActionListener{

	LoginFrame frame;
	public LoginButtonListner(LoginFrame frame) {
		this.frame=frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		 	String s1=frame.tf1.getText();  
	        String s2=frame.tf2.getText();  
	        String c="";
	       
	        if(e.getSource()==frame.b1){  
	            c="hello"+s1;  
	        }
	        String result=String.valueOf(c);  
	        frame.tf3.setText(result);  
	        ResultFrame frame2=new ResultFrame(s1);
		
	}

}
