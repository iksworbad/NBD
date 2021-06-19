printjson(
  db.people.deleteMany({
    $where: function () {
      return +this.height >= 190
    }
  })
)