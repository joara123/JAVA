package week1_2;

public class CellPhone {
	String tellNum;
	Boolean power;
	
	public CellPhone(String tellNum) {
		this.tellNum = tellNum;
		this.power = true;
	}
	
	void powerToggle() {
		if(power == false) {
			power = true;
		}
		else {
			power = false;
		}
	}
	
	public String toString() {
		if(power == true) {
			return "폰 번호: "+tellNum+", 전원 상태: on";
		}
		else {
			return "폰 번호: "+tellNum+", 전원 상태: off";
		}
	}
}