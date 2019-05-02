package com.swbhavtechlabs.myexception;

public class Even {

	private int number;
	public boolean isEven(int number)
	{
		if(number%2 ==0)
		{
			//try
			//{	
				throw new NotEvenException();
			//}
			//catch(Exception e)
			//{
			//	e.printStackTrace();
			//	return true;
			//}
			
		}
		return false;
		
	}
}
