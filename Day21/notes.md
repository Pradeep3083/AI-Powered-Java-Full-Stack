# Day 21 – Java OOPS (Types of Variables & Memory Concept)

## 1. Types of Variables in Java
Java supports three main types of variables:
- Instance Variables
- Static Variables
- Local Variables

---

## 2. Instance Variables
**Definition:**
Variables declared inside a class and outside all methods.

**Key Points:**
- Stored in **Heap memory**
- Memory allocated during **object creation**
- Object is required to access instance variables
- Scope: Throughout the class
- Each object gets its own copy

**Example:**
```java
class Test {
    String name;   // instance variable
}
```

---

## 3. Static Variables
**Definition:**
Variables declared using the `static` keyword inside a class and outside methods.

**Key Points:**
- Stored in **Method Area**
- Memory allocated at **class loading time**
- No object required to access
- Accessed using **class name**
- Shared among all objects
- Best suited for values that remain common

**Example:**
```java
class Test {
    static int age;
}

Test.age = 20;
```

---

## 4. Local Variables
**Definition:**
Variables declared inside a method or constructor.

**Key Points:**
- Stored in **Stack memory**
- Memory allocated when method is called
- Scope limited to the method
- No object required
- Destroyed after method execution

**Example:**
```java
class Test {
    void show() {
        int x = 10; // local variable
    }
}
```

---

## 5. Memory Allocation Summary

| Variable Type | Memory Area  | When Memory is Allocated | Object Required |
|---------------|-------------|--------------------------|-----------------|
| Instance      | Heap        | Object creation          | Yes             |
| Static        | Method Area | Class loading            | No              |
| Local         | Stack       | Method call              | No              |

---

## 6. Important Interview Points
- Java does **not have global variables**
- Instance variables act like global variables within a class
- Static variables consume memory only once
- Static variable changes affect all objects
- Proper use of static variables improves memory efficiency

---

## 7. Key Takeaways
- Understand when to use instance vs static variables
- Memory management is crucial for performance
- Static variables are class-level, instance variables are object-level
- Local variables are temporary and method-specific

---

**Day 21 Completed ✅**
