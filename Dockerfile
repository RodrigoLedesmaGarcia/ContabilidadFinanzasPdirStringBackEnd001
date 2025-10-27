
FROM eclipse-temurin:21-alpine

WORKDIR /app

COPY ./target/ContabilidadFinanzasPdirStringBackEnd-0.0.1-SNAPSHOT .

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "ContabilidadFinanzasPdirStringBackEnd-0.0.1-SNAPSHOT.jar"]