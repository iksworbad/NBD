db.people.mapReduce(
  function () {
    emit(this.sex, { count: 1, weight: Number(this.weight), height: Number(this.height) })
  },
  function (key, values) {
    let value = {
      count: values.reduce((a, b) => a + b.count, 0),
      weight: values.reduce((a, b) => a + b.weight, 0),
      height: values.reduce((a, b) => a + b.height, 0),
    };
    return value;
  },
  {
    out: "avg_values",
    finalize: function (key, value) {
      return {
        sex: key,
        avgHeight: value.height / value.count,
        avgWeight: value.weight / value.count,
      }
    }
  }
)

printjson(db.avg_values.find({}).toArray());
