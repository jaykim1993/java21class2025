package diExample2;

public class KakaoPayment implements Payment {

	@Override
	public String payMethod(int price) {
		return "카카오페이로 " + price +"원 결제 완료";
	}

}
