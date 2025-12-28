# Vehicle Management System — Assignment 2

## Project Overview
This project demonstrates Object-Oriented Programming using inheritance, abstraction, and associations. 
The main idea is to manage different types of vehicles using a common abstract class `Vehicle`, and extend
it into `Car`, `Motorcycle`, and `Truck`. A `Driver` class is used to show composition (vehicle has a driver)
and aggregation (one driver can drive multiple vehicles).

## Class Hierarchy
Vehicle (abstract)
 ├── Car
 ├── Motorcycle
 └── Truck

- Vehicle contains abstract methods startEngine() and stopEngine(), and a concrete displayInfo().
- Each subclass overrides the engine methods to provide its own behavior.
- Protected fields in Vehicle allow subclasses to access brand/year.
- super() is used in subclass constructors.

## How to Compile and Run
javac *.java
java Main

## Screenshots
<img width="1796" height="721" alt="image" src="https://github.com/user-attachments/assets/e41c53b7-e394-4b6c-b9a9-53a4394137cd" />

## Reflection
Inheritance made the project easier because shared attributes and methods were placed once in the abstract Vehicle class instead of repeating them in every subclass. Method overriding allowed each vehicle type to have its own engine behavior while keeping a common structure. I had slight difficulty understanding when to use protected or default access, but experimenting with visibility between classes helped me understand how encapsulation works in inheritance.
