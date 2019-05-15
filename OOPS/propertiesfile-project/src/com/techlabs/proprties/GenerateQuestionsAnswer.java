package com.techlabs.proprties;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenerateQuestionsAnswer {

	String question=null;
	String state;
	String capital;
	public String getCapital()
	{
		return capital;
	}
	public String generateQuestion() throws IOException
	{
		GiveList give=new GiveList();
		List list=give.giveAllStates();
		int n=list.size();
		
		int random=(int)(Math.random()*1000);
		random=random % n;
		
		state=(String)list.get(random);
		
		question="What is Capital of "+state+"?";
		return question;
		
	}
	
	public List generateOptions() throws IOException
	{
		List options=new ArrayList();
		GiveList give=new GiveList();
		List capitals=give.giveListOfCapitals();
		boolean flag=true;
		while(flag==true)
		{
			int random =(int)(Math.random()*1000);
			random=random % capitals.size();
			
			String c=(String)capitals.get(random);
			if(!options.contains(c))
			{
				options.add(c);
				if(options.size()==4)
				{
					flag=false;
				}
			}
			
		}
		int random =(int)(Math.random()*1000);
		random=random % options.size();
		capital=give.getCaptial(state);
		
		if(!options.contains(capital))
		{
			options.add(random, capital);
		}
		else
		{
			random =(int)(Math.random()*1000);
			random=random % capitals.size();
			
			String c=(String)capitals.get(random);
			if(!options.contains(c))
			{
				options.add(c);
			}
		}
		
		return options;
	}
	
}
