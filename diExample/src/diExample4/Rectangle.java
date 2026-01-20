package diExample4;

public class Rectangle implements ShapeInterface {
	double num1;
	double num2;
	
	Rectangle (double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	@Override
	public String calShape() {
		return "사각형의 면적 : " + (num1*num2);
	}

}
