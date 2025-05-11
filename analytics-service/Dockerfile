# Stage 1: Build the application
FROM eclipse-temurin:21-jdk AS builder
WORKDIR /app
COPY . .
RUN ./mvnw clean package -DskipTests

# Stage 2: Run the application
FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=builder /app/target/analytics-service.jar app.jar
EXPOSE 4002
ENTRYPOINT ["java", "-jar", "app.jar"]

