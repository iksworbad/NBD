➜  NBD git:(master) ✗ curl -i --location --request POST 'localhost:8098/types/default/buckets/s15733/keys' \
--header 'Content-Type: application/json' \
--data-raw '{
    "users": "4"
}'
HTTP/1.1 201 Created
Vary: Accept-Encoding
Server: MochiWeb/1.1 WebMachine/1.10.9 (cafe not found)
Location: /types/default/buckets/s15733/keys/EDpOwilvOaVz9Rzh0IcMNOmqQSL
Date: Sat, 26 Jun 2021 10:11:33 GMT
Content-Type: application/json
Content-Length: 0

➜  NBD git:(master) ✗ 