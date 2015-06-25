package net.dmcloud.dmservice.client;

import net.dmcloud.cep.data.Attribute;

public interface IDataProcesser
{
	Attribute[] getInputAttributes();
	Attribute[] getOutputAttributes();
}
