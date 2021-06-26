# Neo4j

### Zad 1
```
MATCH (m:Movie) RETURN m
```

### Zad 2
```
MATCH (m:Movie) RETURN m
```

### Zad 3
```
MATCH (p:Person{name:"Hugo Weaving"})-[:ACTED_IN]->(m:Movie)<-[:DIRECTED]-(directors:Person) RETURN directors,m
```

### Zad 4
```
MATCH (p:Person{name:"Hugo Weaving"})-[:ACTED_IN]->(m:Movie)<-[:ACTED_IN]-(coworkers:Person) RETURN coworkers,m
```

### Zad 5
```
MATCH (m:Movie)<-[:ACTED_IN]-(a:Person)-[:ACTED_IN]->(ms:Movie) WHERE ms.title = "The Matrix" RETURN  m,a
```

### Zad 6
```
MATCH (p:Person)-[:ACTED_IN]->(m:Movie) RETURN p, COUNT(m)
```

### Zad 7
```
MATCH (p:Person)-[:DIRECTED]->(m:Movie)<-[:WROTE]-(p:Person) RETURN p, m
```

### Zad 8
```
MATCH (k:Person)-[:ACTED_IN]->(m:Movie)<-[:ACTED_IN]-(h:Person) WHERE h.name = "Hugo Weaving" AND  k.name = "Keanu Reeves" RETURN h, m, k
```

### zad 9
```
CREATE (mov:Movie{title:"Captain America: The First Avenger"})
CREATE (dir:Person{name:"Joe Johnston"})
CREATE (dir)-[:DIRECTED]->(mov)
CREATE (wr1:Person{name:"Christopher Markus"})
CREATE (wr1)-[:WROTE]->(mov)
CREATE (wr2:Person{name:"Stephen McFlee"})
CREATE (wr2)-[:WROTE]->(mov)
CREATE (wr3:Person{name:"Joe Simon"})
CREATE (wr3)-[:WROTE]->(mov)
CREATE (act1:Person{name:"Chris Evans"})
CREATE (act1)-[:ACTED_IN]->(mov)
CREATE (act2:Person{name:"Samuel L. Jackson"})
CREATE (act2)-[:ACTED_IN]->(mov)
CREATE (act3:Person{name:"Hugo Weaving"})
CREATE (act3)-[:ACTED_IN]->(mov)
return mov, dir, wr1,wr2,wr3,act1,act2,act3
```