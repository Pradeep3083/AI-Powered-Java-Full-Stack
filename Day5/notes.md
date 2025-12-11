# 📘 Day 5 – Naming Conventions & Data Types in Java

Today’s session focused on two core fundamentals of Java programming:

- Naming Conventions  
- Variables & Primitive Data Types  
- Why Java is a Strictly Typed Language  

These basics form the foundation for writing clean, readable, and error-free Java code.

---

## 🔹 1. Naming Conventions in Java

### ✔ Class Names → PascalCase  
Every word begins with a capital letter.

**Examples:**  
- `StudentProfile`  
- `CricketScoreBoard`

**Rules:**  
- Can contain alphabets & numbers  
- Cannot start with a number  
- `_` and `$` allowed but NOT recommended  

---

### ✔ Variable Names → camelCase  
First word lowercase, next words capitalized.

**Examples:**  
- `studentId`  
- `userFullName`

**Rules:**  
- Numbers allowed (not at the start)  
- `_` and `$` allowed but not recommended  
- Use meaningful names  

---

### ✔ Method Names → camelCase  
Should start with a verb.

**Examples:**  
- `calculateSalary()`  
- `fetchUserDetails()`  

---

### ✔ Package Names → lowercase only  
**Examples:**  
- `com.project`  
- `com.flm_media`

**Rules:**  
- Always lowercase  
- Numbers allowed  
- `_` allowed as special character  
- Dot (`.`) represents subpackages  

---

### ✔ Project Names → PascalCase  
Example:  
- `JavaBasicsProject`

---

## 🔥 2. Understanding Data Types

Java is a **strictly typed** language → every variable must have a declared type.

Java: *"Tell me the data type first… then I’ll store the value!"* 😄

---

## 🧊 Primitive Data Types (8 Total) + Default Values

Here are the primitive types with size, purpose, and **default values**:

| Type | Size | Purpose | Default Value |
|------|------|---------|----------------|
| byte | 1 byte | small number | 0 |
| short | 2 bytes | medium range numbers | 0 |
| int | 4 bytes | most commonly used number type | 0 |
| long | 8 bytes | large numbers (phone, population) | 0L |
| float | 4 bytes | decimal numbers (7 digits precision) | 0.0f |
| double | 8 bytes | high precision decimals (16 digits) | 0.0d |
| char | 2 bytes | single character | '\u0000' *(null char)* |
| boolean | 1 bit | true/false | false |

---

## 🧠 Why So Many Number Types?

Different data types exist due to:

- Memory efficiency  
- Required range  
- Performance  

**Examples:**  
- `byte` → storing age  
- `int` → general calculations  
- `long` → huge values like Aadhaar, population  
- `double` → cricket strike rate, scientific values  

---

## 📝 Example Code from Class

```java
package com.primitive;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        byte runsPerOver = 36;
        short oneMbInKb = 1024;
        int youtubeSubscribers = 50000;
        long worldPopulation = 8000000000L;

        float petrolPricePerLitre = 106.75f;
        double strikeRate = 182.345678;

        char headsOrTales = 'H';
        boolean isJavaFun = true;

        System.out.println("Runs per Over: " + runsPerOver);
        System.out.println("1 MB in KB: " + oneMbInKb);
        System.out.println("YouTube Subscribers: " + youtubeSubscribers);
        System.out.println("World Population: " + worldPopulation);
        System.out.println("Petrol Price per Litre: " + petrolPricePerLitre);
        System.out.println("Strike Rate: " + strikeRate);
        System.out.println("Coin Toss Result (H/T): " + headsOrTales);
        System.out.println("Is Java Fun? " + isJavaFun);
    }
}
```

---

## ✅ Summary of Day 5
- Naming convention improves readability & maintainability
- Java requires type declarations → strictly typed language
- Primitive types differ in memory, range & precision
- Understanding fundamental datatypes is essential for real-time coding
- Example program practiced in class
