FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

RUN apk add --no-cache maven

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src src

RUN mvn clean package -DskipTests

# IMPORTANT: do NOT hardcode port
CMD java -jar target/*.jar
