#
# Build stage

FROM maven:3.8.6-openjdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package
ARG path1="/home/akel/test"

# Package stage
#FROM openjdk:11-jre-slim
FROM openjdk:17-oracle
COPY --from=build /home/app/target/qa_jenkins_java_code-0.0.1.jar /usr/local/lib/qa_jenkins_java_code-0.0.1.jar
ENTRYPOINT ["java","-jar","/usr/local/lib/qa_jenkins_java_code-0.0.1.jar"]
