package diExample2;

public class PaymentProcessor {
	public void Pay(int price, Payment gr) {
		String result = gr.payMethod(price);
		System.out.println(result);
	}
}
// 의존성을 주입하는 외부 클래스 역할