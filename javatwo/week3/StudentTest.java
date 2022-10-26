package week3;

public class StudentTest {
	public static void main(String[] args) {
		Student std = new Student();
		Student std1 = new Student("daniel", 80.3);
		
		System.out.println(">>객체 생성 후<<");
		System.out.println(std);
		System.out.println(std1);
		
		System.out.println("\n>>anonymous이름과 성적 설정 후<<");
		std.setName("benny");
		std.setScore(100);
		System.out.println(std);
		
		System.out.println("\n>>daniel 성적 변경 후<<");
		std1.setScore(60.7);
		System.out.println(std1);
	}
}
