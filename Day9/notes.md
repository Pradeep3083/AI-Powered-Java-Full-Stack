# 📘 Day 9 – Conditional Statements & Debugging in Java

Today’s session focused on **decision-making in Java using conditional statements** and understanding how to **debug logical flow** in programs.

These concepts are fundamental for controlling program execution based on conditions.

---

## 🔹 1. if Statement
The `if` statement executes a block of code **only when the condition is true**.
### Syntax:
```java
if (condition) {
    // code executes if condition is true
}
```

Example:
```java
int num = 10;

if (num > 5) {
    System.out.println(num + " is greater than 5");
}
```

📌 Debug Insight:
- If the condition is false, Java completely skips the block.
- No partial execution happens.

---

# 🔹 2. if–else Statement
Used when Java must choose one out of two paths.
### Syntax:
```java
if (condition) {
    // executes if true
} else {
    // executes if false
}
```

Example:
```java
int num = 4;

if (num > 5) {
    System.out.println(num + " is bigger");
} else {
    System.out.println(num + " is smaller");
}
```

📌 Debug Insight:
- Exactly one block executes.
- Helps clearly trace which condition failed.

---

# 🔹 3. else-if Ladder
Used when multiple conditions need to be checked sequentially.
### Syntax:
```java
if (condition1) {
    // executes if condition1 is true
} else if (condition2) {
    // executes if condition2 is true
} else {
    // executes if none are true
}
```
Example:
```java
int num = -5;

if (num > 0) {
    System.out.println("Positive Number");
} else if (num < 0) {
    System.out.println("Negative Number");
} else {
    System.out.println("Zero");
}
```
📌 Debug Insight:
- Java checks conditions top to bottom.
- Once a condition is true, remaining checks are skipped.
- Order of conditions is very important.

---

🔹 4. Nested if-else
An if inside another if, used when decisions depend on multiple related conditions.
### Example:
```java
boolean isMajor = true;
boolean canVote = false;

if (isMajor) {
    if (canVote) {
        System.out.println("He is Major and eligible to vote");
    } else {
        System.out.println("He is Major but not eligible to vote");
    }
} else {
    System.out.println("He is Minor");
}
```
📌 Debug Insight:
- Inner if executes only if outer condition is true.
- Makes complex logic easier to understand step-by-step.

---

🔹 5. Debugging Conditional Logic
Today’s key focus was understanding why a condition executes or fails.
Debug Techniques Practiced:
- Printing variable values before conditions
- Checking boolean results step by step
- Understanding execution flow
- Verifying condition order
- Avoiding logical mistakes
📌 Most bugs occur due to wrong conditions, not syntax errors.

✅ Summary of Day 9
- Conditional statements control program flow
- if executes code only when condition is true
- if–else chooses exactly one path
- else-if ladder checks conditions sequentially
- Nested if helps manage complex decisions
- Debugging logic is crucial for correct output
- Order of conditions directly affects execution
