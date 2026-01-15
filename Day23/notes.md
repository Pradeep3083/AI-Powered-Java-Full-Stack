
# Day 23 – Java OOPS (this, super & Polymorphism)

## 1. this Keyword
- Refers to the current class object
- Used to differentiate instance variables and local variables
- Commonly used inside constructors and instance methods
- Cannot be used inside static context

Example:
```java
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}
```

---

## 2. super Keyword
- Refers to the immediate parent class object
- Used only in inheritance
- Used to access parent variables, methods, and constructors
- Cannot be used inside static context

Example:
```java
class Parent {
    int a = 10;
}

class Child extends Parent {
    void show() {
        System.out.println(super.a);
    }
}
```

---

## 3. super() Constructor Call
- Calls parent class constructor
- Must be the first statement in child constructor
- Added implicitly by JVM if not written

Example:
```java
class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Child constructor");
    }
}
```

---

## 4. Polymorphism in Java
Polymorphism means one method with many forms.

Types:
1. Compile-Time Polymorphism
2. Run-Time Polymorphism

---

## 5. Compile-Time Polymorphism (Method Overloading)
- Same method name
- Different parameters
- Binding at compile time

Ways:
- Change number of parameters
- Change data type
- Change order of parameters

Example:
```java
class Calculator {
    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}
```

---

## 6. main() Method Overloading
- main method can be overloaded
- JVM executes only main(String[] args)

Example:
```java
class Test {
    public static void main(String[] args) {
        main(10);
    }

    static void main(int a) {
        System.out.println(a);
    }
}
```

---

## 7. Run-Time Polymorphism (Method Overriding)
- Same method name
- Same parameters
- Parent-child relationship required
- Binding at runtime

Example:
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

## 8. @Override Annotation
- Optional but recommended
- Ensures correct overriding

---

## 9. Interview Points
- this → current object
- super → parent object
- Overloading → compile time
- Overriding → runtime
- Static methods cannot be overridden
- main method cannot be overridden

---

## 10. Summary
- this and super improve readability
- Polymorphism improves flexibility

---

Day 23 Completed
