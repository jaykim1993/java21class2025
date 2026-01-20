package diExample2;

public class NaverPayment implements Payment {

	@Override
	public String payMethod(int price) {
		return "네이버페이로 " + price +"원 결제 완료";
		
	}

}
