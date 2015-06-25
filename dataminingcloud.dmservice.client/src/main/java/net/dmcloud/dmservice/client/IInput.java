package net.dmcloud.dmservice.client;

import net.dmcloud.cep.data.IData;

public interface IInput  extends IDataProcesser
{
	IData getData();
	boolean hasData();
}
