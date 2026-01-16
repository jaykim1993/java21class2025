package interfaceEx03;

public class Circle implements Shape {
	int radius;
	double pi;
	
	Circle(){
		radius = 10;
		pi = 3.14;
	}
	
	@Override
	public void draw() {
		System.out.printf("반지름이 %d인 원입니다.%n", radius);
	}

	@Override
	public double getArea() {
		return radius*radius*pi;
	}

}
