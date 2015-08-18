package net.dmcloud.engine;

import net.dmcloud.engine.exceptions.*;
import java.util.*;

public interface IDMCloudEngine
{
    List<ITask> getTasks(Filter filter);

    ITask getTask(String key) throws EventNotFoundException;

    ITask createTask(IEvent event) throws EventNotFoundException;

    ITask stopTask(String key) throws EventNotFoundException;
}
