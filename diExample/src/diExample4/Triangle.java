package diExample4;

public class Triangle implements ShapeInterface {
	double num1;
	double num2;
	
	Triangle (double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	@Override
	public String calShape() {
		return "삼각형의 면적 : " + (num1*num2/2);
	}

}
