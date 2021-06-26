1.
```bash
curl -i --location --request PUT 'localhost:8098/types/default/buckets/s15733/keys/1' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Kamil",
    "lastName": "Dabrowski",
    "age": 24,
    "adult": true
}'
```

```bash
curl -i --location --request PUT 'localhost:8098/types/default/buckets/s15733/keys/2' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Adam",
    "lastName": "Kowalski",
    "age": 40,
    "adult": true
}'
```

```bash
curl -i --location --request PUT 'localhost:8098/types/default/buckets/s15733/keys/3' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Ania",
    "lastName": "Sikorska",
    "age": 17,
    "adult": false
}'
```

```bash
curl -i --location --request PUT 'localhost:8098/types/default/buckets/s15733/keys/4' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Michal",
    "lastName": "Smith",
    "age": 4,
    "adult": false
}'
```

```bash
curl -i --location --request PUT 'localhost:8098/types/default/buckets/s15733/keys/5' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Daniel",
    "lastName": "Aaa",
    "age": 99,
    "adult": true
}'
```

2.
```bash
curl -i --location --request GET 'localhost:8098/types/default/buckets/s15733/keys/4' \
--header 'Content-Type: application/json' 
```

3.
```bash
curl -i --location --request GET 'localhost:8098/types/default/buckets/s15733/keys/1' \
--header 'Content-Type: application/json' 
```

```bash
curl -i --location --request PUT 'localhost:8098/types/default/buckets/s15733/keys/1' \
--header 'Vclock: a85hYGBgzGDKBVI8ziENin6pUVoQoUTGPFaGR6Xet/iyAA==' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Kamil",
    "lastName": "Dabrowski",
    "age": 25,
    "adult": true,
    "studding": true
}'
```

4.
```bash
curl -i --location --request GET 'localhost:8098/types/default/buckets/s15733/keys/2' \
--header 'Content-Type: application/json'
```


```bash
curl -i --location --request PUT 'localhost:8098/types/default/buckets/s15733/keys/2' \
--header 'Vclock: a85hYGBgzGDKBVI8ziENin5pa0UgQolMeawM+hXet/iyAA==' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Adam",
    "lastName": "Kowalski",
    "age": 40
}'
```

5.
```bash
curl -i --location --request GET 'localhost:8098/types/default/buckets/s15733/keys/3'
```


```bash
curl -i --location --request PUT 'localhost:8098/types/default/buckets/s15733/keys/3' \
--header 'Vclock: a85hYGBgzGDKBVI8ziENin6paYchQomMeawMvWXet/iyAA==' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Ania",
    "lastName": "Sikorska",
    "age": 18,
    "adult": true
}'
```

6.
```bash
curl -i --location --request DELETE 'localhost:8098/types/default/buckets/s15733/keys/1'
```

7.
```bash
curl -i --location --request GET 'localhost:8098/types/default/buckets/s15733/keys/1'
```

8.
```bash
curl -i --location --request POST 'localhost:8098/types/default/buckets/s15733/keys' \
--header 'Content-Type: application/json' \
--data-raw '{
    "users": "4"
}' 
```

9.
```bash
curl -i --location --request GET 'localhost:8098/types/default/buckets/s15733/keys/EDpOwilvOaVz9Rzh0IcMNOmqQSL'
```

10.
```bash
curl -i --location --request DELETE 'localhost:8098/types/default/buckets/s15733/keys/EDpOwilvOaVz9Rzh0IcMNOmqQSL'
```