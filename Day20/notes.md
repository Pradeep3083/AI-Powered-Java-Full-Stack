# Day 20 – Object-Oriented Programming (OOPS) in Java – Part 1

## 📌 Overview
Day 20 marked the beginning of **Object-Oriented Programming (OOPS)** in Java.
This day focused on understanding the **core concepts of OOPS**, especially **Class, Object, and Constructors**, which form the foundation for all advanced Java concepts.

---

## 🔹 What is OOPS?
**OOPS (Object-Oriented Programming System)** is a programming paradigm where software is designed using **objects** that represent real-world entities.

### Why OOPS?
- Helps manage large and complex programs
- Improves code **reusability**
- Makes applications **maintainable and scalable**
- Models real-world problems effectively

Java follows OOPS principles such as **encapsulation, inheritance, polymorphism, and abstraction**.

---

## 🔹 Class in Java
A **class** is a **blueprint or template** used to create objects.

A class can contain:
- **Variables** (Fields / Properties)
- **Methods** (Functions / Behaviors)
- **Constructors**

Example:
- A `Car` class defines properties like color, model, speed
- And behaviors like start(), stop(), accelerate()

👉 Writing a class does **not** allocate memory.

---

## 🔹 Object in Java
An **object** is a real-world instance of a class.

### Key Points:
- Created using the `new` keyword
- Multiple objects can be created from a single class
- Each object has **separate memory**
- Objects can store **different values** for the same variables

Example:
```java
Car car1 = new Car();
Car car2 = new Car();
```

---

## 🔹 Constructor in Java
A **constructor** is a special method used to:
- Create an object
- Initialize instance variables

### Characteristics:
- Constructor name is same as class name
- Does not have a return type
- Automatically invoked when an object is created

### Types of Constructors:
- Default Constructor
- Parameterized Constructor

---

## 🔹 Is Java 100% Object-Oriented?
❌ No, Java is **not 100% object-oriented**.

### Reason:
- Java supports **primitive data types**
  (`int`, `char`, `double`, `boolean`, etc.)
- Primitive types are not objects

### Solution:
Java provides **Wrapper Classes**:
- `int` → `Integer`
- `char` → `Character`
- `double` → `Double`

---

## 🔹 Memory Allocation Concept
- Memory is allocated **only when an object is created**
- No memory is allocated at class definition
- Memory depends on:
  - Number of instance variables
  - Data types of variables

Example:
- A class with **3 int variables**
- Each `int` ≈ 4 bytes
- Total ≈ 12 bytes (approx.)

---

## 🔹 Backward Compatibility of Java
Java is a **backward compatible language**.

### Meaning:
- Code written in older Java versions
- Can still run on newer Java versions without changes

This is a major reason why Java is widely used in **enterprise applications**.

---

## 🧠 Key Learnings
✔ Difference between class and object  
✔ Role of constructors in object creation  
✔ Why Java is not fully OOP  
✔ Memory allocation happens at object level  
✔ Importance of wrapper classes  
✔ Why Java supports backward compatibility  

---

## 💡 Interview Tips
- Clearly explain **class vs object**
- Mention memory allocation only during object creation
- Be clear about why Java is not 100% OOP
- Know at least one example of wrapper classes

---

## 🚀 Conclusion
Day 20 laid the foundation for **OOPS in Java**.
Understanding classes, objects, and constructors is essential before moving to advanced topics like **inheritance, polymorphism, abstraction, and encapsulation**.
