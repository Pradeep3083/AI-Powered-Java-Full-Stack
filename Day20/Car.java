package com;

public class Car {
	
	String color;
	
	String model;
	
	String company;
	
	int gear;
	
	int speed;
	
	double price;
	
	Car(){
		System.out.println("Default Constructor");
	}
	
	Car(String carColor){
		color = carColor;
	}
	
	void start() {
		System.out.println("Starting "+model+" car....");
	}
	
	void stop() {
		System.out.println("Stopping car....");
	}
	
	void gearUp() {
		if(gear<=4) {
			gear++;
			System.out.println("Gear "+gear);
			accelerate();
		}else {
			System.out.println("Cannot go beyond 5th gear...");
		}
	}
	
	void gearDown() {
		gear--;
		System.out.println("Gear "+gear);
	}
	
	void accelerate() {
		speed += 20;
		System.out.println("Current speed "+speed);
	}	
}
