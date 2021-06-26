db.people.mapReduce(
  function () {
    this.credit.map((card) => {
      key = card.currency;
      value = { balance: Number(card.balance), count: 1 };
      emit(key, value);
    });
  },
  function (key, values) {
    const value = {
      balance: values.reduce((a, b) => a + b.balance, 0),
      count: values.reduce((a, b) => a + b.count, 0),
    };
    return value;
  },
  {
    out: "avgBalance",
    query: { sex: "Female", nationality: "Poland" },
    finalize: function (key, value) {
      const avgBalance = value.balance / value.count;
      return {
        currency: key,
        summedBalance: value.balance,
        avgBalance: avgBalance,
      };
    }
   }
)

printjson(db.avgBalance.find({}).toArray());
