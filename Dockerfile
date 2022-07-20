#
# Build stage
# maven:3.8.3-openjdk-17
#maven:3.8.6-openjdk-11-slim
#maven:3.6.0-jdk-11-slim
FROM maven:3.8.6-openjdk-11-slim AS build
#COPY src /home/app/src
#COPY pom.xml /home/app
#RUN mvn -f /home/app/pom.xml clean package

#ENV HOME=/home/usr/app
#RUN mkdir -p $HOME
#WORKDIR $HOME
# 1. add pom.xml only here
COPY pom.xml /home/app
# 2. start downloading dependencies
RUN ["/usr/local/bin/mvn-entrypoint.sh", "mvn", "verify", "clean", "--fail-never"]
# 3. add all source code and start compiling
#ADD . $HOME
RUN ["mvn"]
EXPOSE 8005
CMD ["java","-jar","/usr/local/lib/qa_jenkins_java_code-0.0.1.jar"]



#
# Package stage
#
#FROM openjdk:11-jre-slim
FROM openjdk:17-oracle
COPY --from=build /home/app/target/qa_jenkins_java_code-0.0.1.jar /usr/local/lib/qa_jenkins_java_code-0.0.1.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/qa_jenkins_java_code-0.0.1.jar"]