# ObserverPatternExample

## Overview
This project demonstrates the **Observer Design Pattern** in a stock monitoring system. When a stock price changes, all registered observers (apps) get notified.

**The Observer Pattern is a behavioral design pattern where an object (called the Subject) maintains a list of dependents (called Observers) and notifies them automatically of any state changes, usually by calling one of their methods.

## Components
- `Stock`: Subject interface for registering/removing observers.
- `StockMarket`: Concrete subject maintaining stock price and notifying observers.
- `Observer`: Observer interface with `update()` method.
- `MobileApp`, `WebApp`: Concrete observers.
- `Main.java`: Tests observer pattern flow.

## Sample Flow
- Register MobileApp and WebApp
- Change stock price (all observers are notified)
- Deregister one observer, and change price again

