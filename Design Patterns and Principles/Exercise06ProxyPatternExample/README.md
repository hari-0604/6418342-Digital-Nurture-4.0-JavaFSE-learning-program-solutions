# ProxyPatternExample

## Overview
This Java project demonstrates the **Proxy Design Pattern** by implementing lazy loading and caching for image files in an image viewer application.

**The Proxy Pattern is a structural design pattern that provides a placeholder or surrogate for another object to control access to it. The proxy object implements the same interface as the real object and delegates method calls to the real object, optionally adding extra behavior.

## Components
- **Image (Interface)**: Common interface with `display()` method.
- **RealImage (Real Subject)**: Simulates loading an image from a remote server.
- **ProxyImage (Proxy Class)**: Adds lazy initialization and caching logic.
- **Main.java**: Test class demonstrating proxy functionality.

## Sample Output
Loading image from remote server: nature.jpg
Displaying image: nature.jpg

Using cached image: nature.jpg
Displaying image: nature.jpg