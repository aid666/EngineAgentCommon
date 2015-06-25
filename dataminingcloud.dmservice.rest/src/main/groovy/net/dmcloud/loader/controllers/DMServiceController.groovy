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

import net.dmcloud.cep.data.*
import net.dmcloud.dmservice.client.*
import net.dmcloud.dmservice.loader.client.*;
import net.dmcloud.dmservice.model.*;
import net.dmcloud.engine.client.*;
import net.dmcloud.loader.controllers.model.JsonData;
import net.dmcloud.loader.controllers.utils.*

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/svc")
class DMServiceController
{
	@Autowired
	private IDMServiceLoader _loader;
	@Autowired
	private IDMServiceMetadataLoader _metaLoader;
	@Autowired
	private IDMCloudEngine _engine;
	
	@RequestMapping(
		value = "/{key}",
		method = RequestMethod.POST,
		produces = [ MediaType.APPLICATION_JSON_VALUE ],
		consumes = [ MediaType.APPLICATION_JSON_VALUE ] )
	ResponseEntity<List<Attribute>> test(
		@PathVariable String key,
		@RequestBody JsonData json)
	{
		IDMService dms = _loader.getEntity(key);
		IData outpu = _engine.execute(dms, Utils.toData(json));
		return new ResponseEntity<List<Attribute>>(outpu, HttpStatus.OK);
	}
	
	@RequestMapping(
		value = "{key}/metadata",
		method = RequestMethod.GET,
		produces = [ MediaType.APPLICATION_JSON_VALUE ] )
	ResponseEntity<ServiceMetadata> getMetadata(@PathVariable String key)
	{
		ServiceMetadata meta = _metaLoader.getEntity(key);
		return new ResponseEntity<ServiceMetadata>(meta, HttpStatus.OK);
	}
	
	@RequestMapping(
		value = "{key}/inputAttrs",
		method = RequestMethod.GET,
		produces = [ MediaType.APPLICATION_JSON_VALUE ] )
	ResponseEntity<List<Attribute>> getSvcInputAttrs(@PathVariable String key)
	{
		IDMService dms = _loader.getEntity(key);
		return new ResponseEntity<List<Attribute>>(dms.getInputAttributes(), HttpStatus.OK);
	}
	
	@RequestMapping(
		value = "{key}/outputAttrs", 
		method = RequestMethod.GET, 
		produces = [ MediaType.APPLICATION_JSON_VALUE ] )
	ResponseEntity<List<Attribute>> getSvcOutputAttrs(@PathVariable String key)
	{
		IDMService dms = _loader.getEntity(key);
		return new ResponseEntity<List<Attribute>>(dms.getOutputAttributes(), HttpStatus.OK);
	}
	
	@RequestMapping(
		value = "{key}/input", 
		method = RequestMethod.GET, 
		produces = [ MediaType.APPLICATION_JSON_VALUE ] )
	ResponseEntity<List<Attribute>> getInput(@PathVariable String key)
	{
		IDMService dms = _loader.getEntity(key);
		return new ResponseEntity<List<Attribute>>(dms.getOutputAttributes(), HttpStatus.OK);
	}
	
	@RequestMapping(
		value = "{key}/output", 
		method = RequestMethod.GET, 
		produces = [ MediaType.APPLICATION_JSON_VALUE ] )
	ResponseEntity<List<Attribute>> getOutput(@PathVariable String key)
	{
		IDMService dms = _loader.getEntity(key);
		return new ResponseEntity<List<Attribute>>(dms.getOutputAttributes(), HttpStatus.OK);
	}
	
	@RequestMapping(
		value = "{key}/output", 
		method = RequestMethod.GET, 
		produces = [ MediaType.APPLICATION_JSON_VALUE ] )
	ResponseEntity<List<Attribute>> getPostprocesser(@PathVariable String key)
	{
		IDMService dms = _loader.getEntity(key);
		return new ResponseEntity<List<Attribute>>(dms.getOutputAttributes(), HttpStatus.OK);
	}
}