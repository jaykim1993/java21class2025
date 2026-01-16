package inheritance04;

import java.text.NumberFormat;

public class Customer {
	NumberFormat num1 = NumberFormat.getInstance();
	protected String customerID;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected int bonusRatio;
	
	public Customer() {}
	public Customer(String customerID, String customerName) {
		customerGrade = "SILVER";
		bonusRatio = 1;
		this.customerID = customerID;
		this.customerName = customerName;
	}
	
	public String calcPrice(int price) {
		bonusPoint = price*bonusRatio/100;
		return num1.format(price);
	}
	
	public void showCustomerInfo() {
		System.out.printf(
				"%s님의 등급은 %s이며, 보너스 포인트는 %d입니다.", 
				customerName, 
				customerGrade, 
				bonusPoint
				);
	}
	
}
