# Day 15 – Strings in Java (String Constant Pool & Methods)

## 📌 Overview
Day 15 focused on **Strings in Java**, one of the most important and frequently asked interview topics.
The session covered **how strings are created, where they are stored in memory, why strings are immutable**, and **commonly used String methods**.

---

## 🔤 What is a String?
- A **String** is a *group of characters*.
- In Java, `String` is a **non-primitive data type**.
- Internally, `String` is a **predefined class** from the `java.lang` package.

---

## 🧱 Ways to Create a String

### 1️⃣ Using String Literals
```java
String s = "Pradeep";
```
- Stored in **String Constant Pool (SCP)**
- Same value → same memory reference

### 2️⃣ Using `new` Keyword
```java
String s = new String("Pradeep");
```
- Stored in **Heap memory**
- Always creates a new object, even if value is same

---

## 🧠 Memory Management (Important)
- **Stack** → Local variables
- **Heap** → Objects
- **String Constant Pool (SCP)** → Special memory area inside Heap for string literals

Example:
```java
String s1 = "Pradeep";
String s2 = "Pradeep";
```
➡️ Both `s1` and `s2` point to the **same object** in SCP.

---

## 🔒 String Immutability
Strings in Java are **immutable**.

```java
String s = "Pradeep";
s = "Pradeep Sai Lakshman Guniganti";
```

- A **new String object** is created
- Old value remains in memory until **Garbage Collector** removes it

---

## ⚖️ `==` vs `equals()`

| Operator / Method | Purpose |
|------------------|---------|
| `==` | Compares memory reference |
| `equals()` | Compares content |

Example:
```java
System.out.println(s1 == s2);      // false
System.out.println(s1.equals(s2)); // true
```

👉 Always use `equals()` to compare string values.

---

## 🛠️ Commonly Used String Methods

- `length()`
- `charAt()`
- `equals()`
- `equalsIgnoreCase()`
- `contains()`
- `indexOf()`
- `lastIndexOf()`
- `startsWith()`
- `endsWith()`
- `toUpperCase()`
- `toLowerCase()`
- `trim()`
- `isEmpty()`
- `isBlank()`
- `concat()`
- `compareTo()`
- `replace()`
- `substring()`

---

## 🧪 Important Observations
- `trim()` removes leading and trailing spaces
- `isEmpty()` checks length == 0
- `isBlank()` checks only whitespace
- `compareTo()` compares lexicographically
- `substring()` extracts part of a string

---

## 🧠 Key Learnings
- Strings are immutable
- SCP improves memory efficiency
- `==` and `equals()` behave differently
- Strings are heavily used in interviews and real-world applications
- Understanding memory behavior is crucial for Java developers

---

## 💡 Interview Tips
✔ Know **String Constant Pool**  
✔ Explain **immutability clearly**  
✔ Always mention `equals()` vs `==`  
✔ Be comfortable with common String methods  

---

## 🚀 Conclusion
Strings may look simple, but they involve **deep memory concepts**.
Understanding how Java handles strings internally gives a strong foundation for **Core Java, interviews, and backend development**.
