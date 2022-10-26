package week6;

public class TV implements RemoteControl{
	private int volume;
	public int getVolume() {
		return volume;
	}
	
	public void turnOn() {
		System.out.println("TV�� �մϴ�");
	}
	public void turnOff() {
		System.out.println("TV�� ���ϴ�");
	}
	public void setVolume(int volume) {
		this.volume = volume;
		if(volume > 0) {
			System.out.println("--- TV ������ "+volume+"���� �մϴ� ---");
		}
		else {
			System.out.println("--- TV ������ �������� �մϴ� ---");
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
		System.out.println("SmartPhone�� �մϴ�");
	}
	public void turnOff() {
		System.out.println("SmartPhone�� ���ϴ�");
	}
	public void setVolume(int volume) {
		this.volume = volume;
		if(volume > 0) {
			System.out.println("--- SmartPhone ������ "+volume+"���� �մϴ� ---");
		}
		else {
			System.out.println("--- SmartPhone ������ �������� �մϴ� ---");
			setMute(true);
		}
	}
}