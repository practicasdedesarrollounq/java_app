# Base Image
FROM openjdk:17-jdk-alpine

# Make app directory
RUN mkdir /app

# Copy binary executable jar to /app directory
COPY ./build/libs/default-*-all.jar /app/app.jar

# jar execution
ENTRYPOINT ["java","-jar","/app/app.jar"]

