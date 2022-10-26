package week6;

public class TV implements RemoteControl{
	private int volume;
	public int getVolume() {
		return volume;
	}
	
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}
	public void setVolume(int volume) {
		this.volume = volume;
		if(volume > 0) {
			System.out.println("--- TV 볼륨을 "+volume+"으로 합니다 ---");
		}
		else {
			System.out.println("--- TV 볼륨을 무음으로 합니다 ---");
			setMute(true);
		}
	}
}

class SmartPhone implements RemoteControl{
	private int volume;
	public int getVolume() {
		return volume;
	}
	
	public void turnOn() {
		System.out.println("SmartPhone를 켭니다");
	}
	public void turnOff() {
		System.out.println("SmartPhone를 끕니다");
	}
	public void setVolume(int volume) {
		this.volume = volume;
		if(volume > 0) {
			System.out.println("--- SmartPhone 볼륨을 "+volume+"으로 합니다 ---");
		}
		else {
			System.out.println("--- SmartPhone 볼륨을 무음으로 합니다 ---");
			setMute(true);
		}
	}
}