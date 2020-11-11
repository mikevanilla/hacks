FROM openjdk:11
COPY /build/libs/*.jar /app/hacks.jar
EXPOSE 8080
ENTRYPOINT java -jar /app/hacks.jar