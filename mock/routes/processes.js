var express = require('express');
var router = express.Router();


var processStatuses = {
  1:
    {
        key: 1,
        name: "processStatuse 1"
    },
  2:
    {
        key: 2,
        name: "processStatuse 2"
    }

}

/* GET flow processStatuses. */
router.get('/:key', function(req, res, next) {
  res.json(processStatuses[req.params.key]);
});

/* POST process result. */
router.get('/:key/result', function(req, res, next) {
  res.json({
    name: 'Mock Data'
  });
});

module.exports = router;
