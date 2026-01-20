package diExample6;

public class NoDiscount implements DiscountInterface{

	@Override
	public String PricePolicy(int price) {
		return "할인 미적용가 : " + price +"원";
	}

}
