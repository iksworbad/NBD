printjson(db.people.aggregate([
  { $addFields: {
    convertedWeight: { $toDecimal: "$weight"},
    convertedHeight: { $toDecimal: "$height"}
  }},
  { $group: {_id: "$sex", totalWeight: { $avg: "$convertedWeight" }, totalHeight: { $avg: "$convertedHeight"}}}
]).toArray())