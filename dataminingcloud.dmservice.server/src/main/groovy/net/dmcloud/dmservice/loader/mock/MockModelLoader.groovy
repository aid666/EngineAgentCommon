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

class MockModelLoader extends ModelLoader
{
	public MockModelLoader()
	{
		super();
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
