package net.dmcloud.loader.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import net.dmcloud.dmservice.loader.client.*
import net.dmcloud.dmservice.model.*
import net.dmcloud.loader.controllers.model.JsonData;

@RestController
@RequestMapping("/metadata")
class MetadataController 
{
	private final Logger logger = LoggerFactory.getLogger(MetadataController.class);
	
	@Autowired
	private IDMServiceMetadataLoader _svcLoader;
	@Autowired
	private IModelMetadataLoader _modelLoader;
	
	@RequestMapping(
		value = "/svc",
		method = RequestMethod.POST, 
		produces = [ MediaType.APPLICATION_JSON_VALUE ],
		consumes = [ MediaType.APPLICATION_JSON_VALUE ] )
	ResponseEntity<List<ServiceMetadata>> searchServices(
		@RequestBody ServiceMetadataFilter filter) 
	{
		List<ServiceMetadata> data = _svcLoader.fetchEntity(filter);
		return new ResponseEntity<List<ServiceMetadata>>(data, HttpStatus.OK);
	}
	
	@RequestMapping(
		value = "/model",
		method = RequestMethod.POST, 
		produces = [ MediaType.APPLICATION_JSON_VALUE ],
		consumes = [ MediaType.APPLICATION_JSON_VALUE ] )
	ResponseEntity<List<ModelMetadata>> searchModels(
		@RequestBody ModelMetadataFilter filter) 
	{
		List<ModelMetadata> data = _modelLoader.fetchEntity(filter);
		return new ResponseEntity<List<ModelMetadata>>(data, HttpStatus.OK);
	}
	
}