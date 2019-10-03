# sb-hello
dockerized springboot hello

# create local docker image 
mvn compile jib:dockerBuild


# push the image to docker hub
update pom.xml with docker hub repo & maven settings.xml with docker hub server, username, password
mvn compile jib:build -Djib.to.auth.username=$USERNAME -Djib.to.auth.password=$PASSWORD

