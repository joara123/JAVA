package week14;

import java.util.*;

public class Answer_08 {
	public static void main(String[] args) {
		String[] s = { "���", "��", "�ٳ���" };
		ArrayList list = new ArrayList(Arrays.asList(s));
		
		list.add("����");
		list.add(2, "�ڸ�");
		System.out.println("-----����Ʈ ���-----");
		for(int i = 0 ; i < list.size() ; i++) {
			String str = (String) list.get(i);
			System.out.println(str);
		}
		System.out.println("----------");
		String s1 = (String) list.get(3);
		System.out.println("�ε��� 3: "+s1);
		list.set(2, "�޷�");
		list.add("��");
		System.out.println("�谡 ����� ��ġ: "+list.indexOf("��"));
		list.remove("�ٳ���");
		System.out.println("-----����Ʈ ���-----");
		for(int i = 0 ; i < list.size() ; i++) {
			String str = (String) list.get(i);
			System.out.println(str);
		}
	}
}
