package net.dmcloud.cep.data;

import net.dmcloud.cep.IEvent;


public interface IData extends IEvent
{
	IDataMetadata getMetadata();
	Attribute[]   getAttributes();
	
	IObservationProvider getDataProvider();
}
