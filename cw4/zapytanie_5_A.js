printjson(db.people.aggregate([
  { $unwind: "$credit" },
  {
    $match: {
        nationality : "Poland",
        sex : "Female",
    }
  },
  {
    $group: {
      _id: { nationality: "$nationality", sex: "$sex", currency: "$credit.currency" },
      avg: { $avg: { $toDecimal: "$credit.balance" } },
      sum: { $sum: { $toDecimal: "$credit.balance" } },
    }
  },
]).toArray())