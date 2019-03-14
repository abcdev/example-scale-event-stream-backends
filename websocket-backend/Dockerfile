FROM anapsix/alpine-java
RUN sh gradlew build bootJar
COPY build/libs/gs-messaging-stomp-websocket-0.1.0.jar .
EXPOSE 8080
CMD ["java", "-jar", "-Dspring.profiles.active=docker","gs-messaging-stomp-websocket-0.1.0.jar"]
