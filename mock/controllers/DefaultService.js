'use strict';

exports.adHocPost = function(body) {

  var examples = {};
  
  examples['application/json'] = {
  "key" : "aeiou",
  "status" : "aeiou"
};
  

  
  if(Object.keys(examples).length > 0)
    return examples[Object.keys(examples)[0]];
  
}
exports.adHocExeKeyGet = function(exeKey) {

  var examples = {};
  
  examples['application/json'] = {
  "key" : "aeiou",
  "status" : "aeiou"
};
  

  
  if(Object.keys(examples).length > 0)
    return examples[Object.keys(examples)[0]];
  
}
exports.algorithmsGet = function(catalog) {

  var examples = {};
  
  examples['application/json'] = [ {
  "catalog" : "aeiou",
  "name" : "aeiou",
  "description" : "aeiou",
  "key" : "aeiou",
  "tags" : [ "aeiou" ]
} ];
  

  
  if(Object.keys(examples).length > 0)
    return examples[Object.keys(examples)[0]];
  
}
exports.flowGet = function() {

  var examples = {};
  
  examples['application/json'] = [ {
  "key" : "aeiou"
} ];
  

  
  if(Object.keys(examples).length > 0)
    return examples[Object.keys(examples)[0]];
  
}
exports.flowPost = function(body) {

  var examples = {};
  
  examples['application/json'] = {
  "key" : "aeiou"
};
  

  
  if(Object.keys(examples).length > 0)
    return examples[Object.keys(examples)[0]];
  
}
exports.flowFlowKeyGet = function(flowKey) {

  var examples = {};
  
  examples['application/json'] = {
  "key" : "aeiou"
};
  

  
  if(Object.keys(examples).length > 0)
    return examples[Object.keys(examples)[0]];
  
}
exports.flowFlowKeyProcessesPost = function(flowKey, body) {

  var examples = {};
  
  examples['application/json'] = {
  "key" : "aeiou",
  "status" : "aeiou"
};
  

  
  if(Object.keys(examples).length > 0)
    return examples[Object.keys(examples)[0]];
  
}
exports.processesResultKeyGet = function(resultKey) {

  var examples = {};
  
  examples['application/json'] = {
  "key" : "aeiou",
  "status" : "aeiou"
};
  

  
  if(Object.keys(examples).length > 0)
    return examples[Object.keys(examples)[0]];
  
}
exports.processesResultKeyResultGet = function(resultKey) {

  var examples = {};
  
  examples['application/json'] = {
  "outputData" : "",
  "inputData" : {
    "data" : [ {
      "data" : [ "aeiou" ],
      "attribute" : {
        "dataInfor" : {
          "domain" : {
            "date" : "aeiou",
            "name" : "aeiou",
            "parentDomain" : ""
          },
          "name" : "aeiou"
        },
        "name" : "aeiou",
        "format" : "aeiou",
        "type" : "aeiou"
      }
    } ],
    "key" : "aeiou"
  },
  "warnings" : [ "aeiou" ],
  "logs" : [ "aeiou" ],
  "key" : "aeiou",
  "errors" : [ "aeiou" ]
};
  

  
  if(Object.keys(examples).length > 0)
    return examples[Object.keys(examples)[0]];
  
}
