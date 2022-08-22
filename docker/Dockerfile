####
# This Dockerfile is used in order to build a container that runs the Spring Boot application
#
# Build the image with:
#
# docker build -f docker/Dockerfile -t springboot/sample-demo .
#
# Then run the container using:
#
# docker run -i --rm -p 8081:8081 springboot/sample-demo
####
FROM adoptopenjdk/openjdk11:alpine-jre

# Refer to Maven build -> finalName
ARG JAR_FILE=target/spring-boot-web.jar

# cd /opt/app
WORKDIR /opt/app

# cp target/helloSb.jar /opt/app/helloSb.jar
COPY ${JAR_FILE} app.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","helloSb.jar"]
