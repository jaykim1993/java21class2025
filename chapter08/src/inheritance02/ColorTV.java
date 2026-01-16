package inheritance02;

public class ColorTV extends TV {
	protected int color;
	
	public ColorTV() {}
	public ColorTV(int size, int color) {
		super.size = size;
		this.color = color;
	}
	
	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public void printProperty() {
		System.out.printf("%d인치 %d컬러", super.size, this.color);
		System.out.println();
		System.out.println();
	}
}
