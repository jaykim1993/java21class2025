package diExample4;

public class Ex04Main {

	public static void main(String[] args) {
		ShapeCalculator sc = new ShapeCalculator();
		
		sc.calulate(new Circle(4));
		sc.calulate(new Triangle(5,10));
		sc.calulate(new Rectangle(10,5));

	}

}
