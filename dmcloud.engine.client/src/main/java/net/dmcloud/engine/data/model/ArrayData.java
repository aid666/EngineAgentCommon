package net.dmcloud.engine.data.model;

import net.dmcloud.engine.data.ArrayObservationProvider;
import net.dmcloud.engine.data.IObservationProvider;
import net.dmcloud.engine.data.Observation;


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
