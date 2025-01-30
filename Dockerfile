# Use a base image with Java and Gradle
FROM gradle:7.4.2-jdk11

# Set the working directory
WORKDIR /app

# Copy the Gradle build files
COPY build.gradle .
COPY src ./src

# Run the Gradle build
RUN gradle -v

# Command to run tests (optional)
CMD ["gradle", "test"] 
