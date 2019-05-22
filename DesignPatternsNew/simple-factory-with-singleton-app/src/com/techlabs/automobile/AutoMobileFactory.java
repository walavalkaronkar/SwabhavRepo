package com.techlabs.automobile;

import com.techlabs.automobile.IAutoMobile;

public class AutoMobileFactory {

	public static AutoMobileFactory container=null;
	private AutoMobileFactory(){}
	
	public static AutoMobileFactory getInstance()
	{
		if(container==null)
		{
			container=new AutoMobileFactory();
		}
		return container;
	}
	
	public IAutoMobile make(AutoType autotype)
	{
		IAutoMobile automobile=null;
		Class clas=automobile.getClass();
		
		if(autotype==AutoType.BMW)
		{
			automobile=new BMW();
		}
		else if(autotype==AutoType.AUDI)
		{
			automobile=new Audi();
		}
		else if(autotype==AutoType.TESLA)
		{
			automobile=new Tesla();
		}
		return automobile;
	}
}
