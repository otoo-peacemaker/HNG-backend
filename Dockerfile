FROM openjdk:11
LABEL maintainer="peacemaker.dev"
ADD target/hng-0.0.1-SNAPSHOT.jar hng.jar
ENTRYPOINT ["jar","-jar","hng.jar"]
