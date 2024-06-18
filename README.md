# Offering API Service

## Overview

The Offering API Service manages offerings provided by the application.

## Features

- **Get All Offerings**
  - Retrieve a list of all offerings available.
  - Convert `OfferingEntity` objects to `OfferingModel` representations.

- **Get Offering by ID**
  - Fetch a specific offering by its unique identifier (`offeringId`).
  - Convert `OfferingEntity` to `OfferingModel`.

- **Create Offering**
  - Add a new offering to the database.
  - Convert `OfferingModel` to `OfferingEntity` and persist using `OfferingRepository`.


## Technologies Used

- **Spring Boot**: Framework for building the API.
- **Java**: Programming language for backend development.
- **Hibernate**: ORM for interacting with the database.
- **PostgreSQL**: Database for storing location data.
- **Swagger**: API documentation tool for easy API exploration.

## Prerequisites

- Java 11 or higher
- Maven
- PostgreSQL database
- IDE (e.g., IntelliJ IDEA, Eclipse) for development

## Getting Started

1. **Clone the Repository**
    ```bash
    git clone https://github.com/your-username/offering-api.git
    cd offering-api
    ```

2. **Set Up PostgreSQL**
    - Create a PostgreSQL database named `location`.
    - Update `application.properties` with your PostgreSQL credentials:
      ```properties
      server.port=8081
      spring.datasource.url=jdbc:postgresql://localhost:5432/location
      spring.datasource.username=your_username
      spring.datasource.password=your_password
      ```

3. **Build and Run the Application**
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

4. **Explore the API**
    - Once running, access the Swagger UI to explore and test the API endpoints:
      [http://localhost:8081/swagger-ui.html](http://localhost:8081/swagger-ui.html)
