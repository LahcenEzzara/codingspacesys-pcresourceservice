# Base image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy jar file
COPY target/PcResourceService-0.0.1-SNAPSHOT.jar pcresourceservice.jar

# Expose the port the service listens on
EXPOSE 8082

# Run the jar
ENTRYPOINT ["java", "-jar", "pcresourceservice.jar"]
