package inheritance03;

public class Main {

	public static void main(String[] args) {
		ShapPencil sp = new ShapPencil("ShapPencil", 10, 1);
		sp.print();
		BallPen bp = new BallPen("Ball", 25, 2, "Black");
		bp.print();
		FunctionPen fp = new FunctionPen("FunctionPen", 15, 2, "Blue");
		fp.print();
	}

}
