package week3;

public class Distance {
	private String name;
	private int dist;
	
	public Distance(String name, int dist) {
		this.name = name;
		this.dist = dist;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDist() {
		return dist;
	}
	public void setDist(int dist) {
		this.dist = dist;
	}
	
	public String toString() {
		return "Distance [�̸�="+name+", ���аŸ�="+dist+"]";
	}
}
