# hacks
API Fest 2020 initial framework


docker run --name mysql-hacks -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=hacks -e MYSQL_USER=user -e MYSQL_PASSWORD=password -d mysql:latest

./gradlew clean build
docker build -t hacks . 

docker run -d -p 8080:8080 --name hacks --link mysql-hacks hacks:latest
