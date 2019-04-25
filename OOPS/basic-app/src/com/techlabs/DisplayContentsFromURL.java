package com.techlabs;

public class DisplayContentsFromURL {

	public static void main(String[] args) {
		
		displayContentsUsingSplit(args);
		displayContentUsingSubString(args);
		
		

	}

	private static void displayContentsUsingSplit(String[] args) {
		if(args.length>0)
		{
			System.out.println(args[0]);
		
			if(args[0].contains("."))
			{
				String[] urlContents=args[0].split("\\.");
				System.out.println(urlContents[1]);
				
				if(urlContents[2].contains("?"))
				{
					String[] urlParameters=urlContents[2].split("\\?");
					System.out.println(urlParameters[1]);
					
					if(urlParameters[1].contains("&"))
					{
						String[] urlsecondParameters=urlParameters[1].split("\\&");
						System.out.println(urlsecondParameters[0]);
					}
				}
			}	
		}
	}

	private static void displayContentUsingSubString(String[] args) {
		if(args.length >0)
		{
			String myURL=args[0];
			int indexOfFirstDot=myURL.indexOf(".");
			int indexOfSecondDot=myURL.indexOf('.', indexOfFirstDot+1);
			int indexOfQuestionMark=myURL.indexOf("?");
			//int indexOfSecondQuestionMark=myURL.indexOf('?',indexOfQuestionMark);
		
			System.out.println(myURL.substring(indexOfFirstDot+1, indexOfSecondDot));
			if(myURL.substring(indexOfQuestionMark+1).contains("&"))
			{
				int indexOfSecondQuestionMark=myURL.substring(indexOfQuestionMark+1).indexOf("&");
				System.out.println(myURL.substring(indexOfQuestionMark+1,indexOfQuestionMark+indexOfSecondQuestionMark+1));
			}
			else if(indexOfQuestionMark>0)
			{
				System.out.println(myURL.substring(indexOfQuestionMark+1));
			}
		}
	}

}




