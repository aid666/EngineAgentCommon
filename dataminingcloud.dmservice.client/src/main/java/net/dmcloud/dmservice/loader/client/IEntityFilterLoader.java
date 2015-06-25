package net.dmcloud.dmservice.loader.client;

import java.util.List;

import net.dmcloud.dmservice.model.Filter;

public interface IEntityFilterLoader<T> extends IEntityLoader<T>
{
	List<T> fetchEntity(Filter<T> filter);
}