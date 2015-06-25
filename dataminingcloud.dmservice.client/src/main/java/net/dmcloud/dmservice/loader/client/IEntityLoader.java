package net.dmcloud.dmservice.loader.client;

public interface IEntityLoader<T> 
{
	public abstract T getEntity(String key);

	public abstract void addEntity(String key, T entity);

	public abstract boolean deleteEntity(String key);

}