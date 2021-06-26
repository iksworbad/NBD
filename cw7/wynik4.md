➜  NBD git:(master) ✗ curl -i --location --request GET 'localhost:8098/types/default/buckets/s15733/keys/2' \
--header 'Content-Type: application/json' 
HTTP/1.1 200 OK
X-Riak-Vclock: a85hYGBgzGDKBVI8ziENin5pa0UgQolMeawM+hXet/iyAA==
Vary: Accept-Encoding
Server: MochiWeb/1.1 WebMachine/1.10.9 (cafe not found)
Link: </buckets/s15733>; rel="up"
Last-Modified: Sat, 26 Jun 2021 10:06:39 GMT
ETag: "2ox51jx1Ft9b1gJubUmtaa"
Date: Sat, 26 Jun 2021 10:07:00 GMT
Content-Type: application/json
Content-Length: 66

{
    "name": "Adam",
    "lastName": "Kowalski",
    "age": 40,
}%                                                                                                                                                 
➜  NBD git:(master) ✗ curl -i --location --request PUT 'localhost:8098/types/default/buckets/s15733/keys/2' \
--header 'Vclock: a85hYGBgzGDKBVI8ziENin5pa0UgQolMeawM+hXet/iyAA==' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Adam",
    "lastName": "Kowalski",
    "age": 40
}'
HTTP/1.1 204 No Content
Vary: Accept-Encoding
Server: MochiWeb/1.1 WebMachine/1.10.9 (cafe not found)
Date: Sat, 26 Jun 2021 10:07:30 GMT
Content-Type: application/json
Content-Length: 0

➜  NBD git:(master) ✗  