var express = require('express');
var router = express.Router();

router.get("", function(req, res, next){
  var filter = {};
  getAllTasks(filter, function(tasks){
    res.json(tasks);
  });
});

pushTask

getTaskMeta

getTaskDetail

getTaskLog

deleteTask

module.exports = router;
