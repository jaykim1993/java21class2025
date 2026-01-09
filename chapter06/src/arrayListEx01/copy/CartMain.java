package arrayListEx01.copy;

import java.util.Scanner;

public class CartMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cart cart = new Cart();
		// ArrayList<Product> list 아래에 cart 상품이 힙에 담겨있다.
		// Cart에서 list.add를 매서드화했다
		cart.addProduct(new Product("사과", 1000)); 
		cart.addProduct(new Product("바나나", 2000));
		cart.addProduct(new Product("망고", 5000));
		cart.addProduct(new Product("포도", 8000));
		cart.addProduct(new Product("수박", 10000));
		
		System.out.println("[장바구니 목록]");
		cart.showItem();
		System.out.println("총금액 : " + cart.totalPrice());
		System.out.println("------------------");
		System.out.print("삭제할 상품 입력");
		int index = scan.nextInt();
		cart.removeProduct(index);
		System.out.println("[삭제 후 장바구니 목록]");
		cart.showItem();
		System.out.println("------------------");
		System.out.println("추가할 상품 입력");
		String name = scan.next();
		cart.addProduct(new Product(name, 3000));
		System.out.println("[추가 후 장바구니 목록");
		cart.showItem();
		System.out.println("------------------");
		
	}

}
