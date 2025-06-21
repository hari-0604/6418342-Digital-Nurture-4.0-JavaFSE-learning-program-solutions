# Factory Method Pattern - Java Implementation

This project demonstrates the **Factory Method Design Pattern** in Java to manage the creation of different types of documents.

**The Factory Method Pattern is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

**It helps in decoupling object creation from its usage, enabling the code to adhere to the Open/Closed Principle — open for extension but closed for modification.

## Documents Supported
- Word Document
- PDF Document
- Excel Document

## Pattern Structure
- **Document (Interface):** Base interface for all documents.
- **Concrete Documents:** WordDocument, PdfDocument, ExcelDocument.
- **DocumentFactory (Abstract):** Defines the factory method.
- **Concrete Factories:** WordDocumentFactory, PdfDocumentFactory, ExcelDocumentFactory.

## How to Run
1. Compile all `.java` files.
2. Run `Main.java`.

## Output
Opening Word Document...
Opening PDF Document...
Opening Excel Document...