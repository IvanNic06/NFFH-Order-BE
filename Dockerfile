FROM openjdk:17

COPY target/Order-BE-0.0.1-SNAPSHOT.jar Order-BE-0.0.1-SNAPSHOT.jar 

ENTRYPOINT [ "java", "-jar", "Order-BE-0.0.1-SNAPSHOT.jar" ]
EXPOSE 9704