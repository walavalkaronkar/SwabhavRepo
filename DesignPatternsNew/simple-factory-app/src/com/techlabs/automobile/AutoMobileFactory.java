package com.techlabs.automobile;

import com.techlabs.automobile.IAutoMobile;

public class AutoMobileFactory {

	public IAutoMobile make(AutoType autotype)
	{
		IAutoMobile automobile=null;
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
