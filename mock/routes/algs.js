var express = require('express');
var router = express.Router();

/* GET users listing. */
router.get('/', function(req, res, next) {
  res.json([
    {
      key: 1,
      name: "alg 1"
    },
    {
      key: 2,
      name: "alg 2"
    }
  ]);
});

module.exports = router;
