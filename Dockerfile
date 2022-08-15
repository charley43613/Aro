FROM open:jdk:8
EXPOSE 8080
ADD target/helloSb.jar helloSb.jar
ENTRYPOINT [ "java", "-jar", "helloSb.jar"]
