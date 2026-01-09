package arrayListEx01.copy;

import java.util.ArrayList;

public class Cart {
		ArrayList<Product> list = new ArrayList<>();
		
		//★ 중요한 로직
		// 매개변수 :  Product클래스에 멤버변수, 생성자, 메서드를 p로 접근할 수 있다
		public void addProduct(Product p) {
			list.add(p);
		}
		
		// 삭제함수
		public void removeProduct(int idx) {
			list.remove(idx-1);
		}
		
		// 상품 출력
		public void showItem() {
			for(Product p : list) {
				p.printItem();
			}
		}
		
		// 총계
		public int totalPrice() {
			int sum = 0;
			for(Product p : list)sum+=p.itemPrice;
			return sum;
		}
}


// Product p : 데이터 타입으로써 클래스 내 접근가능하다.