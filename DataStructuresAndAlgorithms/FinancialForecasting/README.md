# Financial Forecasting Tool

## Objective

Use recursion to calculate the future value of an investment based on growth rate over time.

---

## What is Recursion?

Recursion is a programming technique where a function calls itself to solve smaller parts of a problem. It simplifies problems like repeated multiplications, tree traversal, etc.

---

## Formula


Using recursion:
```java
FV(n) = FV(n-1) * (1 + rate / 100)
