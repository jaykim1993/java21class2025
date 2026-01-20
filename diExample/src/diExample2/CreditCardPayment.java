package diExample2;

public class CreditCardPayment implements Payment{

	@Override
	public String payMethod(int price) {
		return "신용카드로 " + price +"원 결제 완료";
	}
	
}
