package arrayListEx01;

import java.util.ArrayList;

public class Cart {
		Product productArr = new Product();
		ArrayList<Product> cart = new ArrayList<>();

		int total;
		String newItem;
		int newPrice;
		
		public Cart() {};

		// 기존 상품 어래이리스트로 만들기 => cart 가 된다
		public void creatCart() {
			cart.add(new Product("사과", 1000));
			cart.add(new Product("바나나", 2000));
			cart.add(new Product("망고", 5000));
			cart.add(new Product("포도", 8000));
			cart.add(new Product("수박", 10000));
			for(Product info : cart) {
				info.printProducts();
			}
			totalPrice();
		}
		
		// 상품 추가
		public void addItem(String name, int price) {
			System.out.println("[상품 추가 후 장바구니]");
			cart.add(new Product(name, price));
			for(Product info : cart) {
				info.printProducts();
			}
			total = 0;
			totalPrice();
		}
		
		// 상품 제거
		public void deleteItem(String name) {
			System.out.println("[상품 삭제 후 장바구니]");
			 for(int i = 0; i < cart.size(); i++) {
		            if(name.equals(cart.get(i).item)) {
		                cart.remove(i);
		                break;
		            }
		        }
			for(Product info : cart) {
				info.printProducts();
			}
			total = 0;
			totalPrice();
		}
	  
		// 합산금액 계산
		public void totalPrice() {
			for(Product info : cart) {
				total += info.price;
			}
			System.out.println("총 금액 : "+ total+ "원");
		}
}
