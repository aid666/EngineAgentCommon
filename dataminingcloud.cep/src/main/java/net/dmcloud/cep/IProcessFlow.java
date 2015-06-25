package net.dmcloud.cep;

import java.util.List;
import java.util.Map;

public interface IProcessFlow
{
	List<IProcesser> getStartProcessers();
	
	Map<String, IProcesser> getProcessers();
	
	Map<SlotId, SlotId> getSlotsMapping();
	
}
