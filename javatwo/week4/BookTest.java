package week4;

public class BookTest {
	public static void main(String[] args) {
		Magazine magazineA = new Magazine("����A", 10, "����A", "2010�� 2�� 25��");
		Magazine magazineB = new Magazine("����B", 20, "����B", "2010�� 3�� 8��");
		
		System.out.println(magazineA);
		System.out.println("\n-----bookA ��ü ���� ���� ��-----");
		magazineA.setWriter("���ں���");
		System.out.println(magazineA+"\n");
		System.out.println(magazineB);
		System.out.println("\n-----bookB ��ü ������ ���� ��-----");
		magazineB.setPages(50);
		System.out.println(magazineB);
		System.out.println("\n-----bookB ��ü �߸��� ���� ��-----");
		magazineB.setData("2020�� 8�� 31��");
		System.out.println(magazineB);
	}
}
