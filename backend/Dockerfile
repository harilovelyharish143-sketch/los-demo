FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

RUN apk add --no-cache maven

# Copy pom and download dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy source
COPY src src

# Build jar
RUN mvn clean package -DskipTests

# Show jar (for debug, safe to keep)
RUN ls -l target

EXPOSE 8080

# IMPORTANT: use shell form so wildcard works
CMD java -jar target/*.jar

