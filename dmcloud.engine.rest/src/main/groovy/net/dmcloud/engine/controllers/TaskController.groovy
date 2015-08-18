package net.dmcloud.engine.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import net.dmcloud.engine.*;
import net.dmcloud.engine.data.*
import net.dmcloud.engine.data.model.*;

import net.dmcloud.engine.controllers.model.*;
import net.dmcloud.engine.controllers.utils.*

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
class TaskController
{
	@Autowired
	private IDMCloudEngine _engine;

	@RequestMapping(
		value = "/",
		method = RequestMethod.POST,
		produces = [ MediaType.APPLICATION_JSON_VALUE ],
		consumes = [ MediaType.APPLICATION_JSON_VALUE ] )
	ResponseEntity<List<EngineTask>> getTask(
		@PathVariable String key,
		@RequestBody JsonData json)
	{
		return new ResponseEntity<List<EngineTask>>( HttpStatus.OK);
	}

}
