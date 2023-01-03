## Demo
### How to start
* docker-compose build
* start database
* start rabbitmq
* start app

### RabbitMQ
* rabbitmq web view: http://localhost:15672

### TestController to send messages
* TestController path: com.example.demo.port.user.controller
  * localhost:8080/product-queue 
  * localhost:8080/product-update-queue


## Userful Commands
#### create a new repository on the command line
* echo "# cbd" >> README.md
* git init
* git add README.md
* git commit -m "first commit"
* git branch -M main
* git remote add origin https://github.com/dumketob/cbd.git
* git push -u origin main
#### …or push an existing repository from the command line
* git remote add origin https://github.com/dumketob/cbd.git
* git branch -M main
* git push -u origin main

### Without Docker
#### maven build and open jar file from target
* ./mvnw package && java -jar target/demo-0.0.1-SNAPSHOT.jar
* mvn dependency:analyze //  find the dependencies that are not in use in our project
* ./mvnw dependency:copy-dependencies  // in Intellij refresh maven

### With Docker
* docker build -t springio/gs-spring-boot-docker .
* docker run -p 8080:8080 springio/gs-spring-boot-docker

### With Docker Compose
* docker-compose build
* docker-compose up -d
* docker-compose down

### Docker rabbitmq
* docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.11-management

