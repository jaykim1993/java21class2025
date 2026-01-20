package diExample6;

public class PercentDiscount implements DiscountInterface{

	@Override
	public String PricePolicy(int price) {
		price = price/10*9;
		return "10% 할인가 : " + price +"원";
	}

}
