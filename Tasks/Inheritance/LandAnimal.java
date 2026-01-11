package com.task;

public class LandAnimal extends Animal{
	int numberOfLegs = 4;
	
	static boolean canRun = true;
	
	void walk() {
		System.out.println("Land animal walks on land...");
	}
	
	static void liveOnLand() {
		System.out.println("Land animals live on land...");
	}
	
}
