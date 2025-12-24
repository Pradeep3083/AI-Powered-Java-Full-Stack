# Day 14 – Prime Numbers in Java (Logic Building & Optimization)

## 📌 Overview
Day 14 focused on understanding **Prime Numbers** in Java and learning how to **optimize logic** by reducing unnecessary iterations.
This session emphasized **logical thinking, performance improvement, and clean coding**, which are essential for real-world and product-based company interviews.

---

## 🔢 What is a Prime Number?
A **prime number** is a number that is divisible **only by 1 and itself**.

### Examples
- 2 → Prime  
- 3 → Prime  
- 5 → Prime  
- 7 → Prime  
- 6 → Composite (1, 2, 3, 6)  
- 1 → **Neither prime nor composite**

---

## ❌ Common Mistake
- Considering `1` as a prime number  
✅ Correct rule: `1` is **neither prime nor composite**

---

## 🧠 Prime Number Logic (Different Approaches)

### 1️⃣ Brute Force Approach (1 to n)
- Count how many numbers divide `n`
- If count == 2 → Prime
- Works but **inefficient**

**Time Complexity:** `O(n)`

---

### 2️⃣ Optimized Approach (2 to n-1)
- Skip `1` (since it divides every number)
- Check divisibility from `2` to `n-1`
- If no number divides → Prime

**Time Complexity:** `O(n)`

---

### 3️⃣ Better Optimization (2 to n/2)
- A number cannot have factors greater than `n/2`
- Reduces iterations by half

**Time Complexity:** `O(n/2)`

---

### 4️⃣ Best Optimization (2 to √n)
- If `n` has a factor, at least one factor will be ≤ √n
- Stop loop immediately when a factor is found (`break`)
- **Most efficient & interview-recommended**

**Time Complexity:** `O(√n)`

---

## ⚙️ Why √n Works?
If:
```
n = a × b
```
Then one of `a` or `b` must be ≤ √n.
So, checking beyond √n is unnecessary.

---

## 🧩 Method-Based Prime Check
- Created reusable methods like:
```java
checkIsPrime(int number)
```
- Improves readability
- Encourages modular programming
- Supports clean code practices

---

## 📊 Performance Comparison
- Used `System.currentTimeMillis()` to measure execution time
- Observed massive performance improvement when using √n logic
- Reduced iterations by **more than 90%** for large inputs

---

## 🧪 Prime Numbers in a Range
Logic used:
- Loop from `2` to `n`
- Call `isPrime(i)` for each number
- Print all prime numbers in the given range

---

## 🧠 Key Learnings
- Logic matters more than syntax
- Fewer iterations = faster execution
- Optimization is critical for large inputs
- Prime number problems teach **time complexity**
- Debugging helps understand execution flow deeply

---

## 💡 Interview Notes
✔ Best approach: `2 → √n`  
✔ Always handle edge case: `1`  
✔ Use `break` to stop unnecessary checks  
✔ Know time complexity

---

## 🚀 Conclusion
Prime number programs are not just about output — they are about **thinking efficiently**.
This session strengthened problem-solving skills and laid the foundation for optimized coding practices.
