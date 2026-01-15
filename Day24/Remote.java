package overloading;

// Parent Class
public class Remote {
	
	// Instance Method (can be overriden)
	void turnOn() {
		System.out.println("Turning on...");
	}
	
	// Static method (cannot be overriden)
	static void turnOff() {
		System.out.println("Turning off...");
	}
	
}
