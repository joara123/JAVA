package week9;

class MyException extends Exception{
	public MyException(String message) {
		super(message);
	}
}

public class MyExceptionTest {
	public static void checkNegative(int number) throws MyException{ //던져지는 예외는 한개이상일 수도 있응께
		if (number < 0) {
			throw new MyException("음수는 안됩니다."); // 한 놈만 던질거니꽈
		}
		System.out.println("다행히 음수가 아니군요");

	}
	public static void main(String[] args) {
		try {
			checkNegative(1);
			checkNegative(-1);
		} catch (MyException ex) {
			ex.printStackTrace();	//예외내용 출력
		}
	}
}
