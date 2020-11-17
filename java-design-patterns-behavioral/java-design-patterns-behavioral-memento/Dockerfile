FROM openjdk:11-jre-slim
EXPOSE 8090
COPY target/*-fat.jar /vertx/
WORKDIR /vertx
CMD java -jar *.jar -Dvertx.cacheDirBase=/tmp
