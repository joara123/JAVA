package week6;

public class Answer2 {
	public static void main(String[] args) {
		RemoteControl tv = new TV();
		tv.turnOn();
		tv.setVolume(10);
		System.out.println("���� TV ����: "+((TV) tv).getVolume());
		tv.setVolume(0);
		
		tv = new SmartPhone();
		tv.turnOn();
		tv.setVolume(50);
		System.out.println("���� SmartPhone ����: "+((SmartPhone) tv).getVolume());
		RemoteControl.changeBattery();
	}
}
