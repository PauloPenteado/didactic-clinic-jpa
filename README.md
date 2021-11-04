# didactic-clinic-jpa
Spring Boot project of a small application exposing REST APIs for CRUD operations. For persistency, it uses JPA.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

What things you need to install the software and how to install them

* [MySql](https://dev.mysql.com/downloads/installer/)
* An IDE of your choice (e.g. [eclipse](https://www.eclipse.org/downloads/), [intellij](https://www.jetbrains.com/idea/download/), [spring tools suite](https://spring.io/tools3/sts/all))
* [JDK 1.8](https://www.oracle.com/java/technologies/downloads/#java8-windows) or higher
* [Maven](https://maven.apache.org/install.html)

### Installing

Clone the repository to your local machine:
```
git clone https://github.com/PauloPenteado/didactic-clinic-jpa.git
```

Install MySql and create a sample clinic database. 

```
CREATE DATABASE IF NOT EXISTS clinic;
```

**Don't forget to update your application.properties with your DB credentials** 

No need to worry about DB objects. [Flyway](https://flywaydb.org/documentation/) will take care of it. 

Build the project with Maven:
```
mvn clean compile package
```

Run the project:
```
java -jar target/{newJarFileName}.jar
```

## Check if your project is running as expected following the link below:

http://localhost:8080/api/
