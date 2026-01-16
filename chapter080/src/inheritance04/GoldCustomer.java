package inheritance04;

import java.text.NumberFormat;

public class GoldCustomer extends Customer {
	NumberFormat num1 = NumberFormat.getInstance();
	protected int discountRatio;
	
	public GoldCustomer(String customerID, String customerName) {
		customerGrade = "GOLD";
		bonusRatio = 2;
		discountRatio = 10;
		this.customerID = customerID;
		this.customerName = customerName;
	}

	@Override
	public String calcPrice(int price) {
		bonusPoint = price*bonusRatio/100;
		price = price*(100-discountRatio)/100;
		return num1.format(price);
	}

	@Override
	public void showCustomerInfo() {
		super.showCustomerInfo();
	}
}
