package net.dmcloud.loader.controllers;

import net.dmcloud.dmservice.loader.client.*;
import net.dmcloud.dmservice.model.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("/archives")
class ArchiveController 
{
	private final Logger logger = LoggerFactory.getLogger(ArchiveController.class);
	
	@Autowired
	private IArchiveLoader _loader;
	
	@RequestMapping(
		method = RequestMethod.POST, 
		produces = [ MediaType.APPLICATION_JSON_VALUE ],
		consumes = [ MediaType.APPLICATION_JSON_VALUE ])
	ResponseEntity<List<Archive>> searchArchive(
		@RequestBody ArchiveFilter filter) 
	{
		List<Archive> data = _loader.fetchEntity(filter);
		return new ResponseEntity<List<Archive>>(data, HttpStatus.OK);
	}
	
	@RequestMapping(
		value = "/{key}",
		method = RequestMethod.GET,
		produces = [ MediaType.APPLICATION_JSON_VALUE ] )
	ResponseEntity<Archive> getServices(@PathVariable String key)
	{
		Archive data = _loader.getEntity(key);
		return new ResponseEntity<Archive>(data, HttpStatus.OK);
	}
}