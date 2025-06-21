# DependencyInjectionExample

## Overview
This Java project demonstrates **constructor-based Dependency Injection** in a customer management app.

**Dependency Injection is a design pattern and a technique used to achieve Inversion of Control (IoC) between classes and their dependencies.

**Instead of a class creating its dependencies (via new), they are provided (injected) from the outside — typically by a framework, container, or configuration.

## Components
- `CustomerRepository`: Interface for customer lookup
- `CustomerRepositoryImpl`: Simulated implementation
- `CustomerService`: Service that depends on repository
- `Main.java`: Shows injection and usage

## Output
The program will output the customer's name and age, demonstrating successful dependency injection.

Customer Lookup Result: Hari Krishna (ID: 1)
Customer Lookup Result: Customer not found.
