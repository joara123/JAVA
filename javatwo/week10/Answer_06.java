package week10;

import java.util.*;

public class Answer_06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String[] str1= {"����", "������", "�ڹ�", "����", "�ҳ���", "�쵿", "����" };
		
		while(true) {
			boolean bl = true;
			
			System.out.println("�����ձ� ������ �����մϴ�~~~");

			String s = str1[(int)(Math.random()*str1.length)];
			
			System.out.print(s+"�� "+s.charAt(s.length()-1)+"�� �����ϴ� �ܾ� >> ");
			String str = in.next();
			
			if(s.charAt(s.length()-1) == str.charAt(0)) {
				while(true) {
					String stR = str;
					System.out.print(str+"�� "+str.charAt(str.length()-1)+"�� �����ϴ� �ܾ� >> ");
					str = in.next();
					
					if(stR.charAt(stR.length()-1) != str.charAt(0)) {
						System.out.println("Ʋ�Ƚ��ϴ�.");
						System.out.print("����ϰڽ��ϱ�? >> ");
						String a = in.next();
						
						if(a.equals("c") || a.equals("C")) {
							break;
						}
						else {
							System.out.println("������ �����մϴ�.");
							bl = false;
							break;
						}
					}
				}
			}
			else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
				System.out.print("����ϰڽ��ϱ�? >> ");
				String a = in.next();
				
				if(a.equals("c") || a.equals("C")) {
					continue;
				}
				else {
					System.out.println("������ �����մϴ�.");
					break;
				}
			}
			
			if(!bl) {
				break;
			}
		}
	}
}
