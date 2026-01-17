package overloading;

// Child class
public class ACRemote extends Remote{
	
	// Method overriding
	@Override
	void turnOn() {
		System.out.println("LG Ac Turning on...");
	}
}
