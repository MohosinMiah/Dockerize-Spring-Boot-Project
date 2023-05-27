FROM eclipse-temurin:17

LABEL mentainer="mohosin.csm@gmail.com"

WORKDIR /app

COPY target/dockerdemo-0.0.1-SNAPSHOT.jar /app/dockerdemo-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","dockerdemo-0.0.1-SNAPSHOT.jar"]








