package net.dmcloud.dmservice.client;

import net.dmcloud.cep.data.IData;

public interface IOutput  extends IDataProcesser
{
	void output(IData data);
	IData getData();
}
