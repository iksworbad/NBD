db.people.mapReduce(
  function () {
      key = this.job;
      emit(key, {});
  },
  function (key, values) {
    const length = values.length;
    return {
      job: key,
      length: length,
    }
  },
  { out: "job_list" }
)

printjson(db.job_list.find({}).toArray().map((el) => el._id));
