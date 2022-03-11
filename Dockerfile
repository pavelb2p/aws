FROM openjdk:17.0.2-jdk
ADD target/aws.jar aws.jar
ENTRYPOINT ["java", "-jar", "aws.jar"]

EXPOSE 8080