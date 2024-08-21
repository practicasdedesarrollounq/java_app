# Base Image
FROM openjdk:17-jdk-alpine

# Make app directory
RUN mkdir /app

# Copy binary executable jar to /app directory
COPY ./build/libs/default-*-all.jar /app/app.jar


EXPOSE 8080
# jar execution
ENTRYPOINT ["java","-jar","/app/app.jar"]

