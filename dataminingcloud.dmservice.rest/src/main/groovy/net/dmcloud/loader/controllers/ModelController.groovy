package net.dmcloud.loader.controllers;

import java.util.List;

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
import net.dmcloud.loader.controllers.utils.*;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/model")
class ModelController
{
	@Autowired
	private IModelLoader _loader;
	@Autowired
	private IModelMetadataLoader _metaLoader;
	
	@RequestMapping(
		value = "{key}/metadata",
		method = RequestMethod.GET,
		produces = [ MediaType.APPLICATION_JSON_VALUE ] )
	ResponseEntity<ModelMetadata> getMetadata(@PathVariable String key)
	{
		ModelMetadata meta = _metaLoader.getEntity(key);
		return new ResponseEntity<ModelMetadata>(meta, HttpStatus.OK);
	}
	
}