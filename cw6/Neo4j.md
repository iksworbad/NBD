# Neo4j

### Zad 1
```
MATCH  (a{name:"Darjeeling"}), (b{name:"Sandakphu"}), p= shortestPath((a)-[*]-(b)) RETURN p
```
```
MATCH  (a{name:"Darjeeling"}), (b{name:"Sandakphu"}), p= allShortestPaths((a)-[*]-(b)) RETURN p
```

### Zad 2
```
MATCH  (a{name:"Darjeeling"}), (b{name:"Sandakphu"}), p= allShortestPaths((a)-[*]-(b)) WHERE all(r IN relationships(p) WHERE r.winter = 'true') RETURN p
```

### Zad 3
```
MATCH (a{name:"Darjeeling"}), (b{name:"Sandakphu"}), p= (a)-[*]->(b)
RETURN p AS shortestPath, reduce(d=0, r in relationships(p) | d + r.distance) 
        AS totalDistance
ORDER BY totalDistance ASC
```

### Zad 4
```
MATCH (a:Airport)-[:ORIGIN]-(f:Flight) RETURN a,count(f) ORDER BY count(f) ASC
```

### Zad 5
```
MATCH path = (origin:Airport { name:"LAX" })<-[r:ORIGIN|DESTINATION*..5]->(destination:Airport)
WHERE REDUCE(s = 0, n IN [x IN NODES(path) WHERE 'Flight' IN LABELS(x)] |
  s + [(n)<-[:ASSIGN]-(ticket) | ticket.price][0]
  ) < 3000
RETURN path
```

### Zad 6
```
MATCH p = (origin:Airport { name:"LAX" })-[r:ORIGIN|DESTINATION*..5]->(destination:Airport { name:"DAY" })
RETURN p AS path, 
REDUCE(s = 0, n IN [x IN NODES(p) WHERE 'Flight' IN LABELS(x)] |
  s + [(n)<-[:ASSIGN]-(ticket) | ticket.price][0]
  )  AS totalPrice
  ORDER BY totalPrice ASC
```

### Zad 7
```

```

### Zad 8
```

```

