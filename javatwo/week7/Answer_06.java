package week7;

import java.util.*;

class NestStudent{
	private String name;
	private Subject sub;
	
	public NestStudent(String name, int cnt) {
		this.name = name;
		Subject sub = new Subject(cnt);
	}
	void stdPrint() {
		System.out.println(name+"�л��� ��������");
		sub.subjectprint();
	}
	
	class Subject{
		Scanner in = new Scanner(System.in);
		
		String[] subN;
		
		public Subject(int num) {
			System.out.println(name+"==>");
			
			subN = new String[num];
			for(int i = 0 ; i < num ; i++) {
				System.out.print("��������("+(i+1)+"):");
				subN[i] = in.next();
			}
		}
		public void subjectprint() {
			for(String obj : subN){
				System.out.println(obj);
			}
		}
	}
}

public class Answer_06 {
	public static void main(String[] args) {
		NestStudent obj[] = { new NestStudent("ȫ�浿", 2), new NestStudent("�Ӳ���", 3),
				new NestStudent("��û��", 1) };
						for (NestStudent ns : obj)
							ns.stdPrint();
	}
}
