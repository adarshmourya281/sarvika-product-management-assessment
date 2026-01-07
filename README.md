# sarvika-product-management-assessment
A well-designed Spring Boot RESTful API created as part of a technical assessment.
This project focuses on building a clean backend application by following best practices 
such as layered architecture, input validation, secure access, centralized exception 
handling, and comprehensive API documentation using Swagger.

## Objective

The objective of this assessment is to design and implement a RESTful API using Spring Boot that performs CRUD operations on a resource, validates user input, secures endpoints using authentication, and persists data using a relational database.

## Features

- CRUD operations for Product resource
- Input validation using Bean Validation (JSR 380)
- Global exception handling using `@ControllerAdvice`
- Secure endpoints using Spring Security (HTTP Basic Authentication)
- Interactive API documentation using Swagger UI
- Persistent storage using MySQL and JPA


## Technology Stack

- Java 17v
- Spring Boot 3.3.5v
- Spring Web
- Spring Data JPA
- Spring Security (HTTP Basic Authentication)
- MySQL
- Swagger (Springdoc OpenAPI) (2.5.0v)
- Maven

## Dependencies Used

The project uses the following dependencies to support application functionality:

### Spring Boot Starters
- *spring-boot-starter-web*  
- *spring-boot-starter-data-jpa*
- *spring-boot-starter-validation*  
- *spring-boot-starter-security*  

### Other Dependencies
- *MySQL Connector (mysql-connector-j)*  
- *Lombok*
- *springdoc-openapi-starter-webmvc-ui*  

  
## Project Structure

src/main/java
└── com.am
├── controller
├── service
├── repository
├── entity
├── exception
├── config

## Product Resource

## Fields
- `id` – Unique identifier
- `name` – Product name
- `description` – Product description
- `price` – Product price

## Validation Rules
- Product name must not be null or blank
- Price must be greater than zero
- Validation is implemented using annotations such as `@NotBlank`, `@Size`, and `@Positive`

## Exception Handling

The application uses a global exception handling mechanism to provide consistent and meaningful error responses.

- `ResourceNotFoundException` is thrown when a requested product does not exist
- Validation errors are handled using `MethodArgumentNotValidException`
- Global exception handling is implemented using `@ControllerAdvice`
- Appropriate HTTP status codes are returned (404, 400)

## Authentication

Authentication is implemented using Spring Security with HTTP Basic Authentication.

- All Product APIs are secured
- Swagger and OpenAPI endpoints are publicly accessible
- Basic authentication was chosen to meet assessment requirements while keeping the implementation simple and easy to test

JWT-based authentication can be added as a future enhancement.

## Configuration

Application-level configuration is managed using the `application.properties` file.

Key configurations include:

```properties
# Database
spring.datasource.url=jdbc:mysql://localhost:3306/productdb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect

# Server
server.port=8080
```

## How to Run the Application

1. Clone the repository  
```git clone <repository-url>```
2. Create a MySQL database named `productdb`
3. Update database credentials in `application.properties`
4. Run the application as a Spring Boot App
5. Open Swagger UI in the browser


## API Documentation (Swagger)

Swagger UI is integrated using Springdoc OpenAPI for API documentation and testing.

### Swagger URL
http://localhost:8080/swagger-ui/index.html


## Screenshots

### Swagger UI Overview
![image alt](https://github.com/adarshmourya281/sarvika-product-management-assessment/blob/d5c3d4c385834235aa7190ec047c3c0f776617f1/Screenshot%20(206).png)

### Create Product API
![Create Product](screenshots/create-product.png)

### Validation Error Example
![image alt](https://github.com/adarshmourya281/sarvika-product-management-assessment/blob/bbd47d39b0a1f4e3c3454845f90cfc77ff10487b/Screenshot%20(210).png)

## Future Enhancements

- JWT-based authentication
- Role-based authorization
- Pagination and sorting
- Unit and integration testing
- Docker support


### Author

Adarsh Mourya

