package week1_2;

public class week02_app01 {
	public static void main(String[] args) {
		Shoes sh = new Shoes(255, 3, "����");
		System.out.println(sh.toString());
		System.out.println("���� �� ���� �Ⱦҽ��ϴ�");
		sh.sell(1);
		System.out.println("���� ������ ������ "+sh.getCnt()+" �Դϴ�");
		System.out.println("���� 2���� �߰��մϴ�");
		sh.add(2);
		System.out.println("���� ������ ������ "+sh.getCnt()+" �Դϴ�");
	}
}