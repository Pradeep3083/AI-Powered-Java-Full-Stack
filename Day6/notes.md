# 📘 Day 6 – Non-Primitive Data Types, Default Values & Operators in Java

Today’s session focused on important Java fundamentals:

- Non-Primitive Data Types  
- String Memory Allocation  
- Default Values of Data Types  
- Arithmetic & Assignment Operators  
- String Concatenation Rules  

These concepts help us understand how Java stores and processes data internally.

---

## 🔹 1. Non-Primitive Data Types in Java

### ✔ String – A Non-Primitive Data Type  
A **String** is a **class** in Java, not a primitive.  
It represents a group of characters enclosed in **double quotes (" ")**.

**Examples:**
```java
String s1 = "ABC";
String s2 = "Welcome to JFS";
String s3 = "AAA'AA'AAA";
String name = "Pradeep Sai";
```
Default value of String is null. Not only String any class type default value is null.

---

## 🔹 2. String Memory Allocation

Each character = 2 bytes (Unicode).
**Example:**
```java
"FLM"
Characters = 3
Memory = 3*2 = 6 bytes
```
String also has extra overhead (object header, hash, metadata) ~ 24 - 32 bytes.

**Another Example:**
```java
"FLM Edutech"
Characters = 11 -> 22 bytes
Overhead = 32 bytes
Total ~ 54 bytes
```

---

## 🔹 3. Operators in Java (Arithmetic & Assignment)

### ✔ Arithmetic Operators

| Operator | Description |
|------|------|
| + | Addition/String concatenation |
| - | Subtraction |
| * | Multiplication |
| / | Division |
| % | Remainder |

### ✔ Assignment Operators
**Example:**
```java
int a = 10;
a = a + 5;
a += 5;
a -= 3;
a *= 2;
a /= 4;
a %= 2;
```

---

## 🔹 4. String Behavior in Expressions

When a String is involved in  + operation, everything becomes a String.

**Example:**
```java
"FLM" + 1      → "FLM1"
1 + "FLM"      → "1FLM"
1 + 2 + "FLM"  → "3FLM"
"1" + 2 + "FLM" → "12FLM"
```

---

## 📝 Example Code from Class

```java
package com.arithmetic;

public class ArithmeticOperators {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        System.out.println(num1 + num2 + 5);

        num1 = 15;
        int num3 = num1 + num2 + 10;
        System.out.println(num3);

        String s1 = "FLM";
        String s2 = "Edutech";

        System.out.println(s1 + " " + s2);
        System.out.println(s1 + 1);
        System.out.println(s1 + num1);
        System.out.println(num1 + s1);
        System.out.println("1" + "2" + s1);
        System.out.println(1 + s1 + 2);
        System.out.println(1 + 2 + s1);

        float num5 = 2.0f;
        float num6 = 3.0f;
        int num7 = 3;

        System.out.println(num5 + num6);
        System.out.println(num5 + num7);

        num1 = 5;
        num2 = 10;

        System.out.println(num2 - num1);
        System.out.println(num1 * num2);
        System.out.println(10 / 5);
        System.out.println(5 / 2);
        System.out.println(5 % 2);

        System.out.println(5.0 / 2.0);
        System.out.println(5.0 % 2.0);

        int num9 = 10;
        num9 += 10;
        num9 -= 5;
        num9 *= 2;
        num9 /= 4;
        num9 %= 4;

        System.out.println(num9);
    }
}

```

---

## ✅ Summary of Day 6
- String is a non-primitive type and is stored with extra memory overhead
- Default values apply only to instance variables, not local variables
- Primitive types have fixed sizes and default values
- String concatenation follows left-to-right evaluation
- Arithmetic & assignment operators form the foundation for expressions
- Understanding type behavior is essential for error-free coding

