package overloading;

public class RemoteControl {
	public static void main(String[] args) {
		TvRemote tv = new TvRemote();
		tv.turnOn();
		tv.increaseVolume();
		tv.increaseVolume(5);
		
		ACRemote ac = new ACRemote();
		ac.turnOn();
	}
}
