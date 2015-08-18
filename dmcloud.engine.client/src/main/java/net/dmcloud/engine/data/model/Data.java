package net.dmcloud.engine.data.model;

import net.dmcloud.engine.data.Attribute;
import net.dmcloud.engine.data.IData;
import net.dmcloud.engine.data.IDataMetadata;
import net.dmcloud.engine.data.IObservationProvider;

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
