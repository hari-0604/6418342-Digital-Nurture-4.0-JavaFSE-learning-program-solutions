# BuilderPatternExample

## Overview
This Java project demonstrates the **Builder Design Pattern** to construct complex `Computer` objects with optional components.

**The Builder Pattern is a creational design pattern that is used to construct complex objects step-by-step. It allows the creation of different representations of an object using the same construction process.

**It separates the construction of a complex object from its representation, so that the same construction process can create different representations.

## Pattern Structure
- `Computer`: Product class with private constructor.
- `Builder`: Static inner class used to create Computer instances.

## Usage
You can create different configurations like:

```java
Computer gamingPC = new Computer.Builder()
    .setCpu("Intel i9")
    .setRam("32GB")
    .setStorage("1TB SSD")
    .setGraphicsCard(true)
    .setBluetooth(true)
    .build();
