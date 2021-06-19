db.people.mapReduce(
  function () {
    emit(this.nationality, { bmi: (Number(this.weight) / (Number(this.height) * Number(this.height)) * 1000) })
  },
  function (key, values) {
    const length = values.length;

    return {
      nationality: key,
      length: length,
      min: values.reduce((a, b) => (a < b.bmi ? a : b.bmi), 99999),
      max: values.reduce((a, b) => (a > b.bmi ? a : b.bmi), 0),
      avg:  Array.sum(values.map( function(u) { return u.bmi; } ))/length,
    }
  },
  { out: "bmi" }
)

printjson(db.bmi.find({}).toArray());
