package week5;

public class PhoneTest {
	public static void main(String[] args) {
		SmartPhone[] p = { new SmartPhone(), new SmartPhone("hallym", 20, 5, 8, true) };
		for (SmartPhone obj : p) {
			System.out.println(obj);
			System.out.println("memory : " + obj.getMemory());
			System.out.println("Bluetooth : " + obj.isHasBluetooth());
			System.out.println();
		}
	}
}
