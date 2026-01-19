
# Day 24 – Java OOPS (Polymorphism Deep Dive)

## 1. Inheritance – IS-A Relationship
- Inheritance represents an **IS-A relationship**
- Parent class is also called:
  - Super class
  - Base class
- Child class is also called:
  - Sub class
  - Derived class
- Inheritance is required to achieve **runtime polymorphism**

---

## 2. Polymorphism in Java
Polymorphism means **one method with many behaviors**.

Java supports two types of polymorphism:
1. Compile-Time Polymorphism (Method Overloading)
2. Run-Time Polymorphism (Method Overriding)

---

## 3. Compile-Time Polymorphism  
(Overloading / Static / Early Binding)

### Rules:
- Same method name
- Change in parameters only
- Method name cannot be changed
- Return type **can be changed**
- Static methods **can be overloaded**
- main method **can be overloaded**
- Method binding happens at **compile time**

### Ways to Overload:
- Change number of parameters
- Change data type of parameters
- Change order of parameters

### Example:
```java
class Calculator {

    void sum() {}

    void sum(int a) {}

    int sum(int a, int b) {
        return a + b;
    }
}
```

---

## 4. Run-Time Polymorphism  
(Overriding / Dynamic / Late Binding)

### Rules:
- Requires parent-child relationship
- Same method name
- Same parameters
- Method implementation changes in child class
- Method call decided at **runtime**

### @Override Annotation:
- Optional
- Recommended
- Helps compiler detect mistakes

### Example:
```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barking");
    }
}
```

```java
class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
```

---

## 5. Static Methods and Polymorphism
- Static methods **cannot be overridden**
- Static methods belong to class, not object
- If child defines same static method → **Method Hiding**
- @Override annotation is **not allowed** for static methods

---

## 6. main() Method Rules
- main method **can be overloaded**
- main method **cannot be overridden**
- JVM always calls:
```java
public static void main(String[] args)
```

---

## 7. Key Interview Points
- Overloading → Compile time
- Overriding → Runtime
- Static methods → No overriding
- Binding time differs for overloading and overriding
- Polymorphism improves code reusability

---

## 8. Summary
- Polymorphism allows flexible and scalable code
- Compile-time polymorphism depends on method signature
- Runtime polymorphism depends on inheritance and overriding
- Understanding binding is crucial for interviews

---

**Day 24 Completed ✅**
