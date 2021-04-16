#FROM openjdk:8
#COPY target/docker-spring-boot.jar docker-spring-boot.jar
#CMD java -jar docker-spring-boot.jar

#FROM openjdk:8
#COPY target/docker-spring-boot.jar docker-spring-boot.jar
#ENTRYPOINT ["java", "-jar", "docker-spring-boot.jar"]
#EXPOSE 8080

FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-docker-kubernetes.jar spring-boot-docker-kubernetes.jar
ENTRYPOINT ["java", "-jar", "spring-boot-docker-kubernetes.jar"]
