package com.techlabs.guitar.enums;

public enum Wood {

	INDIAN,BRAZILIAN,MAHOGANY,CEDAR,ALDER,SITIKA;
	
	public String toString()
	{
		switch(this)
		{
		case INDIAN:return "indianr";
		case BRAZILIAN:return "brazilian";
		case MAHOGANY:return "mahogany";
		case CEDAR:return "cedar";
		case ALDER:return "alder";
		case SITIKA:return "sitika";
		}
		return null;
	}
}
