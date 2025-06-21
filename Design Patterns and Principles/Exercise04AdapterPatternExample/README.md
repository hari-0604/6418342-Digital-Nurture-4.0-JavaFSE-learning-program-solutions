# AdapterPatternExample

## Overview
This project demonstrates the **Adapter Design Pattern** to integrate multiple third-party payment gateways with different interfaces.

**The Adapter Pattern is a structural design pattern that allows incompatible interfaces to work together. It acts as a bridge between two incompatible classes by wrapping an existing class with a new interface.

## Components
- `PaymentProcessor`: Target interface.
- `PayPalGateway`, `StripeGateway`: Adaptee classes with their own APIs.
- `PayPalAdapter`, `StripeAdapter`: Adapters that implement the `PaymentProcessor` interface.
- `Main.java`: Demonstrates usage of adapters to process payments.

## Output
The output will show the successful processing of payments using both PayPal and Stripe gateways.