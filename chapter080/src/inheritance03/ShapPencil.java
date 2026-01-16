package inheritance03;

public class ShapPencil {
	protected int residual;
	protected int thickness;
	protected String name;
	
	public ShapPencil() {
		
	}
	public ShapPencil(String name, int residual, int thickness) {
		this.name = name;
		this.residual = residual;
		this.thickness = thickness;
	}

	public int getResidual() {
		return residual;
	}

	public void setResidual(int residual) {
		this.residual = residual;
	}

	public int getThickness() {
		return thickness;
	}

	public void setThickness(int thickness) {
		this.thickness = thickness;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.printf("%s: 잔여량:%d, 펜굵기:%d%n", name, residual, thickness);
	}
	
}
