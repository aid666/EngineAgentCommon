package net.dmcloud.dmservice.loader.mock;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.dmcloud.loader.core.*;

class MockModelMetadataLoader implements IModelMetadataLoader
{
	private HashMap<String, ModelMetadata> _metadata;
	
	public MockModelMetadataLoader()
	{
		super();
		_metadata = new HashMap<String, ModelMetadata>();
		
		ModelMetadata mock = new ModelMetadata("1");
		mock.setName("Simple model");
		mock.setDescription("The mock model");
		mock.setType("Mock");
		
		_metadata.put(mock.key, mock);
		
	}

	@Override
	public List<ModelMetadata> fetchEntity(Filter<ModelMetadata> filter)
	{
		return _metadata.values().toList();
	}

	@Override
	public ModelMetadata getEntity(String key) 
	{
		return null;
	}

	@Override
	public void addEntity(String key, ModelMetadata entity) 
	{
		
	}

	@Override
	public boolean deleteEntity(String key) 
	{
		return false;
	}
}
