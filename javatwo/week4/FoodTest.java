package week4;

public class FoodTest {
	public static void main(String[] args) {
		Melon m1 = new Melon(2500, 21, "Hallym_farm");
		Melon m2 = new Melon(2000, 10, "Software_farm");
		
		System.out.println("m1 "+m1);
		System.out.println("m2 "+m2);
		
		System.out.println("\n>>m2 ��ü�� cost�� ���۳�� ���� ���� ��");
		m2.setCost(3000);
		m2.setInfo("Java_farm");
		System.out.println(m2);
		
		System.out.println("m1 �߷� >> "+m1.getKg());
		System.out.println("���α׷� ����");
	}
}
