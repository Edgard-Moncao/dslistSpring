# Etapa de build
FROM eclipse-temurin:17-jdk AS build
WORKDIR /app
COPY . .

# Conceder permissão de execução ao mvnw
RUN chmod +x mvnw

# Executar o build do projeto com Maven
RUN ./mvnw clean package -DskipTests

# Etapa final
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

# Comando para iniciar a aplicação
CMD ["java", "-jar", "app.jar"]