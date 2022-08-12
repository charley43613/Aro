FROM java:8-jdk-alpine
COPY ./target/helloSb.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'helloSb.jar'
ENTRYPOINT [ "java", "-jar", "helloSb.jar"]
