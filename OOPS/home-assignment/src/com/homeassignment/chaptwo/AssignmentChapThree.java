package com.homeassignment.chaptwo;

public class AssignmentChapThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int yvalue=0;
		int[] index=new int[4];
		String[] islands=new String[4];
		int ref;
		
		 index[0] = 1;    
		 index[1] = 3;    
		 index[2] = 0;    
		 index[3] = 2;
		 
		 islands[0] = "Bermuda";    
		 islands[1] = "Fiji";    
		 islands[2] = "Azores";    
		 islands[3] = "Cozumel"; 
		while(yvalue<4)
		{
			ref = index[yvalue];      
			System.out.print("island = ");      
			System.out.println(islands[ref]);      
			yvalue = yvalue + 1; 
		}
		
	}

}
