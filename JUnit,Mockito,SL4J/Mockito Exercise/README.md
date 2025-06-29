# Mockito Exercises (Java FSE 4.0 Nurture)

This project contains hands-on exercises using **Mockito** and **JUnit 5**, organized by exercise number.

## 📁 Project Structure

```
mockito-maven-structured/
├── pom.xml
├── src/
│   ├── main/java/com/example/
│   │   ├── ExternalApi.java
│   │   └── MyService.java
│   └── test/java/com/example/
│       ├── exercise1/MyServiceTest.java
│       ├── exercise2/MyServiceTest.java
│       ├── ...
│       └── exercise7/MyServiceTest.java
```

## 🚀 How to Run

### Prerequisites
- Java 8 or higher
- Maven

### Run All Tests

```bash
mvn test
```

### Run Specific Exercise Test

```bash
mvn -Dtest=com.example.exercise1.MyServiceTest test
```

Replace `exercise1` with `exercise2`, ..., `exercise7` to run the corresponding test.

## 📚 Exercises Covered

1. **Mocking and Stubbing**
2. **Verifying Interactions**
3. **Argument Matching**
4. **Handling Void Methods**
5. **Multiple Returns from Mocks**
6. **Verifying Interaction Order**
7. **Handling Void Methods with Exceptions**

---

✅ Submitted as part of **Java FSE 4.0 Nurture - Cognizant Training**
