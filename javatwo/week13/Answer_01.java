package week13;

//(1)	다음과 같은 코드가 컴파일 되지 않는다면 원인은 무엇일까요? 원인과 해결방법을 함께 제시하세요 

final class MyAlgorithm{
	public static <T extends Comparable> T max(T x, T y) {
		if(x.compareTo(y) == 1)
			return x;
		else
			return y;
	}
}

public class Answer_01 {
	public static void main(String[] args) {
		System.out.println(MyAlgorithm.max(34, 20));
	}
}
