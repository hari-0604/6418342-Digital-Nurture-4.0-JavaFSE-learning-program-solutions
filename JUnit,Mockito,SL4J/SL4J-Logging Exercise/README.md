# SLF4J Logging Exercises (Java FSE 4.0 Nurture)

This project contains 3 SLF4J logging exercises with Maven and Logback setup.

## 🧪 Exercises

1. **Logging Error and Warning Levels** (`LoggingExample.java`)
2. **Parameterized Logging** (`ParameterizedLoggingExample.java`)
3. **Using Different Appenders** (`AppenderLoggingExample.java`, `logback.xml`)

## ▶️ Run Instructions

### Prerequisites
- Java 17+
- Maven

### Build the Project

```bash
mvn clean compile
```

### Run Each Example

```bash
java -cp target/classes:target/dependency/* com.example.LoggingExample
java -cp target/classes:target/dependency/* com.example.ParameterizedLoggingExample
java -cp target/classes:target/dependency/* com.example.AppenderLoggingExample
```

(logs will be output to both console and `logs/app.log` for Exercise 3)

---

✅ Submitted as part of **Java FSE 4.0 Nurture - Cognizant Training**
