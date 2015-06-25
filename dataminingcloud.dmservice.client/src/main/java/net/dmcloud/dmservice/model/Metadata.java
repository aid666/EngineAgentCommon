package net.dmcloud.dmservice.model;

import java.util.Date;

public class Metadata extends Entity
{
	private String key;
	private String name;
	private String type;
	private String description;
	private String version;
	private Date createDate;
	private Date modifyDate;
	
	private String locale;
	private String domain;
	
	public Metadata(String key)
	{
		setKey(key);
		setCreateDate(new Date());
		setModifyDate(new Date());
	}
	
	public String getKey()
	{
		return key;
	}

	public void setKey(String key)
	{
		this.key = key;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public String getType()
	{
		return type;
	}
	public void setType(String value)
	{
		this.type = value;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getVersion()
	{
		return version;
	}
	public void setVersion(String version)
	{
		this.version = version;
	}

	public Date getCreateDate()
	{
		return createDate;
	}
	public void setCreateDate(Date createDate)
	{
		this.createDate = createDate;
	}
	
	public Date getModifyDate()
	{
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate)
	{
		this.modifyDate = modifyDate;
	}

	public String getLocale()
	{
		return locale;
	}

	public void setLocale(String locale)
	{
		this.locale = locale;
	}

	public String getDomain()
	{
		return domain;
	}

	public void setDomain(String domain)
	{
		this.domain = domain;
	}
	
	
}
