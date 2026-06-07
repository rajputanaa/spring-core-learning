# Spring Core Learning Project

## Overview

This repository was created to learn and practice the fundamental concepts of the Spring Framework before moving on to Spring Boot development.

The project demonstrates how Spring manages objects using the IoC (Inversion of Control) Container and how Dependency Injection helps create loosely coupled applications.

A simple user management flow is implemented using a layered architecture consisting of Controller, Service, Repository, and a simulated Database layer.

---

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

---

## Project Structure

Controller → Service → Repository → Database (Simulated)

### Layers

**Controller Layer**

* Handles user requests.
* Interacts with the Service layer.

**Service Layer**

* Contains business logic.
* Delegates data operations to the Repository layer.

**Repository Layer**

* Handles data access operations.
* Communicates with the Database layer.

**Database Layer**

* Simulated using an in-memory ArrayList.
* Demonstrates bean lifecycle management.

---

## Technologies Used

* Java 21
* Spring Framework 7
* Maven

---

## Bean Lifecycle Demonstration

The `DatabaseConnection` bean demonstrates:

1. Bean Creation
2. Initialization using `initMethod`
3. Runtime Usage
4. Destruction using `destroyMethod`

---

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

---

## Note

This project uses an in-memory ArrayList to simulate database operations. The goal of the project is to understand Spring Core concepts and Dependency Injection rather than implement a production-ready CRUD application.

---

## Future Improvements

* Spring Boot Integration
* REST APIs
* MySQL Database
* Spring Data JPA
* Exception Handling
* Validation
* Swagger Documentation
* Email Notifications
