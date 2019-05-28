package com.techlabs.dom;

public class Control implements IHTMLElement {

	private String name;
	private String type;
	private String id;
	private String data;
	private String label;
	
	public Control(String name,String type,String id,String data,String label) {
		this.name=name;
		this.type=type;
		this.id=id;
		this.data=data;
		this.label=label;
	}
	
	@Override
	public String generate() {
		String tag="";
		if(label!=null && label!="")
		{
			tag=tag+label+" ";
		}
		tag=tag+"<"+name;
		if(type!=null && type!="")
		{
			tag=tag+" type=\""+type+"\"";
		}
		if(id!=null && id!="")
		{
			tag=tag+" id=\""+id+"\"";
		}
		tag=tag+">";
		if(data !=null && data!="")
		{
			tag=tag+data;
		}
		tag=tag+"</"+name+">";
		return tag;
	}

}
