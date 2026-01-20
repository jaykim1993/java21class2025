package diExample6;

public class FixedDiscount implements DiscountInterface{

	@Override
	public String PricePolicy(int price) {
		price -= 5000;
		return "고정할인가 : " + price +"원";
	}

}
