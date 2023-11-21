FROM eclipse-temurin:17
COPY target/workapp.jar workapp.jar
CMD [ "java","-jar","workapp.jar" ]