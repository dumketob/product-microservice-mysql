# Without Docker
# maven build and open jar file from target
./mvnw package && java -jar target/demo-0.0.1-SNAPSHOT.jar

# With Docker
docker build -t springio/gs-spring-boot-docker .
docker run -p 8080:8080 springio/gs-spring-boot-docker

# With Docker Compose
docker-compose build
docker-compose up -d
docker-compose down

datenbank muss active sein


### GIT

# …or create a new repository on the command line
echo "# cbd" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/dumketob/cbd.git
git push -u origin main
# …or push an existing repository from the command line
git remote add origin https://github.com/dumketob/cbd.git
git branch -M main
git push -u origin main