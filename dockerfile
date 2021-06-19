FROM amazoncorretto:11-alpine-jdk
VOLUME /tmp
COPY target/yashSample-0.0.1-SNAPSHOT.jar yash-sample.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","yash-sample.jar"]