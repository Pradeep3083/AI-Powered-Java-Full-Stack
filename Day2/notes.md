# 📘 Day 2 – Java Basic Features

## 1. Platform Independent
Java is a platform-independent language because it does not generate OS-specific executables.  
Instead, Java generates **bytecode (.class file)** after compilation.

- Java source code → compiled into bytecode  
- Bytecode runs on any OS using the JVM  
- JVM (Java Virtual Machine) converts bytecode to machine code  
- This enables **Write Once, Run Anywhere (WORA)**

---

## 2. Object-Oriented Programming (OOP)
Java is an object-oriented programming language where everything revolves around classes and objects.

### Key OOP Concepts:
- **Class** – Blueprint of an object  
- **Object** – Instance created from a class  
- **Inheritance** – Reusing features from one class to another  
- **Polymorphism** – One action, multiple behaviors  
- **Encapsulation** – Hiding details using access modifiers  
- **Abstraction** – Showing only necessary information  

### Benefits of OOP:
- Clean and structured code  
- Better code reuse  
- Easy maintenance  
- Real-world modeling  

---

## 3. Strictly Typed Language
Java is a **strongly and strictly typed** language.

- Every variable must have a defined type  
- Variables cannot change their type after declaration  
- Type errors are caught during compilation  
- Makes code more reliable and predictable  

### Example:
```java
int a = 10;
a = "Hello"; // ❌ Not allowed
```

---

## 4. Robust & Secure

### 🔹 Robust Features:
- Strong memory management  
- Automatic Garbage Collection  
- Exception handling with try-catch  
- Avoids memory corruption due to absence of pointers  

### 🔹 Secure Features:
- No pointers → safer memory access  
- Bytecode verification  
- JVM provides runtime security checks  
- Sandboxing mechanism for untrusted code  

---

## 5. Java Compilation & Execution Flow

### Step 1 → Writing Code
Create a Java source file:  
`Test.java`

### Step 2 → Compilation
Use Java compiler:
If compilation is successful, JVM generates:  
`Test.class` (bytecode)

### Step 3 → Execution
Run the program:



### During execution:
- JVM loads the bytecode  
- Converts bytecode into machine code  
- Executes the program line by line  

❗ If compilation fails → `.class` file is **not** created or updated.

---

## 6. Example Program (From Class)

```java
class Test {
    public static void main(String[] args) {

        System.out.println("Welcome to AI Powered JFS");
        System.out.println("By FLM");

        int a = 10;
        try {
            a = 11 / 0; // Causes ArithmeticException
        } catch(Exception e) {
            // Exception handled here
        }
        System.out.println(a);

        a = 11; // Updating value
        System.out.println(a);

        String b = "Pradeep";
        b = "FLM"; // Updating string value
        System.out.println(b);
    }
}
```
