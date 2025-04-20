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

---

## 🧪 How to Run

Clone the repository:
```bash
git clone https://github.com/jehmesquita/beautybooker-backend.git
cd beautybooker-backend
