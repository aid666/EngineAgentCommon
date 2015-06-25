package net.dmcloud.cep.data.model;

import net.dmcloud.cep.data.Attribute;
import net.dmcloud.cep.data.IData;
import net.dmcloud.cep.data.IDataMetadata;
import net.dmcloud.cep.data.IObservationProvider;

public abstract class Data implements IData  
{
	private IDataMetadata _metadata;
	private Attribute[] _attrs;
	private IObservationProvider _provider;
	
	public Data() 
	{
		super();
		_provider = populateProvider();
	}

	protected abstract IObservationProvider populateProvider();

	@Override
	public IDataMetadata getMetadata() 
	{
		return _metadata;
	}

	protected void setMetadata(IDataMetadata value)
	{
		_metadata = value;
	}

	@Override
	public Attribute[] getAttributes()
	{
		return _attrs;
	}
	
	protected void setAttributes(Attribute[] values)
	{
		_attrs = values;
	}

	@Override
	public IObservationProvider getDataProvider() 
	{
		return _provider;
	}
}