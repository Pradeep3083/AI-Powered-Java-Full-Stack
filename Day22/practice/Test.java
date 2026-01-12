package com;

public class Test {
	public static void main(String[] args) {
//		Parent p = new Parent();
//		System.out.println(p.a);
//		
//		p.m1();
//		
//		Child child = new Child();
//		System.out.println(child.b);
//		
//		child.m2();
//		child.m1();
//		
//		System.out.println(child.a);
//		System.out.println(child.b);
//		
//		System.out.println("-------");
//		System.out.println(child.a);
//		
//		child.m1();
		
		Car c = new Car();
		c.drive();
		c.start();
		
		EvCar ev = new EvCar();
		ev.start();
		ev.drive();
		ev.fuel();
		
	}
}
