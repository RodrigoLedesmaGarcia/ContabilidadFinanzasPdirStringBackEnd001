
# ---------- Etapa 1: build ----------
FROM eclipse-temurin:21-alpine AS build
WORKDIR /app
COPY . .
RUN ./mvnw clean package -DskipTests

# ---------- Etapa 2: runtime ----------
FROM eclipse-temurin:21-alpine
WORKDIR /app
COPY --from=build /app/target/ContabilidadFinanzasPdirStringBackEnd-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
