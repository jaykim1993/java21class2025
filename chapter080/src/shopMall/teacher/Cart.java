package shopMall.teacher;

public class Cart {
	// 멤버 변수
	String userId; // 구매한 유저 id
	String itemName; // 구입 상품명
	int price; // 구입 상품 금액
	int quantity; // 구입 상품 수량
	
	// 생성자
	public Cart() {};
	public Cart(String itemName, int price) {
		this.itemName = itemName;
		this.price = price;
	}
	

	
}
//DTO 클래스