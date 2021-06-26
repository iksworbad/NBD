➜  NBD git:(master) ✗ curl -i --location --request GET 'localhost:8098/types/default/buckets/s15733/keys/3'

HTTP/1.1 200 OK
X-Riak-Vclock: a85hYGBgzGDKBVI8ziENin6paYchQomMeawMvWXet/iyAA==
Vary: Accept-Encoding
Server: MochiWeb/1.1 WebMachine/1.10.9 (cafe not found)
Link: </buckets/s15733>; rel="up"
Last-Modified: Sat, 26 Jun 2021 09:59:41 GMT
ETag: "21DKGloRNgAR4pBUbRBdLX"
Date: Sat, 26 Jun 2021 10:08:42 GMT
Content-Type: application/json
Content-Length: 85

{
    "name": "Ania",
    "lastName": "Sikorska",
    "age": 17,
    "adult": false
}%                                                                                                                                                 
➜  NBD git:(master) ✗ curl -i --location --request PUT 'localhost:8098/types/default/buckets/s15733/keys/3' \
--header 'Vclock: a85hYGBgzGDKBVI8ziENin6paYchQomMeawMvWXet/iyAA==' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Ania",
    "lastName": "Sikorska",
    "age": 18,
    "adult": true
}'
HTTP/1.1 204 No Content
Vary: Accept-Encoding
Server: MochiWeb/1.1 WebMachine/1.10.9 (cafe not found)
Date: Sat, 26 Jun 2021 10:09:22 GMT
Content-Type: application/json
Content-Length: 0

➜  NBD git:(master) ✗ 