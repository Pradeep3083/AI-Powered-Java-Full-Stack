# 📘 Day 11 – Java Logic Building & Loop Practice

## 🔹 Topics Covered
- If–Else Conditional Statements
- for Loop
- while Loop
- do-while Loop
- Modulus Operator (%)
- Scanner Class for User Input
- Basic Logical & Number-Based Problems

---

## 🔹 1. If–Else Conditional Statements

Used to make decisions based on conditions.

### Syntax
```java
if(condition) {
    // executes if condition is true
} else if(condition) {
    // executes if above condition is false
} else {
    // executes when all conditions are false
}
```

### Example Use Cases
- Even / Odd number check
- Handling special cases like 0
- Comparing values

---

## 🔹 2. Modulus Operator (%)

Returns the remainder after division.

### Examples
| Expression | Result |
|----------|--------|
| 10 % 2 | 0 |
| 7 % 2 | 1 |
| 123 % 10 | 3 |

### Used For
- Even / Odd logic
- Extracting last digit of a number

---

## 🔹 3. for Loop

Used when the **number of iterations is known**.

### Syntax
```java
for(initialization; condition; increment/decrement) {
    // code
}
```

### Example
```java
for(int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

### Use Cases
- Counting even numbers from 1 to N
- Printing numbers in reverse order

---

## 🔹 4. while Loop

Used when the **number of iterations is unknown**.

### Syntax
```java
while(condition) {
    // code
}
```

### Important Point
- Condition is checked before execution
- Wrong condition can cause infinite loop

### Common Use
- Digit-based problems

---

## 🔹 5. do-while Loop

A loop that executes **at least once**, even if the condition is false.

### Syntax
```java
do {
    // code
} while(condition);
```

### Key Points
- Exit control loop
- Semicolon after while is mandatory
- Executes at least once

---

## 🔹 6. Scanner Class

Used to take input from the user.

### Example
```java
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
```

---

## 🧠 Logical Problems Practiced

### ✔ Even or Odd Number
- Used if–else
- Handled special case for 0

### ✔ Count Even Numbers (1 to N)
- Used for loop
- Used counter variable

### ✔ Print Even & Odd in Reverse
- Reverse for loop
- Conditional checks inside loop

### ✔ Count Digits
- Used while loop
- Repeated division by 10

### ✔ Print Digits of a Number
- Used % 10 to extract digit
- Used / 10 to remove digit

### ✔ Sum of Digits (IMPORTANT)
- Used while / do-while loop
- Accumulator variable (sum)

---

## 🔥 Key Logic for Digit Problems

```java
digit = num % 10;   // extract last digit
num = num / 10;    // remove last digit
```

---

## ❓ Interview Focus Points
- Difference between for and while loop
- Difference between while and do-while loop
- Entry control vs Exit control loop
- Why modulus operator is used
- Time complexity of digit problems → O(n)

---

## 🎯 Learning Outcomes
- Improved logical thinking
- Learned to break problems into steps
- Gained confidence with loops & conditions
- Built strong foundation for DSA

