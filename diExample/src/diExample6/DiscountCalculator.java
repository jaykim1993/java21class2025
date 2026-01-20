package diExample6;

public class DiscountCalculator {
	public void applyDisCount(int price, DiscountInterface di) {
		System.out.println(di.PricePolicy(price));
		
	}
}
