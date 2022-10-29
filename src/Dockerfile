
# syntax=docker/dockerfile:1
FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:resolve

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]

LABEL maintainer="peacemaker.dev"

ADD target/hng-0.0.1-SNAPSHOT.jar hng.jar

ENTRYPOINT ["jar","-jar","hng.jar"]