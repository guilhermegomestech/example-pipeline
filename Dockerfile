FROM eclipse-temurin:17-jdk-alpine
COPY target/work-pipeline-1.0.war work-pipeline-1.0.war
ENTRYPOINT ["java", "-jar", "/work-pipeline-1.0.war"]