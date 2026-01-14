package overloading;

public class TvRemote extends Remote{
	int volume = 0;
	
	@Override
	void turnOn() {
		System.out.println("Samsung tv turning on...");
	}
	
	void increaseVolume() {
		this.volume = this.volume+1;
		System.out.println("Volume : "+volume);
	}
	
	void increaseVolume(int volume) {
		this.volume += volume;
		System.out.println("Volume : "+this.volume);
	}
}
