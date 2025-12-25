Day 15 Notes:

Strings:

Group of Characters

2 ways
1. Literals
	String s = "Pradeep";

2. Object
	Classname Objname  new classname();

	String s = new String("Pradeep");


MM -> Methods -> Static, Metadata
	

All Objects are stored in Heap.

In Heap
String Constant Pool in Java

String s = "Pradeep"; // this will be stored in String Constant Pool which is in special 



String Constant Pool:

s1 = "Pradeep";
s2 = "Pradeep";
s3 = "Pradeep";
These 3 refers to only one Pradeep

s4 = "Pradeep Sai";

s3 = "PradeepSai";// It will allocate new string

s2 = "G Pradeep";

s1 = "G Pradeep Sai";


String s1 = "Pradeep";
		String s2 = "Pradeep Sai";
		
		System.out.println(s1);
		System.out.println(s2);
		s1 = "Pradeep Sai";
		System.out.println(s1); // Here it will create a new one and where "Pradeep" will be in the background only
		// After the GC will collect it.
		

String is immutable class in java

next notes soon...

















