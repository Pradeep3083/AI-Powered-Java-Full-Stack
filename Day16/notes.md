# Day 16 – Type Casting & String Problem Solving in Java

## 📌 Overview
Day 16 focused on two important areas of **Core Java**:
1. **Type Casting (Primitive Data Types)**
2. **Problem-solving using Strings**

This session helped build a strong foundation for **understanding data flow, memory behavior, and logic building**, which are crucial for interviews and real-world Java programming.

---

## 🔁 What is Type Casting?
**Type casting** is the process of converting a value from one data type to another.

Java is a **strictly typed language**, so type conversion must follow specific rules.

---

## 🧩 Types of Type Casting

### 1️⃣ Implicit Type Casting (Widening)
- Done **automatically by JVM**
- Conversion from **smaller → larger** data type
- No data loss

#### Order:
```
byte → short → int → long → float → double
```

#### Example:
```java
byte b = 10;
short s = b;
int i = s;
long l = i;
```

✔ Safe  
✔ No explicit syntax required  

---

### 2️⃣ Explicit Type Casting (Narrowing)
- Done **manually by programmer**
- Conversion from **larger → smaller** data type
- **Data loss may occur**

#### Example:
```java
short s = 128;
byte b = (byte) s;   // Data loss occurs
```

⚠️ Value goes out of range and follows **cyclic behavior**

---

## ⚠️ Important Type Casting Rules
- JVM **does not allow unsafe conversions automatically**
- Explicit casting can cause:
  - Data loss
  - Precision loss
- `boolean` **cannot be type casted**
- Floating values lose decimal part when cast to integer

```java
float f = 123.78f;
int i = (int) f;   // i = 123
```

---

## 🔤 Character Type Casting (Unicode Concept)

- Java uses **Unicode**, not ASCII
- Each character has a numeric Unicode value

#### Example:
```java
char ch = 'A';
int value = ch;   // 65
```

- `'0'` → 48  
- `'A'` → 65  
- `'a'` → 97  

👉 Characters are internally stored as numbers.

---

## 🔡 String Problem Solving (Logic Building)

### 🔹 Problem 1: Reverse a String
**Input:** `EDUTECH`  
**Output:** `HCETUDE`

#### Approach:
- Traverse string from **last index to first**
- Use `charAt()` and `length()`
- Append characters to result

Key learning:
- Strings are immutable
- Each concatenation creates a new object

---

### 🔹 Problem 2: Pattern from String
**Input:** `abcde`  
**Output:**
```
a
ab
abc
abcd
abcde
```

#### Approach:
- Use nested loop or substring
- Build output step-by-step

---

## 🧠 Key Learnings
✔ Difference between implicit & explicit casting  
✔ JVM handles widening automatically  
✔ Explicit casting may cause data loss  
✔ Unicode handling of characters  
✔ Logic building using strings  
✔ Importance of `charAt()` and `length()`  

---

## 💡 Interview Tips
- Clearly explain **widening vs narrowing**
- Mention **data loss in explicit casting**
- Know character → integer conversion
- Be confident with string reversal logic
- Avoid using `==` for string comparison

---

## 🚀 Conclusion
Day 16 strengthened understanding of **data conversion and logic implementation**.
Type casting ensures correct data handling, while string problems improve **problem-solving skills**, both of which are essential for becoming a strong Java developer.
