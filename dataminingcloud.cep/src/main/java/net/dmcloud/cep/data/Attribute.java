package net.dmcloud.cep.data;

public class Attribute
{
	private String name;
	private String key;
	private String description;
	private String type;
	
	public Attribute(String name)
	{
		setName(name);
		setKey(name);
		setType("text");
	}
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getKey() 
	{
		return key;
	}
	public void setKey(String key) 
	{
		this.key = key;
	}
	
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description) 
	{
		this.description = description;
	}
	
	public String getType() 
	{
		return type;
	}
	public void setType(String type) 
	{
		this.type = type;
	}
	
	
}
