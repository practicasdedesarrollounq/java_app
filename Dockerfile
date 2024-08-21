# Base Image
FROM openjdk:17-jdk-alpine

# Make build directory
RUN mkdir /build

# Make app directory
RUN mkdir /app


# Copy all content to the app directory
ADD ./ /build

# Make app directory the working directory
WORKDIR /build

# Build the app
RUN ./gradlew build

# Copy binary executable jar to /app directory
RUN cp ./build/libs/default-*-all.jar /app/app.jar

EXPOSE 8080
# jar execution
ENTRYPOINT ["java","-jar","/app/app.jar"]

