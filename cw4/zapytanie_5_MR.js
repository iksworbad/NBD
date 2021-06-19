db.people.mapReduce(
  function () {
    this.credit.map((card) => {
      key = card.currency;
      value = { balance: Number(card.balance) };
      emit(key, value);
    });
  },
  function (key, values) {
    const length = values.length;

    return {
      nationality: key,
      avgBalance: Array.sum(values.map(function (u) { return u.balance; })) / length,
    }
  },
  {
    out: "avgBalance",
    query: { sex: "Female", nationality: "Poland" },
   }
)

printjson(db.avgBalance.find({}).toArray());
