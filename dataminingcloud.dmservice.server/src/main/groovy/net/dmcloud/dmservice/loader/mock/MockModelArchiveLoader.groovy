package net.dmcloud.dmservice.loader.mock

import java.util.List

import net.dmcloud.loader.client.IArchiveLoader;
import net.dmcloud.loader.model.Archive;
import net.dmcloud.loader.model.Filter;

class MockModelArchiveLoader implements IArchiveLoader 
{

	private Map<String, Archive> _map;
	
	public MockArchiveLoader()
	{
		_map = new HashMap<String, Archive>();
	}
	
	@Override
	public List<Archive> fetchEntity(Filter<Archive> filter) 
	{
		return _map.values().toList();
	}

	@Override
	public Archive getEntity(String key) 
	{
		return _map.get(key);
	}

	@Override
	public void addEntity(String key, Archive entity) 
	{
		_map.put(key, entity);
	}

	@Override
	public boolean deleteEntity(String key) 
	{
		return _map.remove(key);
	}

}
