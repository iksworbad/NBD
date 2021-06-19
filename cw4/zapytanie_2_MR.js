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
    const balances = values.map( function(u) { return u.balance; } );

    return {
      currency: key,
      length: length,
      balance: Array.sum(balances) / length,
    }
  },
  { out: "avg_currency" }
)

printjson(db.avg_currency.find({}).toArray());
