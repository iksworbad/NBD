printjson(db.people.aggregate([
  { $unwind: "$credit" },
  {
    $group: {
      _id: "$credit.currency",
        totalbalance: { $sum: { $toDecimal: "$credit.balance"} },
    }
},
]).toArray())