package arrayListEx01;

import java.util.Scanner;

public class CartMain {

	public static void main(String[] args) {
		Cart cart = new Cart();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[장바구니 목록]");
		cart.creatCart();

		System.out.println("------------------");
//		System.out.println("[1] 상품 목록");
//		System.out.println("[2] 장바구니 목록");
		System.out.println("[1] 상품  추가");
		System.out.println("[2] 상품  삭제");
		System.out.print("옵션 선택 : ");
		int sel = scan.nextInt();
		if(sel == 1) {
			System.out.print("추가 상품 : ");
			String newName = scan.next();
			System.out.print("가격 : ");
			int newPrice = scan.nextInt();
			cart.addItem(newName, newPrice);

		}
		if(sel == 2) {
			System.out.print("삭제 상품 : ");
			String newName = scan.next();
			cart.deleteItem(newName);

		}
		scan.close();
	}

}
