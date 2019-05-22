package com.techlabs.automobile;

public class AudiFactory implements IAutoMobileFactory {

	private static AudiFactory container=null;
	private AudiFactory() {}
	
	public static AudiFactory getInstance()
	{
		if(container==null)
		{
			container=new AudiFactory();
		}
		return container;
	}
	@Override
	public IAutoMobile make()
	{
		return new Audi();
	}

}
