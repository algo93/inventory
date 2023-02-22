FROM sapmachine:17
EXPOSE 8080 1433
ADD target/inventory.jar inventory.jar
ENTRYPOINT ["java" , "-jar" , "/inventory.jar"]