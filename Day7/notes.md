# 📘 Day 7 – Unary & Relational Operators in Java

Day 7 focused on understanding **Unary Operators** and **Relational Operators** in Java.  
These operators are essential for decision-making, expressions, and control flow in real-world programs.

---

## 🔹 1. Unary Operators in Java

Unary operators work on **a single operand**.

### ✔ Unary Plus (+)
Indicates a positive value (mostly optional).

```java
int a = 10;
System.out.println(+a); // 10
```

### ✔ Unary Minus (-)
Negates the value.

```java
int b = 20;
System.out.println(-b); // -20
```

### ✔ Logical NOT (!)
Reverses the boolean value.

```java
boolean isEligible = true;
System.out.println(!isEligible); // false
```

## 🔹 Increment & Decrement Operators

Used to increase or decrease a value by 1.

### ✔ Post-Increment (x++)
Returns the current value, then increments.

```java
int x = 5;
System.out.println(x++); // 5
System.out.println(x);   // 6
```

### ✔ Pre-Increment (++x)
Increments first, then returns the value.

```java
int y = 5;
System.out.println(++y); // 6
```

### ✔ Post-Decrement (x--)
Returns the value, then decrements.

```java
int z = 5;
System.out.println(z--); // 5
System.out.println(z);   // 4
```

### ✔ Pre-Decrement (--x)
Decrements first, then returns the value.

```java
int n = 5;
System.out.println(--n); // 4
```

### ✔ Increment Inside Expressions
```java
int a = 10;
int result = a++ + ++a;
// 10 + 12 = 22
System.out.println(result);
System.out.println(a); // 12
```

## 🔹 2. Relational Operators in Java

Relational operators compare two values and always return a boolean result.

| Operator | Meaning |
|----|----|
| == | Equal to |
| != | Not equal to |
| > | Greater than |
| < | Less than |
| >= | Greater than or equal to |
| <= | Less than or equal to |

### ✔ Example: Relational Operators
```java
int num1 = 10;
int num2 = 20;
int num3 = 10;

System.out.println(num1 == num2); // false
System.out.println(num1 == num3); // true
System.out.println(num1 > num2);  // false
System.out.println(num1 < num2);  // true
System.out.println(num1 != num3); // false
System.out.println(5 != 6);
```

### ✔ Using Boolean Variables (Best Practice)
```java
boolean isEqual = num1 == num3;
boolean isGreater = num2 > num1;

System.out.println(isEqual);   // true
System.out.println(isGreater); // true
```

✅ Summary of Day 7
- Learned all unary operators: +, -, !, ++, --
- Understood pre vs post increment/decrement clearly
- Practiced unary operators inside expressions
- Learned all relational operators
- Used boolean variables for cleaner and readable logic
- Strengthened foundation for control statements (if, loops)

