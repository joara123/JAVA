package week9;

public class SearchArray {
	public static void searchArray(int[] num, int a) throws NotFoundException {
		boolean tf = false;
		
		for(int i = 0 ; i < num.length ; i++) {
			if(num[i] == a) {
				System.out.println(i);
				tf = true;
				break;
			}
		}
		
		if(!tf) {
			throw new NotFoundException("�迭���� ã�� �� �����ϴ�.");
		}
	}
	public static void main(String[] args) {
		int[] a1 = {1, 2, 3, 4, 5};
		
		try {
			searchArray(a1, 3);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
		try {
			searchArray(a1, 6);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}
}
