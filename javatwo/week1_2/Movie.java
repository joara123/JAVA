package week1_2;

public class Movie {
	String title;
	double score;
	String name;
	int year;
	
	public Movie(String title, double score, String name, int year) {
		this.title = title;
		this.score = score;
		this.name = name;
		this.year = year;
	}
	
	void print() {
		System.out.println("��ȭ����: "+ title);
		System.out.println("��ȭ����: "+ score);
		System.out.println("��ȭ����: "+ name);
		System.out.println("��ǥ�� ����: "+ year);
	}
}