printjson(db.people.aggregate([
  {
    $project: {
      nationality: 1,
      bmi: {
        $multiply: [{
          $divide: [
            { $toDecimal: "$weight" },
            { $multiply: [ { $toDecimal:"$height"} , { $toDecimal:"$height"} ] }
          ]
        }, 1000]
      }
    }
  },
  {
    $group: {
      _id: "$nationality",
      min: { $min: "$bmi"},
      max: { $max: "$bmi"},
      avg: { $avg: "$bmi"}
    }
  },
]).toArray())