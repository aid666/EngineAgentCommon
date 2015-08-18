package net.dmcloud.engine;

import java.util.Set;

public interface ITask
{
	void process();

	boolean isReadyToProcess();

	IEvent getOutput(String outputSlot);
	void setInput(String intputSlot, IEvent data);

	Set<String> getIntputSlots();
	Set<String> getOutputSlots();
}
