package net.dmcloud.dmservice.loader.client;

import net.dmcloud.dmservice.model.Archive;
import net.dmcloud.dmservice.model.Entity;

public interface IArchiveLoader<T extends Archive, E_T extends Entity> extends IEntityFilterLoader<T>
{
}
