FROM tomee:8-jre-7.1.0-plume as build
COPY /target/calculadora.war /usr/local/tomee/webapps/

FROM openjdk:8-jre
ENV PATH /usr/local/tomee/bin:$PATH
WORKDIR /usr/local
COPY --from=build /usr/local/ .

CMD ["catalina.sh", "run"]