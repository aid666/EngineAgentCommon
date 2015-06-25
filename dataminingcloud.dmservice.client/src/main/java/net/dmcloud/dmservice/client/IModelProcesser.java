package net.dmcloud.dmservice.client;

import net.dmcloud.cep.IProcesser;

public interface IModelProcesser extends IProcesser
{
	IModel getModel();
	void loadModel(IModel model);
}
