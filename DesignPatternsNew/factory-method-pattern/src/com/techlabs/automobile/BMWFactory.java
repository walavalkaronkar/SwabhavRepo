package com.techlabs.automobile;

public class BMWFactory implements IAutoMobileFactory{
	private static BMWFactory container=null;
	private BMWFactory() {}
	
	public static BMWFactory getInstance()
	{
		if(container==null)
		{
			container=new BMWFactory();
		}
		return container;
	}
	@Override
	public IAutoMobile make()
	{
		return new BMW();
	}

}
