package net.dmcloud.cep.data.model;

import net.dmcloud.cep.data.ArrayObservationProvider;
import net.dmcloud.cep.data.IObservationProvider;
import net.dmcloud.cep.data.Observation;


public class ArrayData extends Data 
{
	private ArrayObservationProvider _arrayProvider;
	
	public ArrayData(Object[][] data)
	{
		super();
		_arrayProvider.feed(data);
	}
	
	public ArrayData(Observation[] data)
	{
		super();
		_arrayProvider.setObservations(data);
	}
	
	@Override
	protected IObservationProvider populateProvider() 
	{
		if(_arrayProvider == null)
		{
			_arrayProvider = new ArrayObservationProvider();
		}
		return _arrayProvider;
	}
	
}
