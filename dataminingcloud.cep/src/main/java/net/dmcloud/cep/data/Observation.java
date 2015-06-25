package net.dmcloud.cep.data;

import java.util.HashMap;

public class Observation
{
	private HashMap<String, Object> values = new HashMap<String, Object>();
	
	public HashMap<String, Object> getValues() 
	{
		return values;
	}
	public void setValues(HashMap<String, Object> values) 
	{
		this.values = values;
	}



	public static Observation loadFromArray(Object[] row) 
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
