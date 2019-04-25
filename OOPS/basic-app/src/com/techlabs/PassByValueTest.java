package com.techlabs;

public class PassByValueTest {

	public static void main(String[] args) {
		int marks=100;
		int marksArray[]={10,20,30};
		changeMarkToZero(marks);
		System.out.println(marks);
		
		System.out.println("In main Hashocde of marksArray is: "+marksArray.hashCode());
		changeMarksToZero(marksArray);
		for(int mark:marksArray)
		{
			System.out.println(mark);
		}
		

	}
	private static void changeMarkToZero(int marks)
	{
		marks=0;
	}
	private static void changeMarksToZero(int[] markArray)
	{
		System.out.println("In changeMarksToZero hashcode of markArray is: "+markArray.hashCode());
		for(int index=0;index <markArray.length;index++ )
		{
			markArray[index]=0;
		}
	}

}
