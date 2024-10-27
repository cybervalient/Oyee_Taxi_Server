# Usar una imagen base de Java 17
FROM openjdk:17-jdk-alpine

# Variables de entorno para la aplicación Java
ENV JAVA_OPTS=""

# Crear un directorio para la aplicación
WORKDIR /app

# Copiar el archivo .jar de la aplicación al contenedor de Docker
COPY app/oyee-taxi-server-1.0.0.jar /app/oyee-taxi-server-1.0.0.jar

# Comando para ejecutar la aplicación
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app/oyee-taxi-server-1.0.0.jar" ]