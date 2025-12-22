# 📘 Day 12 – Nested for Loop, Pattern Programs & Reverse a Number

## 🔹 Topics Covered
- Nested for Loop
- Pattern Programs using Nested Loops
- Reverse a Number using while loop
- Digit extraction logic

---

## 🔹 1. Nested for Loop

A **nested for loop** is a loop written inside another loop.

- The **outer loop** controls the number of rows
- The **inner loop** controls the number of columns

### Syntax
```java
for(initialization; condition; increment/decrement) {
    for(initialization; condition; increment/decrement) {
        // statements
    }
}
```

### Important Points
- Used mainly for pattern and matrix-like problems
- Increases time complexity
- Should be used only when required

---

## 🔹 2. Pattern Programs

Pattern programs use **nested loops** to print structured outputs such as stars or numbers.

### Why Pattern Programs?
- Improve loop visualization
- Strengthen logical thinking
- Help understand row–column relationships
- Very useful for interviews and DSA basics

### Example Patterns Practiced
- Square star pattern
- Right triangle star pattern
- Number patterns
- Reverse number patterns

---

## 🔹 3. Reverse a Number

Reversing a number involves processing digits one by one using loops.

### Logic Used
- Extract last digit using `% 10`
- Build reverse number using multiplication
- Remove last digit using `/ 10`

### Core Logic
```java
digit = num % 10;
rev = rev * 10 + digit;
num = num / 10;
```

### Why This Problem Is Important
- Strengthens understanding of loops
- Improves digit manipulation logic
- Commonly asked in interviews

---

## 🔹 4. while Loop Usage

The `while` loop is used when the number of iterations is not known in advance.

### Syntax
```java
while(condition) {
    // statements
}
```

### Used In
- Reverse a number
- Digit-based problems

---

## 🎯 Learning Outcomes
- Clear understanding of nested loop execution
- Improved ability to write pattern programs
- Stronger grip on number manipulation logic
- Better visualization of loop flow

---

## ❓ Interview Focus Points
- Difference between single loop and nested loop
- Role of outer and inner loops
- How reverse number logic works
- Time complexity impact of nested loops

