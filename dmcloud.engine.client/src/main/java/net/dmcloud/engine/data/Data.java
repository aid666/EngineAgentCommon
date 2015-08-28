package net.dmcloud.engine.data;

import net.dmcloud.engine.*;

public abstract class Data extends Event
{
	private DataMetadata _metadata;
	private Attribute[] _attrs;

	public Data()
	{
		super();
	}

	public DataMetadata getMetadata()
	{
		return _metadata;
	}

	protected void setMetadata(DataMetadata value)
	{
		_metadata = value;
	}

	public Attribute[] getAttributes()
	{
		return _attrs;
	}

	protected void setAttributes(Attribute[] values)
	{
		_attrs = values;
	}

}
