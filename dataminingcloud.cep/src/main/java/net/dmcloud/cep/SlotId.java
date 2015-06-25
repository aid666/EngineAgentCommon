package net.dmcloud.cep;

public final class SlotId
{
	private String processerId;
	private String innerSlotId;

	public SlotId(String processerId, String innerSlotId)
	{
		super();
		this.processerId = processerId;
		this.innerSlotId = innerSlotId;
	}
	
	public String getProcesserId()
	{
		return processerId;
	}
	public void setProcesserId(String processerId)
	{
		this.processerId = processerId;
	}
	
	public String getInnerSlotId()
	{
		return innerSlotId;
	}
	public void setInnerSlotId(String innerSlotId)
	{
		this.innerSlotId = innerSlotId;
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((innerSlotId == null) ? 0 : innerSlotId.hashCode());
		result = prime * result
				+ ((processerId == null) ? 0 : processerId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SlotId other = (SlotId) obj;
		if (innerSlotId == null)
		{
			if (other.innerSlotId != null)
				return false;
		} else if (!innerSlotId.equals(other.innerSlotId))
			return false;
		if (processerId == null)
		{
			if (other.processerId != null)
				return false;
		} else if (!processerId.equals(other.processerId))
			return false;
		return true;
	}
	
}
