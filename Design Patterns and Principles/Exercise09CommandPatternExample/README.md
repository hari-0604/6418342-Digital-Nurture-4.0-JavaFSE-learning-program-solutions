# CommandPatternExample

## Overview
This project demonstrates the **Command Design Pattern** using a simple home automation system for turning a light on and off via a remote.

**The Command Pattern is a behavioral design pattern that turns a request into a standalone object containing all information about the request. This object can be executed later, queued, logged, or undone.


## Components
- `Command`: Interface with `execute()` method
- `Light`: Receiver with `turnOn()` and `turnOff()` methods
- `LightOnCommand` / `LightOffCommand`: Concrete commands
- `RemoteControl`: Invoker that executes the command
- `Main`: Demonstrates usage

## Output
Light is turned ON
Light is turned OFF