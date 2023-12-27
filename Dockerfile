FROM openjdk:17-alpine

WORKDIR /tmp

COPY target/in-eng-1.0.0-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]