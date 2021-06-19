db.people.mapReduce(
  function () {
    emit(this.sex, { weight: Number(this.weight), height: Number(this.height) })
  },
  function (key, values) {
    const length = values.length;
    const weights = values.map( function(u) { return u.weight; } );
    const heights = values.map( function(u) { return u.height; } );

    return {
      sex: key,
      length: length,
      weight: Array.sum(weights) / length,
      heigh: Array.sum(heights) / length,
    }
  },
  { out: "avg_values" }
)

printjson(db.avg_values.find({}).toArray());
