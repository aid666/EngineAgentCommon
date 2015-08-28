package net.dmcloud.engine.data;


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


}
