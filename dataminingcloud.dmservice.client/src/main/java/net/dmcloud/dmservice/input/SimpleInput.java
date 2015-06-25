package net.dmcloud.dmservice.input;

import net.dmcloud.cep.data.Attribute;
import net.dmcloud.cep.data.IData;
import net.dmcloud.dmservice.client.IInput;

public class SimpleInput implements IInput 
{
	private IData _data;
	private Attribute[] _attrs;
	
	public SimpleInput()
	{}
	
	@Override
	public IData getData()
	{
		IData result = null;
		if(_data != null)
		{
			result = _data;
			_data = null;
		}
		return result;
	}

	@Override
	public boolean hasData() 
	{
		return _data != null;
	}

	@Override
	public Attribute[] getInputAttributes()
	{
		return _attrs;
	}

	@Override
	public Attribute[] getOutputAttributes()
	{
		return _attrs;
	}
	
	public void setAttributes(Attribute[] attrs)
	{
		_attrs = attrs;
	}

	public void setData(IData data)
	{
		_data = data;
	}
}
