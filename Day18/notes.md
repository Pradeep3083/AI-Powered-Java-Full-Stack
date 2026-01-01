# Day 18 – Arrays in Java (Part 2: Logic Building & Problem Solving)

## 📌 Overview
Day 18 focused on **applying logic on arrays** rather than just understanding theory.
We solved **interview-oriented problems** using arrays and understood how arrays work internally in memory.

This session strengthened **problem-solving skills**, **loop control**, and **optimization techniques**.

---

## 🔁 Recap: Array Properties
- Arrays store **same data type elements**
- Arrays have **fixed size**
- Stored in **heap memory**
- Elements are stored in **contiguous memory locations**
- Faster for **read operations** due to direct index access

---

## 🧠 Memory Address Concept (Important)
If an array starts at a base address:

Example:
- `int` array starting address = `100`
- Size of `int` = `4 bytes`

Then:
```
arr[0] → 100
arr[1] → 104
arr[2] → 108
```

Formula:
```
address = base + (index × size_of_data_type)
```

---

## 🔍 Problem 1: Largest and Smallest Element in an Array

### Problem Statement
Find the **largest** and **smallest** number in a given array.

Example:
```
Input  → [13, 5, 17, 8, 23, 15]
Output → Largest = 23, Smallest = 5
```

### Logic Used
- Assume first element as both `max` and `min`
- Traverse the array once
- Compare and update values

### Key Learning
- Efficient solution using **single loop**
- No extra variables required

---

## 🔄 Problem 2: Reverse an Array

### Example
```
Input  → [10, 25, 16, 17, 20]
Output → [20, 17, 16, 25, 10]
```

---

### 🔹 Approach 1: Using Extra Array
- Traverse original array from end
- Store values in a new array
- Easy to understand but uses extra memory

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(n)`

---

### 🔹 Approach 2: In-Place Reversal (Optimized)
- Use **two-pointer technique**
- Swap elements from start and end
- No extra array required

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`

---

## 🔁 Enhanced For Loop (for-each)
- Used for reading array elements
- Cleaner and readable syntax
- Index is not accessible

Example:
```java
for(int num : arr) {
    System.out.print(num + " ");
}
```

---

## ⚠️ Common Mistakes
- Using wrong comparison while finding minimum
- Accessing index beyond array size
- Forgetting arrays are fixed size
- Confusing enhanced for loop with indexed loop

---

## 🧠 Key Learnings
✔ Applied logic on arrays  
✔ Difference between simple & optimized solutions  
✔ Two-pointer technique  
✔ Importance of time & space complexity  
✔ Confidence in array-based interview questions  

---

## 💡 Interview Tips
- Always start with **basic approach**, then optimize
- Explain time & space complexity
- Use in-place logic when possible
- Be careful with array boundaries

---

## 🚀 Conclusion
Day 18 moved from **array basics to real problem-solving**.
Understanding array logic is essential before learning **searching, sorting, and data structures**.

Arrays are the foundation for mastering **DSA and backend development**.
