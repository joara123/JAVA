package week4;

public class BookTest {
	public static void main(String[] args) {
		Magazine magazineA = new Magazine("잡지A", 10, "기자A", "2010년 2월 25일");
		Magazine magazineB = new Magazine("잡지B", 20, "기자B", "2010년 3월 8일");
		
		System.out.println(magazineA);
		System.out.println("\n-----bookA 객체 저자 변경 후-----");
		magazineA.setWriter("기자변경");
		System.out.println(magazineA+"\n");
		System.out.println(magazineB);
		System.out.println("\n-----bookB 객체 페이지 변경 후-----");
		magazineB.setPages(50);
		System.out.println(magazineB);
		System.out.println("\n-----bookB 객체 발매일 변경 후-----");
		magazineB.setData("2020년 8월 31일");
		System.out.println(magazineB);
	}
}
