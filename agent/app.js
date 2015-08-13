var express = require('express');
var path = require('path');
var favicon = require('serve-favicon');
var logger = require('morgan');
var cookieParser = require('cookie-parser');
var bodyParser = require('body-parser');

var status = require('./routes/status');
var tasks = require('./routes/tasks');

var app = express();

// uncomment after placing your favicon in /public
//app.use(favicon(__dirname + '/public/favicon.ico'));
app.use(logger('dev'));
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: false }));
app.use(cookieParser());

app.use('/agent/capicity', status);
app.use('/agent/tasks', tasks);
app.use(express.static('docs', path.join(__dirname, 'swagger-ui')));

// catch 404 and forward to error handler
app.use(function(req, res, next) {
  var err = new Error('Not Found');
  err.status = 404;
  next(err);
});

taskRepositoryFolder = "~/tasks/"
tasksHandler = {
  getAllTasks: function(filter, callback){
    console.log("Push a task: " + JSON.stringify(task));
      callback([]{
        key: "mockId"
      }]);
    }
  },
    pushTask: function(task, callback){
      console.log("Push a task: " + JSON.stringify(task));
        callback({
          key: taskKey
        });
      }
    },
  getTaskMeta: function(taskKey, callback){
    console.log("Fetch task metadata: " + taskKey);
    if(callback != null){
      callback({
        key: taskKey
      });
    }
  },
  getTaskDetail: function(taskKey, callback){
    console.log("Fetch task details: " + taskKey);
    if(callback != null){
      callback({
        key: taskKey
      });
    }
  },
  getTaskLog: function(taskKey, callback){
    console.log("Fetch task logs: " + taskKey);
    if(callback != null){
      callback({
        key: taskKey
      });
    }
  },
  deleteTask: function(taskKey, callback){
    console.log("Delete a task: " + taskKey);
    if(callback != null){
      callback({
        key: taskKey
      });
    }
  },
}
// error handlers

// development error handler
// will print stacktrace
if (app.get('env') === 'development') {
  app.use(function(err, req, res, next) {
    res.status(err.status || 500);
    res.render('error', {
      message: err.message,
      error: err
    });
  });
}

// production error handler
// no stacktraces leaked to user
app.use(function(err, req, res, next) {
  res.status(err.status || 500);
  res.render('error', {
    message: err.message,
    error: {}
  });
});


module.exports = app;
