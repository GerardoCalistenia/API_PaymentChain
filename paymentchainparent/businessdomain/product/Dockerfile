# Use official OpenJDK 17 image as the base image
FROM eclipse-temurin:17

# Install necessary packages for user and group management
USER root
RUN apt-get update && apt-get install -y sudo

# Create a new group with specific gid and non-root user called "admin"
RUN set -x \
    && groupadd -g 1028 devopsc \
    && useradd -u 1000 -g devopsc -m admin

# Create a new mount point at /tmp on native host because a volume is more efficient and faster than filesystem
VOLUME /tmp

# Copy the JAR file to the image
ARG JAR_FILE
COPY ${JAR_FILE} /tmp/app.jar

# Change ownership of the /tmp directory to the "admin" user
RUN chown -R admin:devopsc /tmp

# Switch to non-root "admin" user for added security
USER admin

# Execute the JAR file on container start
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar /tmp/app.jar"]
