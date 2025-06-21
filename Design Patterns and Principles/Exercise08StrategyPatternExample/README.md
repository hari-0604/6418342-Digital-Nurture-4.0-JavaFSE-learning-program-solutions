# StrategyPatternExample

## Overview
This project demonstrates the **Strategy Design Pattern** by allowing dynamic selection of payment methods like **Credit Card** and **PayPal** at runtime.

**The Strategy Pattern is a behavioral design pattern that defines a family of algorithms, encapsulates each one, and makes them interchangeable. It allows the algorithm to be selected at runtime instead of being hardcoded.

## Components
- `PaymentStrategy`: Strategy interface with `pay()` method.
- `CreditCardPayment`, `PayPalPayment`: Concrete strategies.
- `PaymentContext`: Holds and executes current strategy.
- `Main.java`: Demonstrates usage.


