
# Day 22 – Java OOPS (Default Values & Inheritance)

## 1. Default Values in Java
Java provides default values only for **instance** and **static** variables.

### Instance Variables
- Automatically assigned default values by JVM
- Stored in Heap memory

### Static Variables
- Automatically assigned default values by JVM
- Stored in Method Area

### Local Variables
- ❌ Do NOT get default values
- Must be initialized before use
- Otherwise, causes **compile-time error**

**Example:**
```java
int x;
System.out.println(x); // Compile-time error
```

---

## 2. OOPS Principles in Java
Java follows four major OOPS principles:
1. Inheritance
2. Polymorphism
3. Encapsulation
4. Abstraction

---

## 3. Inheritance in Java
Inheritance represents a **parent–child relationship** where a child class inherits properties and methods of a parent class.

**Keyword Used:** `extends`

**Advantages:**
- Code reusability
- Reduced redundancy
- Better maintainability

---

## 4. Types of Inheritance

### 1. Single Inheritance
One parent class → One child class

```java
class Animal {
    void eat() {}
}

class Dog extends Animal {
    void bark() {}
}
```

---

### 2. Multi-Level Inheritance
Inheritance through multiple levels

```java
class Animal {
    void eat() {}
}

class Dog extends Animal {
    void bark() {}
}

class Puppy extends Dog {
    void play() {}
}
```

---

### 3. Hierarchical Inheritance
One parent class → Multiple child classes

```java
class Animal {
    void eat() {}
}

class Dog extends Animal {
    void bark() {}
}

class Cat extends Animal {
    void meow() {}
}
```

---

### 4. Multiple Inheritance (Not Supported with Classes)
- Java does NOT support multiple inheritance using classes
- Reason: **Ambiguity / Diamond Problem**

```java
// NOT allowed in Java
class Child extends Parent1, Parent2 {}
```

---

### 5. Hybrid Inheritance
- Combination of inheritance types
- ❌ Not supported using classes in Java

---

## 5. Key Interview Points
- Instance & static variables get default values
- Local variables must be initialized manually
- Java avoids multiple inheritance to prevent ambiguity
- Child class can access parent class members
- Parent class cannot access child class members

---

## 6. Practice Task
- Create an `Animal` class
- Implement:
  - Single Inheritance
  - Multi-Level Inheritance
  - Hierarchical Inheritance
- Use instance variables, static variables, and methods
- Access parent class members using child objects

---

## 7. Summary
- Default values are JVM-managed for instance & static variables
- Inheritance is a core OOPS principle
- Java supports inheritance using `extends`
- Understanding inheritance is critical for interviews

---

**Day 22 Completed ✅**
