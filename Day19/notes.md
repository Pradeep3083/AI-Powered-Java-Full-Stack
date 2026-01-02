# Day 19 – Arrays in Java (Part 3: Sorting & 2D Arrays)

## 📌 Overview
Day 19 focused on **sorting techniques** and **two-dimensional arrays (2D arrays)**.
This session helped understand how data can be **organized, processed, and represented in matrix form**, which is widely used in real-world and interview problems.

---

## 🔁 Recap: Arrays
- Arrays store **same data type elements**
- Arrays are **fixed in size**
- Stored in **heap memory**
- Fast access using index

---

## 🔃 Sorting an Array

### 🔹 What is Sorting?
Sorting means arranging elements in a specific order:
- **Ascending**
- **Descending**

Sorting improves:
✔ Searching efficiency  
✔ Readability of data  
✔ Problem-solving logic  

---

## 🔹 Bubble Sort (Basic Sorting Algorithm)

### How Bubble Sort Works
- Uses **nested loops**
- Compares **adjacent elements**
- Swaps if they are in wrong order
- After each pass, the **largest element moves to the end**

Example:
```
Input  → [10, 2, 12, 11, 8]
Output → [2, 8, 10, 11, 12]
```

### Characteristics
- Easy to understand
- Not efficient for large data
- Commonly asked for basics

**Time Complexity:** `O(n²)`  
**Space Complexity:** `O(1)`

---

## 🧮 2D Arrays in Java

### 🔹 What is a 2D Array?
A 2D array is an **array of arrays** used to store data in **rows and columns**.

Declaration:
```java
int[][] arr = new int[3][5];
```

This creates:
- 3 rows
- 5 columns in each row

---

## 🔹 Rectangular 2D Array
- All rows have the **same number of columns**
- Example:
```java
int[][] arr = new int[3][5];
```

Used when:
✔ Matrix size is fixed  
✔ Table-like data  

---

## 🔹 Jagged Array
- Rows can have **different column sizes**
- Created using:
```java
int[][] arr = new int[3][];
```

Example structure:
```
Row 0 → 2 columns
Row 1 → 4 columns
Row 2 → 3 columns
```

Used when:
✔ Data size varies per row  
✔ Memory optimization is needed  

---

## 🔁 Traversing a 2D Array

### ✔ Using Nested for Loop
```java
for(int i = 0; i < arr.length; i++) {
    for(int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}
```

### ✔ Using Enhanced for Loop
```java
for(int[] row : arr) {
    System.out.println(Arrays.toString(row));
}
```

---

## ⚠️ Important Points
- Accessing invalid index causes `ArrayIndexOutOfBoundsException`
- 2D arrays are stored as **array of 1D arrays**
- Jagged arrays are not rectangular

---

## 🧠 Key Learnings
✔ Sorting logic using Bubble Sort  
✔ Difference between 1D, 2D, and jagged arrays  
✔ Matrix traversal techniques  
✔ When to use rectangular vs jagged arrays  
✔ Importance of nested loops  

---

## 💡 Interview Tips
- Explain Bubble Sort with an example
- Mention time complexity clearly
- Be clear about **2D vs Jagged arrays**
- Always check array boundaries

---

## 🚀 Conclusion
Day 19 expanded array knowledge into **sorting and multi-dimensional data handling**.
These concepts are essential for **DSA, backend development, and technical interviews**.
