package week6;

public class Answer3 {
	public static void main(String[] args) {
		IGraphics[] arrayOfShapes = {
				new Rectangle(12.3, 3.4),
				new Rectangle(20.3, 5.6),
				new Circle(12.3)
		};
		
		for(int i = 0 ; i < arrayOfShapes.length ; i++) {
			arrayOfShapes[i].draw();
			System.out.println(arrayOfShapes[i].toString());
			System.out.println("ตัทน: "+arrayOfShapes[i].perimeter()+"\n");
		}
	}
}
