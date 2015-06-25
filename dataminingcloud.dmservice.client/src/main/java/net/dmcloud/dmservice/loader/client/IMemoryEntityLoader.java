package net.dmcloud.dmservice.loader.client;

import net.dmcloud.dmservice.client.exception.LoadException;
import net.dmcloud.dmservice.client.exception.SaveException;

public interface IMemoryEntityLoader<T, INS_T> extends IEntityLoader<T>
{
	void loadEntity(String key) throws LoadException;
	void saveEntity(String key) throws SaveException;
	
	T importFromInstance(INS_T instance);

	INS_T exportToInstance(T entity);

}