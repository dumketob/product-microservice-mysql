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