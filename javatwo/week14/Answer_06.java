package week14;

import java.util.*;

class Student{
	private String name; //학생이름
	private String num; //전화번호
	
	public Student(String name, String num) {
		this.name = name;
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public String getNum() {
		return num;
	}
	
	public String toString() {
		return "name: "+getName()+", num: "+getNum();
	}
}

public class Answer_06 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
			
		for(int i = 0 ; i < 10 ; i++){
			list.add(new Student("name"+i, "phone"+i));
		}
		for(Student s : list)
			System.out.println(s);

		System.out.println("---전화번호 검색---");
		System.out.print("사용자 이름 입력: ");
		String name = sc.next();
		for(int i = 0 ; i < list.size() ; i++) {
			if(list.get(i).getName().equals(name)) {
				System.out.println(name+"의 번호: "+list.get(i).getNum());
			}
		}
		
		System.out.println("---삭제---");
		System.out.print("사용자 이름 입력: ");
		name = sc.next();
		for(int i = 0 ; i < list.size() ; i++) {
			if(list.get(i).getName().equals(name)) {
				list.remove(i);
			}
		}
		
		for(Student s : list)
			System.out.println(s);
		
	}
}

