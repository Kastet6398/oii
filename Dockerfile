FROM maven AS build
COPY . .
EXPOSE 9000
ENTRYPOINT ["mvn","spring-boot:run"]
