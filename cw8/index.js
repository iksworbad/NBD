
var Riak = require('basho-riak-client');
var logger = require('winston');
var async = require('async');


(() => {
  console.log('cw8')

  var nodes = [
    'riakkv:8098',
    'riakkv:8087',
  ];
  var client = new Riak.Client(nodes, function (err, c) {
    // NB: at this point the client is fully initialized, and
    // 'client' and 'c' are the same object

    var people = [
      {
        emailAddress: "bashoman@riak.com",
        firstName: "Riak",
        lastName: "Man"
      },
      {
        emailAddress: "johndoe@gmail.com",
        firstName: "John",
        lastName: "Doe"
      }
    ]
  
    let storeFuncs = [];
    people.forEach(function (person) {
      // Create functions to execute in parallel to store people
      storeFuncs.push(function (async_cb) {
        c.storeValue({
          bucket: 'contributors',
          key: person.emailAddress,
          value: person
        },
          function (err, rslt) {
            async_cb(err, rslt);
          }
        );
      });
    });
  
    async.parallel(storeFuncs, function (err, rslts) {
      if (err) {
        throw new Error(err);
      }
    });
  
    c.fetchValue({ bucket: 'contributors', key: 'bashoman@riak.com', convertToJs: true },
      function (err, rslt) {
        if (err) {
          throw new Error(err);
        } else {
          var riakObj = rslt.values.shift();
          var bashoman = riakObj.value;
          logger.info("I found %s in 'contributors'", bashoman.emailAddress);
  
          bashoman.FirstName = "Riak";
          riakObj.setValue(bashoman);
        
          c.storeValue({ value: riakObj }, function (err, rslt) {
            if (err) {

              throw new Error(err);
            }
          });
        }
      }
    );
  
    c.deleteValue({ bucket: 'contributors', key: 'johndoe@gmail.com' }, function (err, rslt) {
      if (err) {
        throw new Error(err);
      }
    });
  });

})()