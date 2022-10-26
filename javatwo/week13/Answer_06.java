package week13;

class Container<T>{
	private T str;
	
	public void set(T str) {
		this.str = str;
	}
	public T get() {
		return str;
	}
}

public class Answer_06 {
	public static void main(String[] args) {
		Container<String> con1=new Container<>();
		con1.set("ȫ�浿");
		String str=con1.get();
		System.out.println(str);
		
		Container<Integer> con2=new Container<>();
		con2.set(6);
		Integer ig = con2.get();
		System.out.println(ig);
	}
}
