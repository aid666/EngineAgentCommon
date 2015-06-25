package net.dmcloud.dmservice.client;

import java.util.Set;

public interface IModel 
{
	Set<String> getKeys();
	Object getValue(String key);
}
