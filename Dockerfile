FROM openjdk:18.0.1
LABEL maintainer="nmuchiri@kcbgroup.com"
ENV PORT=8765
#
ARG JAR_FILE=target/api-gateway.jar
ADD ${JAR_FILE} api-gateway.jar

COPY target/*.jar /opt/api-gateway.jar
ENTRYPOINT ["java","-jar","/api-gateway.jar"]
