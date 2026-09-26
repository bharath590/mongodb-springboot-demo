# Spring Boot + MongoDB Demo

A small learning project showing customer persistence with Spring Data MongoDB and a Spring Web controller.

## Stack

Java 17 · Spring Boot 3.0.1 · Spring Data MongoDB · Maven

## Project map

- `Controller.java`: HTTP endpoints under `/api`.
- `Customer.java`: customer document model.
- `CustomerRepo.java`: database access.
- `application.properties`: application configuration.

## Current endpoints

| Method | Path | Behavior |
| --- | --- | --- |
| GET | `/api/employees` | Saves a hard-coded sample customer and returns `saved` |
| GET | `/api/employee` | Lists customers |

The sample write uses GET and the endpoint naming is inconsistent. These are characteristics of the original learning demo, not recommended API design.

## Run locally

Configure your MongoDB connection, then run with Java 17:

```bash
./mvnw spring-boot:run
```

On Windows, use `mvnw.cmd spring-boot:run`. Keep connection secrets outside version control.
