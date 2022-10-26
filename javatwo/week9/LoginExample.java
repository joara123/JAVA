package week9;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white", 12345);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		} 
		
		try {
			login("blue", 54321);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		} 
	}
	public static void login(String id, int password) throws NotExistIDException, WrongPasswordException {
		if(!id.equals("blue")) {
			throw new NotExistIDException("ID 잘못침");
		}
		
		if(password != 12345) {
			throw new WrongPasswordException("비번 잘못침");
		}
	}
}
