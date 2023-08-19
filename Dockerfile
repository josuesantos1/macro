FROM openjdk:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/macro-0.0.1-SNAPSHOT-standalone.jar /macro/app.jar

EXPOSE 8080

CMD ["java", "-jar", "/macro/app.jar"]
