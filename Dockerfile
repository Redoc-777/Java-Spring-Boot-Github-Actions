FROM openjdk:17-jdk

WORKDIR /app

COPY target/dbfeedback-1.0.0.jar /app/dbfeedback.jar

EXPOSE 8088
CMD["java","-jar","dbfeedback.jar"]