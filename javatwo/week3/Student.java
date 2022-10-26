package week3;

public class Student {
	private String name;
	private double score;
	private char grade;

	public Student() {
		this("anonymous", 0.0);
	}
	public Student(String name, double score) {
		this.name = name;
		this.score = score;
		grade = gradeMet();
	}
	
	public void setName(String name) { // 변경할때 set
		this.name = name;
	}
	public void setScore(double score) { // 데이터유효성 검사. 수치값 변경?
		if(score < 0) {
			return;
		}
		this.score = score;
		grade = gradeMet();
	}
	
	char gradeMet(){
		if(90 <= score && score <= 100) {
			return 'A';
		}
		else if(80 <= score && score < 90) {
			return 'B';
		}
		else if(70 <= score && score < 80) {
			return 'C';
		}
		else if(60 <= score && score < 80) {
			return 'D';
		}
		else {
			return 'F';
		}
	}
	
	@Override
	public String toString() {
		return "Student [name="+name+", score="+score+", grade= "+grade+"]";
	}
}
