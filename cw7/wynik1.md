➜  NBD git:(master) ✗ curl -i --location --request PUT 'localhost:8098/types/default/buckets/s15733/keys/1' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Kamil",
    "lastName": "Dabrowski",
    "age": 24,
    "adult": true
}'
HTTP/1.1 204 No Content
Vary: Accept-Encoding
Server: MochiWeb/1.1 WebMachine/1.10.9 (cafe not found)
Date: Sat, 26 Jun 2021 09:56:50 GMT
Content-Type: application/json
Content-Length: 0

➜  NBD git:(master) ✗ curl -i --location --request PUT 'localhost:8098/types/default/buckets/s15733/keys/2' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Adam",
    "lastName": "Kowalski",
    "age": 40,
    "adult": true
}'
HTTP/1.1 204 No Content
Vary: Accept-Encoding
Server: MochiWeb/1.1 WebMachine/1.10.9 (cafe not found)
Date: Sat, 26 Jun 2021 09:59:34 GMT
Content-Type: application/json
Content-Length: 0

➜  NBD git:(master) ✗ curl -i --location --request PUT 'localhost:8098/types/default/buckets/s15733/keys/3' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Ania",
    "lastName": "Sikorska",
    "age": 17,
    "adult": false
}'
HTTP/1.1 204 No Content
Vary: Accept-Encoding
Server: MochiWeb/1.1 WebMachine/1.10.9 (cafe not found)
Date: Sat, 26 Jun 2021 09:59:41 GMT
Content-Type: application/json
Content-Length: 0

➜  NBD git:(master) ✗ curl -i --location --request PUT 'localhost:8098/types/default/buckets/s15733/keys/4' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Michal",
    "lastName": "Smith",
    "age": 4,
    "adult": false
}'
HTTP/1.1 204 No Content
Vary: Accept-Encoding
Server: MochiWeb/1.1 WebMachine/1.10.9 (cafe not found)
Date: Sat, 26 Jun 2021 09:59:46 GMT
Content-Type: application/json
Content-Length: 0

➜  NBD git:(master) ✗ curl -i --location --request PUT 'localhost:8098/types/default/buckets/s15733/keys/5' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Daniel",
    "lastName": "Aaa",
    "age": 99,
    "adult": true
}'
HTTP/1.1 204 No Content
Vary: Accept-Encoding
Server: MochiWeb/1.1 WebMachine/1.10.9 (cafe not found)
Date: Sat, 26 Jun 2021 09:59:54 GMT
Content-Type: application/json
Content-Length: 0

➜  NBD git:(master) ✗ 