package inheritance03;

public class BallPen extends ShapPencil {
	protected String color;
	
	public BallPen() {}
	public BallPen(String name, int residual, int thickness, String color) {
		super.name = name;
		super.residual = residual;
		super.thickness = thickness;
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public void print() {
		System.out.printf("%s: 잔여량:%d, 펜굵기:%d, 색상:%s%n", super.name, super.residual, super.thickness, this.color);
	}
}
