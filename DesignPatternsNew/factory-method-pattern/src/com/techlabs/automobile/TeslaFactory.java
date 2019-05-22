package com.techlabs.automobile;

public class TeslaFactory implements IAutoMobileFactory {

	private static TeslaFactory container=null;
	private TeslaFactory() {}
	
	public static TeslaFactory getInstance()
	{
		if(container==null)
		{
			container=new TeslaFactory();
		}
		return container;
	}
	@Override
	public IAutoMobile make()
	{
		return new Tesla();
	}

}
