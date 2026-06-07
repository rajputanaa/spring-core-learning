# Spring Core Learning Project



## Overview

This repository was created to learn and practice the fundamental concepts of the Spring Framework before moving on to Spring Boot development.

The project demonstrates how Spring manages objects using the IoC (Inversion of Control) Container and how Dependency Injection helps create loosely coupled applications.

A simple user management flow is implemented using a layered architecture consisting of Controller, Service, Repository, and a simulated Database layer.




## Concepts Covered

* Spring IoC Container
* Dependency Injection (Constructor Injection)
* Bean Creation and Management
* `@Configuration`
* `@ComponentScan`
* `@Bean`
* `@Controller`
* `@Service`
* `@Repository`
* Bean Lifecycle (`initMethod`, `destroyMethod`)
* Layered Architecture



## Project Structure

```text
src/main/java
└── com.example.config
    ├── controller
    │   └── UserController.java
    │
    ├── service
    │   └── UserService.java
    │
    ├── repository
    │   └── UserRepository.java
    │
    ├── db
    │   └── DatabaseConnection.java
    │
    ├── AppConfig.java
    └── MainApp.java
```


### Layer Responsibilities

* **Controller Layer** → Handles user requests and responses.
* **Service Layer** → Contains business logic.
* **Repository Layer** → Handles data access operations.
* **Database Layer** → Simulates database operations using an in-memory ArrayList.
* **Configuration Layer** → Configures Spring beans and component scanning.




## Technologies Used

* Java 21
* Spring Framework 7
* Maven



## Sample Execution Flow

Application Start
↓
Spring Container Created
↓
DatabaseConnection Bean Created
↓
init() Method Executed
↓
Repository Bean Created
↓
Service Bean Created
↓
Controller Bean Created
↓
User Added
↓
Users Retrieved
↓
Application Shutdown
↓
cleanUp() Method Executed



## Sample Output


db Connected (Simulated)

User added : Alice
User added : Bob

All User: [Alice, Bob]

DB Disconnected (Simulated)



## Note

This project uses an in-memory ArrayList to simulate database operations. The goal of the project is to understand Spring Core concepts and Dependency Injection rather than implement a production-ready CRUD application.



## Future Improvements

* Spring Boot Integration
* REST APIs
* MySQL Database
* Spring Data JPA
* Exception Handling
* Validation
* Swagger Documentation
* Email Notifications
