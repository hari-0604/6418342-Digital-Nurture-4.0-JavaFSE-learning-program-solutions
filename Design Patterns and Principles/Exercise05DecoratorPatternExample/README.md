# DecoratorPatternExample

## Overview
This Java project demonstrates the **Decorator Design Pattern** to enhance a basic `Notifier` component with additional notification methods like **SMS** and **Slack** dynamically.


**The Decorator Pattern is a structural design pattern that allows behavior to be added to individual objects, dynamically, without affecting the behavior of other objects from the same class.

**It follows the principle of composition over inheritance — you "wrap" objects with new functionality instead of creating subclasses.

## Components
- **Notifier**: Interface
- **EmailNotifier**: Concrete implementation of Notifier
- **NotifierDecorator**: Abstract decorator
- **SMSNotifierDecorator / SlackNotifierDecorator**: Concrete decorators

## Sample Use
Wrap notifiers like this:
```java
Notifier multi = new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
multi.send("Hello from Deep Skilling!");
