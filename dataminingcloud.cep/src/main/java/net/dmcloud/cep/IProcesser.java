package net.dmcloud.cep;

import java.util.Set;

public interface IProcesser 
{
	void process();
	
	boolean isReadyToProcess();
	
	IEvent getOutput(String outputSlot);
	void setInput(String intputSlot, IEvent data);
	
	Set<String> getIntputSlots();
	Set<String> getOutputSlots();
}
