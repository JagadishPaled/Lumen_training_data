FROM java:8

ARG java_file=target/employee-service.jar

WORKDIR /opt/examples

EXPOSE 6868

COPY ${java_file} app.jar

ENTRYPOINT [ "java","-jar","app.jar"]