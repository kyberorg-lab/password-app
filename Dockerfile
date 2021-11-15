FROM amazoncorretto:11 as builder

COPY target/passwordApp.jar passwordApp.jar
RUN java -Djarmode=layertools -jar passwordApp.jar extract

FROM amazoncorretto:11 as runner
WORKDIR /app
COPY --from=builder  dependencies/ ./
COPY --from=builder snapshot-dependencies/ ./

# see https://github.com/moby/moby/issues/37965
LABEL maintainer="Aleksandr Muravja <alex@kyberorg.io>"

COPY --from=builder spring-boot-loader/ ./
COPY --from=builder application/ ./

ENTRYPOINT ["java", "org.springframework.boot.loader.JarLauncher"]

EXPOSE 8080
