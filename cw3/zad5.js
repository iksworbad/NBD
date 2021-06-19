const result = db.people.aggregate(
  [
    {
      $project: {
        first_name: 1,
        last_name: 1,
        "location.city": 1,
        birth_date: 1,
        date: {
          $dateFromString: {
            dateString: "$birth_date",
          },
        },
      },
    },
    {
      $match: {
        date: {
          $lt: ISODate("2000-01-01T00:00:00.000Z"),
          $gte: ISODate("1900-01-01T00:00:00.000Z"),
        },
      },
    },
  ]
)

printjson(result.toArray());