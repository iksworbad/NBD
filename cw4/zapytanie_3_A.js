printjson(db.people.aggregate([
  {
    $group: {
      _id: "$job",
    }
},
]).toArray().map((el) => el._id))