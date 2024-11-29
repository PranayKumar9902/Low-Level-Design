# 🦆 DuckGame

Welcome to **DuckGame**! This project is designed using the Strategy Design Pattern to demonstrate flexible and reusable code for different types of ducks and their behaviors.

## 📚 Table of Contents
- [Introduction](#introduction)
- [Design Pattern](#design-pattern)
- [Project Structure](#project-structure)
- [Installation](#installation)
- [Usage](#usage)

## 🌟 Introduction
DuckGame is a simple simulation of ducks with various behaviors. By using the Strategy Design Pattern, we can easily add new behaviors or modify existing ones without altering the core logic of the game.
gorithm to vary independently from the clients that use it.

## 🧩 Strategy Design Pattern
The Strategy Design Pattern is a behavioral design pattern that enables selecting an algorithm's behavior at runtime. It defines a family of algorithms, encapsulates each one, and makes them interchangeable. This pattern allows the algorithm to vary independently from the clients that use it.

### 🎨 Design Principles Used:
- **Encapsulate What Varies**: Identify the aspects of your application that vary and separate them from what stays the same.
- **Program to an Interface, Not an Implementation**: Depend on abstractions (interfaces) rather than concrete classes.
- **Favor Composition Over Inheritance**: Use composition to achieve code reuse and flexibility instead of relying on inheritance.

### Key Components:
- **Duck**: The abstract class representing a duck.
- **FlyBehavior**: The interface for fly behaviors.
- **QuackBehavior**: The interface for quack behaviors.
- **Concrete Behaviors**: Specific implementations of flying and quacking behaviors.


## Project Structure

```
│   └── client/
│       └── Main.java
```

## Installation
To get started with DuckGame, clone the repository and compile the source code.

```bash
git clone https://github.com/yourusername/DuckGame.git
cd DuckGame
javac src/*.java
```

## Usage
Run the main class to see the ducks in action.

```bash
java src.Main
```
