# 📘 Day 4 – Structure of a Java Program & Packages

## 1. Eclipse IDE – Java Development Workspace
Eclipse is the IDE used to develop Java applications.  
It provides:
- Project and folder organization
- Syntax highlighting
- Auto error detection
- Easy execution of programs

Eclipse helps developers write, manage, and run Java code efficiently.

---

## 2. Java Project Structure
A typical Java project contains:

### 📁 src (Source Folder)
- Stores all `.java` source files
- This is where we write our classes and code

### 📦 JRE System Library
- Contains default Java class libraries
- Provides the environment required to run Java programs

All Java code must be written inside **classes**, and classes should be placed inside **packages**.



---

## 3. What is a Class?
A class is the **blueprint or template** for objects in Java.

**Example:**
```java
public class Test {
    // Class body
}
```
Everything in Java (variables, methods) must exist inside a class.

---

## 4. Main Method - Entry Point of Java Program
Although a Java file can compile without a main method, it will not run without one.

### ➡️ JVM always looks for the main method to start execution.
**Correct main method syntax:**
```java
public static void main(String[] args){
    // Execution starts here
}
```

---

## 5. Packages in Java
Packages are used to organize Java classes logically.

**Example declaration:**
```java
package com.pradeep;
```
📌 Why do we use packages?
- Better project structure
- Easier to maintain
- Avoid name conflicts
- Helps import classes from other packages

❗ Why default package is NOT recommended?
- Cannot import classes from default package into named packages
- Not supported by many frameworks (Spring, Maven, Tomcat)
- Makes project unorganized
- Not scalable for large applications
- Breaks Java industry standards

---

## 6. Importing Classes
If classes are in different packages, they must be imported.
**Example:**
```java
import com.test2;    // imports a specific class
import com.pradeep.*;  // imports all classes in the package
```
Note: only public classes can be accessed from other packages.

---

## 7. Variables & Methods in a Class
Variables
- Used to store data
- Can be instance or static
Methods
- Used to define reusable logic
- Must be written inside a class

**Example Structure:**
```java
package packagename;

import com.Test2;
import com.pradeep.*;

public class Test{

    // Variables
    int a = 10;
    int b = 20;

    // Main Method
    public static void main(String[] args) {
        sum(); // Calling a method
    }

    // user-defined method
    public static void sum() {
        // Logic goes here
    }
}
```

---

## 📌 Summary of Day 4
- ✅ Understand the complete structure of a Java program
- ✅ Learned about `src` folder & JRE System Library
- ✅ Understood classes, methods, and variables
- ✅ Learned importance of the main method
- ✅ Understood package creation and imports
- ✅ Learned why default package should be avoided
- ✅ Explored how Eclipse IDE organizes Java projects
