package net.dmcloud.engine.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import net.dmcloud.engine.*;
import net.dmcloud.engine.controllers.model.*;

@RestController
@RequestMapping("/capicity")
class StatusController
{
		private final Logger logger = LoggerFactory.getLogger(StatusController.class);

		@Autowired
		private IDMCloudEngine _engine;

		@RequestMapping(
			method = RequestMethod.GET,
			produces = [ MediaType.APPLICATION_JSON_VALUE ] )
		ResponseEntity<Capicity> fetchCapicity()
		{
			Capicity cap = new Capicity(
				"mockKey",
				"OK",
				6,
				_engine.getMaxTaskCount()
			)
			return new ResponseEntity<Capicity>( cap, HttpStatus.OK );
		}

}
