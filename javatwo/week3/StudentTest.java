package week3;

public class StudentTest {
	public static void main(String[] args) {
		Student std = new Student();
		Student std1 = new Student("daniel", 80.3);
		
		System.out.println(">>��ü ���� ��<<");
		System.out.println(std);
		System.out.println(std1);
		
		System.out.println("\n>>anonymous�̸��� ���� ���� ��<<");
		std.setName("benny");
		std.setScore(100);
		System.out.println(std);
		
		System.out.println("\n>>daniel ���� ���� ��<<");
		std1.setScore(60.7);
		System.out.println(std1);
	}
}
