package net.dmcloud.dmservice.client;

import java.util.List;

public interface IDMService extends IDataProcesser
{
	IInput getInput();
	IOutput getOutput();
	
	List<ModelReference> getModelProcesserHodlers(); 
	
}
