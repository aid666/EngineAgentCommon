var express = require('express');
var router = express.Router();

var ad_hocs = [
  {
    key: 1,
    name: "ad_hoc 1"
  },
  {
    key: 2,
    name: "ad_hoc 2"
  }
];

/* POST ad_hoc. */
router.post('/ad_hoc', function(req, res, next) {
  ad_hocs.push(req.body);
  res.json(req.body);
});

/* POST ad_hoc. */
router.get('/ad_hoc/:key', function(req, res, next) {
  for (var i = 0; i < ad_hocs.length; i++) {
    var ad_hoc = ad_hocs[i];
    console.log(ad_hoc)
    if(ad_hoc.key == req.params.key){
      res.json(ad_hoc);
      break;
    }
  }
});

var flows = [
  {
    key: 1,
    name: "flow 1"
  },
  {
    key: 2,
    name: "flow 2"
  }
];

/* GET flow. */
router.get('/flow', function(req, res, next) {
  res.json(flows);
});

/* POST flow. */
router.post('/flow', function(req, res, next) {
  flows.push(req.body);
  res.json(req.body);
});

/* POST flow. */
router.get('/flow/:key', function(req, res, next) {
  for (var i = 0; i < flows.length; i++) {
    var flow = flows[i];
    console.log(flow)
    if(flow.key == req.params.key){
      res.json(flow);
      break;
    }
  }
});

var processes = {
  1: [
      {
        key: 1,
        name: "process 1"
      },
      {
        key: 2,
        name: "process 2"
      }
  ]
}

/* GET flow processes. */
router.get('/flow/:key/processes', function(req, res, next) {
  res.json(processes[req.params.key]);
});

/* POST flow processes. */
router.post('/flow/:key/processes', function(req, res, next) {
  processes[req.params.key].push(req.body);
});

module.exports = router;
