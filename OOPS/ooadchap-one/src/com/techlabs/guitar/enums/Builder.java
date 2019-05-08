package com.techlabs.guitar.enums;

public enum Builder {
	FENDER,MARTIN,GIBSON,COLLINGS,OLSON,ANY;
	
	public String toString()
	{
		switch(this)
		{
		case FENDER:return "fender";
		case MARTIN:return "martin";
		case GIBSON:return "gibson";
		case COLLINGS:return "collings";
		case OLSON:return "olson";
		case ANY:return "any";
		}
		return null;
	}

}
