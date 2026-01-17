package overloading;

public class RemoteControl {
	public static void main(String[] args) {
		
		// TvRemote object
		TvRemote tv = new TvRemote();
		tv.turnOn();
		tv.increaseVolume();
		tv.increaseVolume(5);
		tv.turnOff();
		
		// ACRemote object
		ACRemote ac = new ACRemote();
		ac.turnOn();
		
		// Parent object
		Remote remote = new Remote();
		remote.turnOn();
		remote.turnOff();
		
	}
}

