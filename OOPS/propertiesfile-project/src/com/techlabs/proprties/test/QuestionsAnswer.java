package com.techlabs.proprties.test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.techlabs.proprties.GenerateQuestionsAnswer;
import com.techlabs.proprties.GiveList;

public class QuestionsAnswer {

	public static void main(String[] args) throws IOException {
		GenerateQuestionsAnswer generate=new GenerateQuestionsAnswer();
		//GiveList get=new GiveList();
		String questions=generate.generateQuestion();
		System.out.println(questions);
		List options=generate.generateOptions();
		Iterator iterate=options.iterator();
		int i=1;
		while(iterate.hasNext())
		{
			System.out.println(i+" :"+iterate.next());
			i++;
		}
		
		Scanner scn=new Scanner(System.in);
		String ans=scn.nextLine();
		
		String capital=generate.getCapital();
		if(capital.equalsIgnoreCase(ans))
		{
			System.out.println("Answer Coreect");
		}
		else
		{
			System.out.println("Wrong answer");
			System.out.println("Answer is:"+capital);
		}
	}

}
