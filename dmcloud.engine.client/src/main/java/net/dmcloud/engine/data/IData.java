package net.dmcloud.engine.data;

import net.dmcloud.engine.IEvent;


public interface IData extends IEvent
{
	IDataMetadata getMetadata();
	Attribute[]   getAttributes();

	IObservationProvider getDataProvider();
}
