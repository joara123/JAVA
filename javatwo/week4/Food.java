package week4;

public class Food {
	private int cal, cost, kg;

	public int getCal() {
		return cal;
	}
	public void setCal(int cal) {
		this.cal = cal;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getKg() {
		return kg;
	}
	public void setKg(int kg) {
		this.kg = kg;
	}
	
	public Food(int cost, int kg) {
		this.cost = cost;
		this.kg = kg;
	}
}

class Melon extends Food{
	private String info;

	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	public Melon(int cost, int kg, String info) {
		super(cost, kg);
		this.info = info;
	}
	
	public String toString() {
		return "°´Ã¼Á¤º¸[ cost="+getCost()+"	kg="+getKg()+"	°æÀÛ³ó¿ø="+getInfo()+" ]";
	}
}