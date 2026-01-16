package interfaceEx03;

public class Main {

	public static void main(String[] args) {
		Shape circle = new Circle();
		circle.redraw();
		System.out.printf("면적은 %.1f", circle.getArea()); 
	}

}
