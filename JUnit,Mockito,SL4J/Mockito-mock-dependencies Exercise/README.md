# Mockito: Mocking Dependencies in Spring Tests (Java FSE 4.0 Nurture)

This project demonstrates how to mock service and repository dependencies in unit and integration tests using **Mockito** and **Spring Boot Test**.

## ✅ Exercises Included

1. **Mocking a Service in a Controller Test** (`UserControllerTest`)
2. **Mocking a Repository in a Service Test** (`UserServiceTest`)
3. **Mocking a Service in an Integration Test** (`UserIntegrationTest`)

## 📁 Structure

```
mockito-mock-dependencies/
├── pom.xml
├── src/
│   ├── main/java/com/example/
│   │   ├── User.java
│   │   ├── UserRepository.java
│   │   ├── UserService.java
│   │   └── UserController.java
│   └── test/java/com/example/
│       ├── UserControllerTest.java
│       ├── UserServiceTest.java
│       └── UserIntegrationTest.java
```

## ▶️ Run Instructions

```bash
mvn test
```

To run a specific test class:
```bash
mvn -Dtest=com.example.UserControllerTest test
```

---

✅ Submitted as part of **Java FSE 4.0 Nurture - Cognizant Training**
