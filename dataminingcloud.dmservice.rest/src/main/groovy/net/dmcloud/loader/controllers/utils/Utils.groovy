package net.dmcloud.loader.controllers.utils;

import net.dmcloud.cep.data.*
import net.dmcloud.cep.data.model.ArrayData
import net.dmcloud.loader.controllers.model.JsonData;

class Utils 
{
	public static IData toData(JsonData json)
	{
		return new ArrayData(json.observations);
	}
}
