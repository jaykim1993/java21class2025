package diExample6;

public class Ex06Main {

	public static void main(String[] args) {
		DiscountCalculator dc = new DiscountCalculator();
		dc.applyDisCount(10000, new NoDiscount());
		dc.applyDisCount(10000, new PercentDiscount());
		dc.applyDisCount(10000, new FixedDiscount());

	}

}
