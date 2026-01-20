package diExample2;

public class Ex03Main {

	public static void main(String[] args) {
		PaymentProcessor pp = new PaymentProcessor();
		
		pp.Pay(10000, new CreditCardPayment());
		pp.Pay(14000, new KakaoPayment());
		pp.Pay(22000, new NaverPayment());

	}

}
