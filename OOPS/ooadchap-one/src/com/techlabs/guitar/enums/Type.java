package com.techlabs.guitar.enums;

public enum Type {

	ACOSTIC,ELECTRIC;
	
	public String toString()
	{
		switch(this)
		{
		case ACOSTIC:return "acostic";
		case ELECTRIC:return "electric";
		}
		return null;
	}
}
