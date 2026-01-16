package inheritance04;

import java.text.NumberFormat;

public class VIPCustomer extends Customer {
	NumberFormat num1 = NumberFormat.getInstance();
	protected int discountRatio;
	protected int counselor;
	
	public VIPCustomer(String customerID, String customerName) {
		customerGrade = "VIP";
		bonusRatio = 5;
		discountRatio = 10;
		counselor = 1010;
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
		System.out.printf("%n담당전문 상담은 %d번입니다.%n", counselor);
	}
	
	
}
