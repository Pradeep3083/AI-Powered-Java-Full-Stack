# 📘 Day 13 – Break & Continue Statements and Methods in Java

## 🔹 Topics Covered
- break statement
- continue statement
- Labeled loops
- Methods in Java
- Static methods
- Instance methods
- Method return types

---

## 🔹 1. break Statement

The `break` statement is used to **terminate a loop immediately** when a specific condition is met.

### Key Points
- Exits the loop completely
- Commonly used in `for`, `while`, and `do-while` loops
- In nested loops, `break` exits only the **inner loop** by default

### Example
```java
for(int i = 1; i <= 5; i++) {
    if(i == 3) {
        break;
    }
    System.out.println(i);
}
```

---

## 🔹 2. Labeled break in Nested Loops

Labels are used to control **which loop to break** in nested loop scenarios.

### Example
```java
outer:
for(int i = 1; i <= 5; i++) {
    for(int j = 0; j < 5; j++) {
        if(j == 2) {
            break outer;
        }
    }
}
```

### Use Case
- Useful when working with **multiple nested loops**
- Provides better control over loop execution

---

## 🔹 3. continue Statement

The `continue` statement is used to **skip the current iteration** and move to the next iteration of the loop.

### Key Points
- Does not terminate the loop
- Only skips one iteration

### Example
```java
for(int i = 1; i <= 5; i++) {
    if(i == 3) {
        continue;
    }
    System.out.println(i);
}
```

---

## 🔹 4. Difference between break and continue

| Statement | Behavior |
|---------|----------|
| break | Exits the loop completely |
| continue | Skips current iteration only |

---

## 🔹 5. Methods in Java

A **method** is a block of code that performs a specific task and can be reused multiple times.

### Benefits of Methods
- Code reusability
- Improved readability
- Easy maintenance
- Avoids code duplication

---

## 🔹 6. Method Syntax

```java
returnType methodName(parameters) {
    // method body
    return value; // if returnType is not void
}
```

---

## 🔹 7. Return Types

- `void` → does not return any value
- Primitive types → `int`, `double`, etc.
- Non-primitive types → `String`, objects

---

## 🔹 8. Static Methods

- Belong to the class
- Can be called **without creating an object**
- Accessed using class name or directly inside the same class

### Example
```java
static int add(int a, int b) {
    return a + b;
}
```

---

## 🔹 9. Instance Methods

- Belong to an object
- Require object creation to call the method

### Example
```java
Test t = new Test();
t.sum();
```

---

## 🔹 10. main() Method

- Entry point of Java program
- JVM starts execution from `main()`
- Must be `public static void`

---

## 🎯 Learning Outcomes
- Clear understanding of break and continue
- Learned labeled loops for nested structures
- Understood method declaration and calling
- Difference between static and instance methods
- Writing reusable and structured Java code

---

## ❓ Interview Focus Points
- Difference between break and continue
- What are labeled loops?
- Static vs instance methods
- Why methods are important
- Can we call instance methods without object? (No)

---

📍 Course: AI Powered Java Full Stack  
📍 Platform: Frontlines EduTech (FLM)  
📍 Day: 13
