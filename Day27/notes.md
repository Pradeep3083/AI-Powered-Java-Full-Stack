Day 27 notes

Multiple Inheritance & Object Class:

abstract class:
- normal methods
- we can write constructor

Interface:
- methods are by default public abstract
- variable = public static final

interface -> child -> implements
class -> child -> extends
interface - interface = extends

Diamond problem

Multiple Inheritance

Parent A - m1
Parent B - m1

Child C extends A,B

C c = new C();
c.m1();


interface A - m1()
interface B - m1()

Class Child implements A,B{
	void m1(){
	
	}
}

Child c = new Child();
c.m1();

public -> private -> protected -> default
- we can change the access modifier but with limitation in method overriding
- we can only increase visibility in overriding
- we cannot change the private 

Hybrid inheritance:
- Combination of inheritances
interface A
interface B extends A
interface C extends A

	A
B		C

Class D implements B,C

	A
B		C
	D

------

Object Class:
- By default Object is parent class of all classes in java
1. equals()
2. hashCode()
3. toString()
4. finalise()
5. wait()
6. notify()
7. notifyAll()
8. clone()



