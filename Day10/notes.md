# 📘 Day 10 – Switch Statement & Loops in Java

## 🔹 Topics Covered
- Switch Statement
- Control Statements
- Loops in Java
  - for loop
  - while loop
  - do-while loop (overview)

---

## 🔹 1. Switch Statement in Java

The `switch` statement is an alternative to multiple `if-else` conditions when comparing **fixed values**.

### ✅ Syntax
```java
switch(expression) {
    case value1:
        // statements
        break;
    case value2:
        // statements
        break;
    default:
        // statements
}
```

### 🔑 Key Points
- Works with `int`, `char`, `String`
- Does **NOT** support:
  - boolean
  - float
  - double
  - long
- `break` is mandatory to stop fall-through
- `default` executes when no case matches
- Java is **case-sensitive**

---

## 🔹 Switch Task Example
```java
1 → Monday
2 → Tuesday
...
7 → Sunday
Else → Invalid Day
```

---

## 🔹 2. Control Statements – Loops

Loops are used to **repeat tasks efficiently** without rewriting code.

### Why Loops?
- Reduce code duplication
- Improve readability
- Essential for DSA & real-world applications

---

## 🔹 3. for Loop

Used when the **number of iterations is known**.

### ✅ Syntax
```java
for(initialization; condition; increment/decrement) {
    // statements
}
```

### 🔑 Key Points
- Initialization runs once
- Condition checked before every iteration
- Increment/Decrement updates loop variable

### Example
```java
for(int i = 1; i <= 5; i++) {
    System.out.println("Hello World");
}
```

---

## 🔹 4. while Loop

Used when the **number of iterations is unknown**.

### ✅ Syntax
```java
while(condition) {
    // statements
}
```

### 🔑 Key Points
- Condition checked before execution
- Can cause infinite loop if condition never becomes false

### Dice Example
```java
while(dice != 6) {
    // roll dice
}
```

---

## 🔹 5. Common Mistakes
- Missing `break` in switch
- Infinite loops due to wrong condition
- Using switch for boolean logic (not allowed)
- Forgetting increment/decrement

---

## 🤓 Learning Outcomes
- Understood switch-case flow & break behavior
- Learned when to use for vs while loop
- Improved debugging skills using loops
- Built strong foundation for DSA

---

## 🚀 Next Topics
- do-while loop
- break & continue
- Nested loops
- Pattern programs

---

📍 Course: AI Powered Java Full Stack  
📍 Platform: Frontlines EduTech (FLM)  
📍 Day: 10
