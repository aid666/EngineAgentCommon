package net.dmcloud.engine.data;

import java.util.*;

public class ArrayObservationProvider
{

	private Observation[] _observ;

	public Observation[] getObserveration()
	{
		return _observ;
	}

	public void feed(Object[][] data)
	{
		_observ = null;
		if(data != null)
		{
			List<Observation> list = new ArrayList<Observation>();
			for(Object[] row : data)
			{
				list.add(Observation.loadFromArray(row));
			}
			_observ = list.toArray(new Observation[0]);
		}
	}

	public void setObservations(Observation[] data)
	{
		_observ = data;
	}

}
