package week5;

public class Phone {
	private String maker;
	private int price;
	private int type;
	
	public String getMaker() {
		return maker;
	}
	public int getPrice() {
		return price;
	}
	public int getType() {
		return type;
	}
	
	public Phone() {
		
	}
	public Phone(String maker, int price, int type) {
		this.maker = maker;
		this.price = price;
		this.type = type;
	}
}

class SmartPhone extends Phone{
	private int memory;
	private boolean hasBluetooth;
	
	public int getMemory() {
		return memory;
	}
	
	public SmartPhone() {
		
	}
	public SmartPhone(String maker, int price, int type, int memory, boolean hasBluetooth) {
		super(maker, price, type);
		this.memory = memory;
		this.hasBluetooth = hasBluetooth;
	}
	
	public boolean isHasBluetooth() {
		return hasBluetooth;
	}
	
	public String toString() {
		return "maker="+getMaker()+"\nprice="+getPrice()+"\ntype="+getType();
	}
}
