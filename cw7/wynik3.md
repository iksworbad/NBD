➜  NBD git:(master) ✗ curl -i --location --request GET 'localhost:8098/types/default/buckets/s15733/keys/1' \
--header 'Content-Type: application/json'
HTTP/1.1 200 OK
X-Riak-Vclock: a85hYGBgzGDKBVI8ziENin6pUVoQoUTGPFaGR6Xet/iyAA==
Vary: Accept-Encoding
Server: MochiWeb/1.1 WebMachine/1.10.9 (cafe not found)
Link: </buckets/s15733>; rel="up"
Last-Modified: Sat, 26 Jun 2021 09:56:50 GMT
ETag: "cv80v2QPdfad6T2tw2yu6"
Date: Sat, 26 Jun 2021 10:03:04 GMT
Content-Type: application/json
Content-Length: 86

{
    "name": "Kamil",
    "lastName": "Dabrowski",
    "age": 24,
    "adult": true
}%                                                                                                                                                 
➜  NBD git:(master) ✗ curl -i --location --request PUT 'localhost:8098/types/default/buckets/s15733/keys/1' \
--header 'Vclock: a85hYGBgzGDKBVI8ziENin6pUVoQoUTGPFaGR6Xet/iyAA==' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Kamil",
    "lastName": "Dabrowski",
    "age": 25,
    "adult": true,
    "studding": true
}'
HTTP/1.1 204 No Content
Vary: Accept-Encoding
Server: MochiWeb/1.1 WebMachine/1.10.9 (cafe not found)
Date: Sat, 26 Jun 2021 10:04:24 GMT
Content-Type: application/json
Content-Length: 0

➜  NBD git:(master) ✗ curl -i --location --request GET 'localhost:8098/types/default/buckets/s15733/keys/1' \
--header 'Content-Type: application/json'
HTTP/1.1 200 OK
X-Riak-Vclock: a85hYGBgzGDKBVI8ziENin6pUVoQoUSmPFaGFeXet/iyAA==
Vary: Accept-Encoding
Server: MochiWeb/1.1 WebMachine/1.10.9 (cafe not found)
Link: </buckets/s15733>; rel="up"
Last-Modified: Sat, 26 Jun 2021 10:04:24 GMT
ETag: "f0ovMMdnzcQzim7lzOy1m"
Date: Sat, 26 Jun 2021 10:04:31 GMT
Content-Type: application/json
Content-Length: 108

{
    "name": "Kamil",
    "lastName": "Dabrowski",
    "age": 25,
    "adult": true,
    "studding": true
}%                                                                                                                                                 
➜  NBD git:(master) ✗    