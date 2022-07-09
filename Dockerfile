FROM maven:3.8.6-jdk-11 AS build-mvn
WORKDIR /app
COPY . .
RUN mvn install

FROM openjdk:11
COPY --from=build-mvn /app/target/hello-world-*.jar /tmp/app.jar
EXPOSE 8080
ENTRYPOINT [ "sh", "-c", "java -jar /tmp/app.jar" ]
