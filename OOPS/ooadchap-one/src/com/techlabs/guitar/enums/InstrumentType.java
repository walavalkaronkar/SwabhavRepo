package com.techlabs.guitar.enums;

public enum InstrumentType {

	GUITAR,BANJO,DOBRA,FIDDLE,BASS;
	
	public String toString()
	{
		switch(this)
		{
		case GUITAR:return "Guitar";
		case BANJO: return "Banjo";
		case DOBRA:	return "Dobra";
		case FIDDLE:return "Fiddle";
		case BASS: 	return "Bass";
		default: return "Unspecified";
		}
	}
}
