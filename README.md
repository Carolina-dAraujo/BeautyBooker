# 💇‍♀️ BeautyBooker API

A RESTful API developed with **Java + Spring Boot** for managing beauty service appointments. This is the backend of a full-stack project, with the frontend built in React.js.

---

## 🚀 Features

- User registration and authentication (JWT)
- Appointment scheduling
- Service and professional management
- Integrated Swagger API documentation
- Role-based access control

---

## 🛠️ Technologies Used

- Java 17
- Spring Boot
- Spring Security
- Spring Data JPA
- PostgreSQL
- Swagger/OpenAPI 3
- Maven
- ModelMapper
- Flyway (if used)
- Docker (optional)

---

## 📁 Project Structure

```bash
src/
├── config/         # Security, Swagger, CORS configurations, etc.
├── controller/     # REST Controllers
├── dto/            # Data Transfer Objects
├── entity/         # JPA Entities
├── repository/     # JPA Repository interfaces
├── service/        # Business logic
└── BeautyBookerApplication.java
```

---

## 🧪 How to Run

Clone the repository:
```bash
git clone https://github.com/jehmesquita/beautybooker-backend.git
cd beautybooker-backend
```
### Configure your `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/beautybooker
spring.datasource.username=yourUsername
spring.datasource.password=yourPassword
jwt.secret=yourSecretKey
```

## 🛠️ Build and Run

```bash
./mvnw spring-boot:run
```
## 🌐 Access Swagger UI

• URL: `http://localhost:8080/swagger-ui.html`  
• [Click to open Swagger UI](http://localhost:8080/swagger-ui.html)

## 👩‍💻 About Me

Developed by **Carol Araújo**, Information Systems student at UFRPE and software engineering intern.  
A curious full-stack development.

🔗 [GitHub]([https://github.com/jehmesquita](https://github.com/Carolina-dAraujo))  
🔗 [LinkedIn]([https://www.linkedin.com/in/your-profile-url](https://www.linkedin.com/in/carolina-de-ara%C3%BAjo-339bba18b/))
