package week13;

class MyMath<T>{
	public double getAverage(T[] data) {
		double sum = 0.0;
		for(int i = 0 ; i < data.length ; i++) {
			double d = ((Number) data[i]).doubleValue();
			sum += d;
		}
		return sum/data.length;
	}
}

public class Answer_05 {
	public static void main(String[] args) {
		Integer[] list = { 32,5,36,8,41,74,59,9, 11 };
		Byte[] blist = {4,12,7,84,23,4};
		
		MyMath<Integer> m = new MyMath<Integer>();
		MyMath<Byte> bm = new MyMath<>();
		System.out.printf("%.2f\n",m.getAverage(list));
		System.out.printf("%.2f\n", bm.getAverage(blist));
	}
}
