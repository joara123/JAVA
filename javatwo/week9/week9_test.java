package week9;

class ArrayIndexOutOfBoundsExceptionExample{
	public static void c1() {
		int[] array = new int[2];
	}
}

public class week9_test {
	public static void throwit() throws RuntimeException {
        System.out.print("A ");
        throw new RuntimeException();
    }

	public static void main(String[] args) {
		//int[] array = new int[2];
		
//		try {
//			array[0] = 1;
//			array[1] = 2;
//			array[2] = 3;
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("�迭�� �ε����� Ȯ���ؼ� ����ϼ���");
//		}
		
//		try {
//		    int n = Integer.parseInt("abc");
//		    System.out.println("try");
//		}
//		catch (NumberFormatException e){ 
//			System.out.println("���� ���� ����");  
//		}          
//		finally {    
//			System.out.println("finally");     
//		}
		
//		try {
//		     int[] array=new int[-10];
//		     System.out.println("try");
//		}
//		catch (NumberFormatException e){ 
//		     System.out.println("���� ���� ����");  
//		}
//		catch (NegativeArraySizeException e){ 
//		     System.out.println("�迭 ũ�� ���� ����");  
//		}          
//		catch (Exception e){ 
//		     System.out.println("����");  
//		}   
		
//		try  {
//            System.out.print("B ");
//            throwit();
//        }
//        catch (Exception re ) {
//            System.out.print("C ");
//        }
//        finally  {
//            System.out.print("D ");
//        }
//        System.out.println("E ");
		
//        try  {
//            someMethod();  
//            System.out.print("A"); 
//        }  
//        catch (Exception ex)  {
//            System.out.print("B"); 
//        }  
//        finally  {
//            System.out.print("C"); 
//        }  
//        System.out.print("D"); 
		
//		try  {
//            System.out.print("Hello world ");
//        }
//        finally  {
//            System.out.println("Finally executing ");
//        }
		
		//Object o = new Object();
		//Integer i = (Integer)o;
		
		//sub();
		
		try  { 
		    int x = 0; 
		    int y = 5 / x; 
		} 
		catch (ArithmeticException e)  {
		    System.out.println("Exception"); 
		} 
		catch (Exception ae)  {
		    System.out.println(" Arithmetic Exception"); 
		} 
		System.out.println("finished");

	}
	
	
	public static void sub() {
        int[] array = new int[10];
        try {
        	met(array);
        }
        catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println("�迭 �ε��� ���� �ʰ�");
        }
	}
	
	public static void met(int[] array) throws ArrayIndexOutOfBoundsException{
		int i = array[10];
	}

	public static void someMethod() { } 
}
