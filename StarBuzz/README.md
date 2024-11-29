# ☕ StarBuzz Coffee Shop

Welcome to the **StarBuzz Coffee Shop** design documentation! This project demonstrates the use of the **Decorator Pattern** to create a flexible and extensible coffee shop system.

## 📜 Table of Contents
- [Introduction](#introduction)
- [Decorator Pattern](#decorator-pattern)
- [Design Principles](#design-principles)
- [Usage](#usage)
- [Conclusion](#conclusion)

## 🌟 Introduction

StarBuzz Coffee Shop is a fictional coffee shop that offers a variety of beverages. The goal of this project is to design a system that allows for the dynamic addition of beverage condiments using the **Decorator Pattern**.

## 🎨 Decorator Pattern

The **Decorator Pattern** is a structural design pattern that allows behavior to be added to individual objects, dynamically, without affecting the behavior of other objects from the same class. It is typically used to adhere to the **Open/Closed Principle**.

### How It Works

1. **Component**: The base interface or abstract class for all objects (e.g., `Beverage`).
2. **Concrete Component**: The class that we want to add new behavior to (e.g., `Espresso`, `HouseBlend`).
3. **Decorator**: An abstract class that implements the `Component` interface and contains a reference to a `Component` object.
4. **Concrete Decorators**: Classes that extend the `Decorator` class and add new behavior (e.g., `Mocha`, `Whip`).

## 🛠️ Design Principles

This project follows several key design principles:

- **Single Responsibility Principle**: Each class has only one reason to change.
- **Open/Closed Principle**: Classes are open for extension but closed for modification.
- **Composition over Inheritance**: Behavior is added through composition rather than inheritance.

## 🚀 Usage

To create a beverage and add condiments, you can use the following code:

```java
Beverage beverage = new Espresso();
beverage = new Mocha(beverage);
beverage = new Whip(beverage);

System.out.println(beverage.getDescription() + " $" + beverage.cost());
```

In this example, we start with an `Espresso` and dynamically add `Mocha` and `Whip` condiments.

## 📚 Conclusion

The **Decorator Pattern** provides a flexible and reusable way to add functionality to objects. By following design principles such as the **Single Responsibility Principle** and **Open/Closed Principle**, we can create a maintainable and scalable system.

Enjoy your coffee! ☕