package overloading;

// Child class
public class TvRemote extends Remote{
	
	// Instance variable
	int volume = 0;
	
	// Method overriding
	@Override
	void turnOn() {
		System.out.println("Samsung tv turning on...");
	}
	
	// Method overloading
	void turnOn(int a) {
		System.out.println(a);
	}
	
	// static method hiding (not overriding)
	static void turnOff() {
		System.out.println("Samsung tv turned off...");
	}
	
	// Increase volume by 1
	void increaseVolume() {
		this.volume = this.volume+1;
		System.out.println("Volume : "+volume);
	}
	
	// Overload method
	void increaseVolume(int volume) {
		this.volume += volume;
		System.out.println("Volume : "+this.volume);
	}
}


