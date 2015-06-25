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

import net.dmcloud.core.data.Attribute
import net.dmcloud.core.input.SimpleInput
import net.dmcloud.core.model.SimpleDMService
import net.dmcloud.core.output.ConsoleOutput
import net.dmcloud.loader.client.IDMServiceMetadataLoader;
import net.dmcloud.loader.client.IDMServiceLoader;
import net.dmcloud.loader.core.*;
import net.dmcloud.loader.core.exception.LoadInputException;
import net.dmcloud.loader.core.exception.LoadOutputException;
import net.dmcloud.loader.model.Filter;
import net.dmcloud.loader.model.Metadata;
import net.dmcloud.loader.model.ServiceMetadata
import net.dmcloud.loader.model.ServiceMetadataFilter

class MockDMServiceMetadataLoader implements IDMServiceMetadataLoader
{
	private HashMap<String, ServiceMetadata> _metadata;
	
	public MockDMServiceMetadataLoader()
	{
		super();
		_metadata = new HashMap<String, ServiceMetadata>();
		
		ServiceMetadata mock = new ServiceMetadata("1");
		mock.setName("Simple Classfifer");
		mock.setDescription("The mock DM Service");
		mock.setType("Mock");
		
		_metadata.put(mock.key, mock);
		
	}

	@Override
	public ServiceMetadata getEntity(String key)
	{
		ServiceMetadata mock = new ServiceMetadata(key);
		mock.setName(key);
		return mock;
	}

	@Override
	public void addEntity(String key, ServiceMetadata meta)
	{
		_metadata.put(key, meta);
	}

	@Override
	public boolean deleteEntity(String key)
	{
		return false;
	}

	public List<ServiceMetadata> fetchEntity(Filter<ServiceMetadata> filter)
	 {
		return _metadata.values().toList();
	}
}
