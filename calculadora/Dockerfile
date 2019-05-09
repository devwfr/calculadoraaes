# Build Stage
FROM maven:3.6.1-jdk-8 AS builder
COPY pom.xml .
COPY ./src ./src
RUN mvn clean package

# Run Stage
FROM tomee:8-jre-7.1.0-plume 
LABEL manteiner="Wilson Forero Rocha - forero-wilson@javeriana.edu.co"
COPY --from=builder /target/calculadora.war /usr/local/tomee/webapps/
EXPOSE 8080

CMD ["catalina.sh", "run"]
