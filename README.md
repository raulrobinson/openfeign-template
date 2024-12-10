# openfeign-template

## Description

This is a template project that uses OpenFeign to make HTTP requests to a REST API. The project is written in Java and uses Spring Boot.

## Requirements

1. Java - 11.x +
2. Maven - 3.x +
3. IDE - IntelliJ IDEA or Eclipse
4. Lombok Plugin
5. Postman
6. REST API - [JSONPlaceholder](https://jsonplaceholder.typicode.com/)
7. Docker - 20.x +

## Steps to Setup

**1. Clone the application**

```bash
git clone https://github.com/raulrobinson/openfeign-template.git
```

**2. Build and run the app using maven**

```bash
mvn clean spring-boot:run
```

The app will start running at <http://localhost:8080>.

## Explore Rest APIs

The app defines following APIs.

```bash
curl -X 'GET' \
  'http://localhost:8080/posts' \
  -H 'accept: application/json'
```

```bash
curl --location 'localhost:8080/json-placeholder/get-post-by-id/15'
```

## Swagger UI

You can access the Swagger UI at <http://localhost:8080/swagger-ui/index.html>.

Documentation for the REST API can be found at <http://localhost:8080/v3/api-docs>.


## Learn more

You can find the tutorial for this application. OpenFeign Cloud.

## License
MIT License.

