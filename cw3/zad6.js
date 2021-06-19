printjson(db.people.insert({
  sex: "Male",
  first_name: "Kamil",
  last_name: "Dąbrowski",
  job: "node.js developer",
  email: "s15733@pjwstk.edu.pl",
  location: {
    city: "warszawa",
    address: {
      streetname: "Dzielna",
      streetnumber: "7",
    },
  },
  description: "Hej, tu Kamil",
  height: "178",
  weight: "126",
  birth_date: "1996-07-31T15:32:00Z",
  nationality: "Poland",
  credit: [{
    type: "jcb",
    number: "484848484848",
    currency: "123",
    balance: "12000",
  }]
}));