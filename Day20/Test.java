package com;

public class Test {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.color = "White";
		myCar.model = "Dzire";
		myCar.company = "Maruti Suzuki";
		myCar.price = 1000000;
		myCar.gear = 0;
		
		System.out.println(myCar.model);
		
		Car friendCar = new Car();
		
		friendCar.color = "Black";
		friendCar.model = "Fortuner";
		friendCar.company = "Toyato";
		friendCar.price = 5000000;
		friendCar.gear = 0;

		System.out.println(friendCar.color);
		System.out.println(myCar.color);
		System.out.println(friendCar.price);
		
		myCar.start();
		friendCar.start();
		
		myCar.gearUp();
		System.out.println(myCar.gear);
		
		myCar.gearUp();
		System.out.println(myCar.gear);
		
		Car car1 = new Car();
		Car car2 = new Car("Blue");	
		System.out.println(car1.color);
		System.out.println(car2.color);
		
	}
}
