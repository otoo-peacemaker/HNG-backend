# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.5/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.5/reference/htmlsingle/#web)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Deployment
#### Build a Package .Jar file
step by step
* Click on maven at the right corner of the IntelliJ IDE
* Select Execute maven goal
* Select maven Package
* Wait for it to finish building
* Locate the SNAPSHOT.jar file at project>target

Using the cmd

`./mvnw package && java -jar target/hng-0.0.1-SNAPSHOT.jar hng.jar`

#### Create a Dockerfile image
* Right-click on the project package folder.
* Create a new file and name it as Dockerfile
* Define base docker image: Base jar file you want the application to run on.
  * `FROM openjdk:11`
* Define the maintainer name
  * `LABEL maintainer="peacemaker.dev"`
* Specify the target folder/package file to the destination image/file name
  * `ADD target/hng-0.0.1-SNAPSHOT.jar hng.jar `
* Define the Entrypoint configuration
  * `ENTRYPOINT ["jar","-jar","hng.jar"]`

#### Build a Dockerfile image
* Go to your project root dir
* Run the build cmd
    `docker build -t hng:latest .`
  * -t stands for tag and latest is the tag name
  * . specifies that the dockerfile is located at the root dir
* Check your docker image with this cmd
    `docker images`
#### Run a Dockerfile image in a docker container:publish it on port 8080
`run -p 8081:8080 hng`

-p stands for port
8081:8080 means we're mapping our docker file port 8080, where our server is running; the docker file also running on the port 8081

Test the docker file: localhost:8081/welcome