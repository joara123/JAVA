package week9;

public class WrongPasswordException extends Exception{
	public WrongPasswordException(String me) {
		super(me);
	}
}
