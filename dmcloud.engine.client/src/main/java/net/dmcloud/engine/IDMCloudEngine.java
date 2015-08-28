package net.dmcloud.engine;

import net.dmcloud.engine.exceptions.*;
//import java.util.*;

public interface IDMCloudEngine
{
    int getMaxTaskCount();
    
    //List<Task> getTasks(Filter filter);

    Task getTask(String key) throws EventNotFoundException;

    Task createTask(Event event);

    //Task stopTask(String key) throws EventNotFoundException;
}
