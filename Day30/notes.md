Day 30 notes - Exceptional Handling

Child child = new Child();
- Parent class reference holding child class object

class Parent{
	int a = 10;
	void m1(){
	}
}

class Child extends Parent{
	int b = 20;
	@Override
	void m1(){
	}
	void m2(){
	}
}

Parent p = new Child();

p.a; // accessible
p.b; // not accessible


p.m1 - yes
p.m2 - no

Dynamic Method Dispatch

Spring Boot - we follow Interfaces pattern regularly - we go depth in next classes
at run time it will give object


========================================

Exceptional Handling:
Exceptions:
Compile Time Exceptions / Checked
- FileNotFoundException

Run Time Exceptions / Unchecked
- RunTimeException
- ArithmeticException

Exception / Error
Error - Hardware(OS, Virtual Machine)
Exception - Programming

Exception is the parent class of all Exceptions
Exception parent class is Throwable class which implements Serializable

Object
   |
Throwable
   |
Exception		- RunTimeException - ArithmeticException
   |
FileNotFoundException


Exceptional Handling:

try
- we will write exception prone code
catch
- Here we catch and handle the exception
- will be executed only if there is an exception in try block
 - 1 try block can have multiple catch blocks 
finally

throw
throws

try - no
catch - no
try - catch -> yes

Arithmetic Exception

catch(Exception e) {
	System.out.println(e);
}
catch(InputMismatchException e) {
	System.out.println("Enter only Numbers");
}
catch(ArithmeticException e) {
	System.out.println("Don't use zero");
}

This is error

in next session finally, throw, throws and custom exceptions



