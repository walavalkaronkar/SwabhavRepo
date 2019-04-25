package com.techlabs;

public class ArgsTest {

	public static void main(String[] args) {
		
		int argsLength=args.length;
		if(argsLength > 0)
		{
			for(String argsElement:args)
			{
				System.out.println("Hello "+argsElement);
			}
		}
		else
		{
			System.out.println("No Arguements passed");
		}
		
	}

}
