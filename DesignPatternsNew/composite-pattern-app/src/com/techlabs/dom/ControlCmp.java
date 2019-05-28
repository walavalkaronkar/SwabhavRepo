package com.techlabs.dom;

import java.util.ArrayList;
import java.util.List;

public class ControlCmp implements IHTMLElement {
	
	private String name;
	private String id;
	private int level;
	private List<IHTMLElement> elements=new ArrayList<IHTMLElement>();
	
	public ControlCmp(String name,String id,int level) {
		this.name=name;
		this.id=id;
		this.level=level;
	}
	
	
	
	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public void addElements(IHTMLElement element)
	{
		elements.add(element);
	}
	

	@Override
	public String generate() {
		String tag="<"+name;
		if(id!=null && id!="")
		{
			tag=tag+" id=\""+id+"\"";
		}
		tag=tag+">\n";
		
		for(IHTMLElement element:elements)
		{
			for(int i=0;i<=level;i++){
				tag=tag+"\t";
			}
			String t=element.generate();
			tag=tag+t+"\n";
		}
		for(int i=0;i<level;i++){
			tag=tag+"\t";
		}
		tag=tag+"</"+name+">";
		return tag;
	}

	
}
