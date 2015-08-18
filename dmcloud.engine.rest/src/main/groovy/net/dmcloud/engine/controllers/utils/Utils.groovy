package net.dmcloud.engine.controllers.utils;

import net.dmcloud.engine.data.*
import net.dmcloud.engine.data.model.ArrayData
import net.dmcloud.engine.controllers.model.JsonData;

class Utils
{
	public static IData toData(JsonData json)
	{
		return new ArrayData(json.observations);
	}
}
