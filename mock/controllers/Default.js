'use strict';

var url = require('url');


var Default = require('./DefaultService');


module.exports.adHocPost = function adHocPost (req, res, next) {
  var body = req.swagger.params['body'].value;
  

  var result = Default.adHocPost(body);

  if(typeof result !== 'undefined') {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(result || {}, null, 2));
  }
  else
    res.end();
};

module.exports.adHocExeKeyGet = function adHocExeKeyGet (req, res, next) {
  var exeKey = req.swagger.params['exeKey'].value;
  

  var result = Default.adHocExeKeyGet(exeKey);

  if(typeof result !== 'undefined') {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(result || {}, null, 2));
  }
  else
    res.end();
};

module.exports.algorithmsGet = function algorithmsGet (req, res, next) {
  var catalog = req.swagger.params['catalog'].value;
  

  var result = Default.algorithmsGet(catalog);

  if(typeof result !== 'undefined') {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(result || {}, null, 2));
  }
  else
    res.end();
};

module.exports.flowGet = function flowGet (req, res, next) {
  

  var result = Default.flowGet();

  if(typeof result !== 'undefined') {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(result || {}, null, 2));
  }
  else
    res.end();
};

module.exports.flowPost = function flowPost (req, res, next) {
  var body = req.swagger.params['body'].value;
  

  var result = Default.flowPost(body);

  if(typeof result !== 'undefined') {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(result || {}, null, 2));
  }
  else
    res.end();
};

module.exports.flowFlowKeyGet = function flowFlowKeyGet (req, res, next) {
  var flowKey = req.swagger.params['flowKey'].value;
  

  var result = Default.flowFlowKeyGet(flowKey);

  if(typeof result !== 'undefined') {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(result || {}, null, 2));
  }
  else
    res.end();
};

module.exports.flowFlowKeyProcessesPost = function flowFlowKeyProcessesPost (req, res, next) {
  var flowKey = req.swagger.params['flowKey'].value;
  var body = req.swagger.params['body'].value;
  

  var result = Default.flowFlowKeyProcessesPost(flowKey, body);

  if(typeof result !== 'undefined') {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(result || {}, null, 2));
  }
  else
    res.end();
};

module.exports.processesResultKeyGet = function processesResultKeyGet (req, res, next) {
  var resultKey = req.swagger.params['resultKey'].value;
  

  var result = Default.processesResultKeyGet(resultKey);

  if(typeof result !== 'undefined') {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(result || {}, null, 2));
  }
  else
    res.end();
};

module.exports.processesResultKeyResultGet = function processesResultKeyResultGet (req, res, next) {
  var resultKey = req.swagger.params['resultKey'].value;
  

  var result = Default.processesResultKeyResultGet(resultKey);

  if(typeof result !== 'undefined') {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(result || {}, null, 2));
  }
  else
    res.end();
};
