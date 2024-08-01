# FROM registry.access.redhat.com/ubi8/ubi-minimal:8.5

# MAINTAINER Muhammad Edwin < edwin at redhat dot com >

# LABEL BASE_IMAGE="registry.access.redhat.com/ubi8/ubi-minimal:8.5"
# LABEL JAVA_VERSION="11"

# RUN microdnf install --nodocs java-11-openjdk-headless && microdnf clean all

# WORKDIR /work/
# COPY /target/*.jar /work/application.jar
# FROM java:8  
# COPY . /var/www/java  
# WORKDIR /var/www/java  
# RUN javac Hello.java 
# EXPOSE 8080
# CMD ["java", "-jar", "application.jar"]

FROM maven:3.8.7 AS build

WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src
RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jre-alpine

COPY --from=build /hello-world-java-docker/target/*.jar app.jar
EXPOSE 8080

ENTRYPOINT ["java","-Dspring.profiles.active=dev","-jar","/app.jar"]

 