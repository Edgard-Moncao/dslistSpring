# Usa a imagem oficial do OpenJDK 17
FROM eclipse-temurin:17-jdk

# Define o diretório de trabalho dentro do container
WORKDIR /dslistSpring

# Copia o arquivo JAR gerado pelo Maven/Gradle para dentro do container
COPY target/*.jar app.jar

# Expõe a porta padrão do Spring Boot (se necessário)
EXPOSE 8080

# Comando para executar a aplicação
CMD ["java", "-jar", "app.jar"]