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
import net.dmcloud.loader.client.IDMServiceLoader;
import net.dmcloud.loader.core.*;
import net.dmcloud.loader.core.exception.LoadInputException;
import net.dmcloud.loader.core.exception.LoadOutputException;

class MockDMServiceLoader extends DMServiceLoader
{
	public MockDMServiceLoader()
	{
		super();
		
		SimpleDMService mockDMS = new SimpleDMService();
		List<Attribute> attrs = new ArrayList<Attribute>();
		attrs.add(new Attribute("attr1"));
		attrs.add(new Attribute("attr2"));
		((ConsoleOutput)mockDMS.output).setAttributes(attrs.toArray(new Attribute[0]));
		
		attrs.add(new Attribute("attr3"));
		attrs.add(new Attribute("attr4"));
		((SimpleInput)mockDMS.input).setAttributes(attrs.toArray(new Attribute[0]));
		this.addEntity("1", mockDMS);
	}

	@Override
	protected InputStream getInputStream(String key) throws LoadInputException 
	{
		return null;
	}

	@Override
	protected OutputStream getOutputStream(String key)
			throws LoadOutputException
	{
		return null;
	}

}
