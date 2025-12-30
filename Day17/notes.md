# Day 17 – Arrays in Java (Part 1: Introduction & Basics)

## 📌 Overview
Day 17 introduced **Arrays in Java**, one of the most fundamental concepts in programming.
Arrays help store **multiple values of the same data type** using a single variable, making programs more efficient and organized.

This session focused on **array basics**, creation, indexing, default values, and limitations.

---

## 🔢 What is an Array?
- An **array** is a **non-primitive data type**
- It stores a **collection of elements of the same data type**
- All elements are stored in **continuous memory locations**

Example:
```java
int[] marks = new int[5];
```

---

## ❓ Why Do We Need Arrays?
- A variable can store only **one value**
- To store multiple values (like marks, salaries, scores), arrays are required
- Reduces code duplication and improves readability

---

## 🧱 Characteristics of Arrays
✔ Non-primitive data type  
✔ Stores same data type elements only  
✔ **Fixed size** (size cannot be changed once created)  
✔ Index starts from **0**  
✔ Stored in **Heap memory**  

---

## 🛠️ How to Declare and Create an Array

### 1️⃣ Using `new` Keyword
```java
dataType[] arrayName = new dataType[size];
```

Example:
```java
int[] arr = new int[4];
```

- Size is mandatory
- JVM allocates memory for all elements

---

### 2️⃣ Using Array Initialization
```java
int[] arr = {99, 98, 100, 89, 35};
```

- JVM automatically decides the size
- Size = number of elements

---

## 🔢 Array Indexing
- Index always starts from **0**
- For an array of size `n`, valid indexes are `0` to `n-1`

Example:
```java
arr[0]  // first element
arr[n-1] // last element
```

---

## ⚙️ Default Values in Arrays
If elements are not initialized, Java assigns default values:

| Data Type | Default Value |
|----------|---------------|
| int | 0 |
| double | 0.0 |
| boolean | false |
| char | '\u0000' |
| String / Object | null |

---

## 🔁 Traversing an Array
- Arrays are usually accessed using loops
- `for` loop is commonly used

Example:
```java
for(int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

---

## ⚠️ Important Points
- Accessing index beyond size causes **ArrayIndexOutOfBoundsException**
- Array size **cannot be increased or decreased**
- To overcome limitations, **ArrayList** is used (covered later)

---

## 🧠 Key Learnings
✔ Arrays store multiple values efficiently  
✔ Indexing starts from zero  
✔ Default values are assigned automatically  
✔ Arrays have fixed size  
✔ Runtime errors occur if index exceeds size  

---

## 💡 Interview Tips
- Clearly explain why arrays are needed
- Always mention **fixed size limitation**
- Know default values of arrays
- Be careful with array indexing

---

## 🚀 Conclusion
Arrays form the backbone of data handling in Java.
Understanding array basics is essential before moving to advanced data structures like **ArrayList, Collections, and Streams**.
