package week13;

//(1)	������ ���� �ڵ尡 ������ ���� �ʴ´ٸ� ������ �����ϱ��? ���ΰ� �ذ����� �Բ� �����ϼ��� 

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
