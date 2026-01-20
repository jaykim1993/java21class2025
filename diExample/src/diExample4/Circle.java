package diExample4;

public class Circle implements ShapeInterface {
	double num1;
	double pi;
	
	Circle (double num1){
		this.num1 = num1;
	}
	@Override
	public String calShape() {
		pi = 3.14;
		return "원의 면적 : " + (num1*num1*pi);
	}

}
