package net.dmcloud.dmservice.output;

import net.dmcloud.cep.data.Attribute;
import net.dmcloud.cep.data.IData;
import net.dmcloud.dmservice.client.IOutput;

public class ConsoleOutput implements IOutput 
{
	private IData _data;
	
	@Override
	public void output(IData data) 
	{
		_data = data;
		System.out.println("Output:" + data);
	}

	@Override
	public IData getData() 
	{
		return _data;
	}

	@Override
	public Attribute[] getInputAttributes()
	{
		return null;
	}

	@Override
	public Attribute[] getOutputAttributes()
	{
		return null;
	}

}
