package net.dmcloud.engine.server;

import net.dmcloud.engine.*;
import net.dmcloud.engine.exceptions.*;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

@Service
public class DMCloudEngine implements IDMCloudEngine
{
	@Override
    public int getMaxTaskCount()
    {
      return 10;
    }

	@Override
	public Task getTask(String key) throws EventNotFoundException 
	{
		// TODO Auto-generated method stub
		return null;
	}

    //List<Task> getTasks(Filter filter);

    //Task getTask(String key) throws EventNotFoundException;

	@Override
	public Task createTask(Event event) 
	{
		return null;
	}

    //Task stopTask(String key) throws EventNotFoundException;
}
