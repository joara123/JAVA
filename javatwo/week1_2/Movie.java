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
		System.out.println("영화제목: "+ title);
		System.out.println("영화평점: "+ score);
		System.out.println("영화감독: "+ name);
		System.out.println("발표된 연도: "+ year);
	}
}