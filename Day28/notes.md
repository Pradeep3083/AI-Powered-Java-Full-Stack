Day 28 notes:

Object Methods and Has A Relation

Object Class:
- By default Object is parent class of all classes in java
1. equals()

2. hashCode():
- unique value, hash value

3. toString():
- When we print an object in java it internally calls toString method.

4. finalise():
- Deprecated
- unreferenced variables or unused variables
finalise(){
	print("Garbage Collector invoked");
}
- but not guarenteed

5. wait()

6. notify()

7. notifyAll()

8. clone()


Object

Equals & Hashcode constract
- Two equal objects should always have a equal hashcode but two equal hashcodes need not be equal objects.

FLM , FLM - Same hasCode

1000, 1000
FLM   EDUTECH

Is A relationship - inheritance
Vehicle is a Car
Car extends Vehicle

Has A relationship
Vehicle has a engine
Ex:
Car{
	String colour;
	String brand;
	// Has A
	Engine engine
}

class Engine{
	int cc;
	int numOfPistons;
}

1. Composition
- Tightly coupled classes
- Car - Engine
- Car - Steering

2. Aggregation
- Loosely Coupled
- Car - Music Player




