
# Day 25 – Java OOPS (Access Modifiers & Encapsulation)

## 1. Method Overloading – Final Rules Recap
- Same method name
- Change:
  - Number of parameters
  - Data type of parameters
  - Order of parameters
- Method name cannot be changed
- Return type can be changed
- Static methods can be overloaded

---

## 2. Method Overriding – Key Rules
- Happens at runtime (Dynamic / Late Binding)
- Requires parent-child relationship
- Same method name and same parameters
- @Override annotation is not mandatory but recommended
- Parameters cannot be changed
- Return type cannot be changed
- Static methods cannot be overridden
- Static methods lead to method hiding

---

## 3. this and super Keywords
- this:
  - Refers to current class object
  - Used to access current class variables
  - Used for constructor chaining using this()

- super:
  - Refers to parent class object
  - Used to access parent variables and methods
  - Used to call parent constructor using super()

Important Rule:
- this() and super() cannot be used together in the same constructor

---

## 4. Access Modifiers in Java
Java provides four access modifiers to control visibility.

### public
- Accessible from anywhere in the project

### private
- Accessible only within the same class
- Used for data hiding

### protected
- Accessible within the same package
- Accessible in different package through inheritance

### default (no keyword)
- Accessible only within the same package

Notes:
- Classes can be public or default only
- Only one public class is allowed per file

---

## 5. Encapsulation in Java
Encapsulation is the process of:
- Wrapping data and methods into a single unit
- Restricting direct access to data

### How Encapsulation is Achieved
- Declare variables as private
- Provide public getter and setter methods

### Advantages of Encapsulation
- Data security
- Controlled access
- Better maintainability
- Real-world application design

---

## 6. Example of Encapsulation
```java
class BankAccount {
    private double balance;

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public double getBalance() {
        return balance;
    }
}
```

---

## 7. Key Interview Points
- Encapsulation = Data hiding + controlled access
- private variables cannot be accessed directly
- Getter and Setter methods are used to access private data
- Access modifiers control visibility
- Encapsulation improves security and maintainability

---

## 8. Summary
- Access modifiers define scope of variables and methods
- Encapsulation protects internal data
- this and super help manage object relationships
- These concepts are widely used in real-world Java applications

---

**Day 25 Completed ✅**
