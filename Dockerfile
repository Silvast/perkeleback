FROM java:8

ADD target/perkeleback.jar app.jar

EXPOSE 3000
ENTRYPOINT ["java", "-jar", "app.jar"]
