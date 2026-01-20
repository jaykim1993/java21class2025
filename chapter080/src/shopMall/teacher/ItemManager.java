package shopMall.teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class ItemManager {
	Scanner scan = new Scanner(System.in);
	// 카테고리를 String 자료형으로 ArrayList 생성
	ArrayList<String> category = new ArrayList<String>();
	// 전체 아이템리스트를 Item 자료형으로 ArrayList 생성
	ArrayList<Item> itemList = new ArrayList<Item>();
	// 카트 리스트 ArrayList 생성
	ArrayList<Cart> cartList = new ArrayList<Cart>();
	// 객체화
	UserMenu um = new UserMenu();
	

	public ItemManager() {
		info();
	}
	
	// 아이템 추가 메서드
	public void addItem(String name, int price, String category) {
		itemList.add(new Item(name, price, category));
	}
	
	// 초기값 추가 메서드
	public void info() {
		category.add("과자");
		category.add("음료");
		category.add("생선");
		category.add("육류");
		addItem("칸쵸", 2200, category.get(0));
		addItem("칙촉", 5000, category.get(0));
		addItem("새우깡", 1700, category.get(0));
		addItem("고구마칩", 1600, category.get(0));
		addItem("나쵸", 1600, category.get(0));
		addItem("사이다", 1300, category.get(1));
		addItem("콜라", 1300, category.get(1));
		addItem("생수", 1000, category.get(1));
		addItem("탄산수", 1200, category.get(1));
		addItem("고등어", 4800, category.get(2));
		addItem("조기", 4000, category.get(2));
		addItem("연어", 6000, category.get(2));
		addItem("참치", 8000, category.get(2));
		addItem("돼지목살", 6000, category.get(3));
		addItem("소등심", 8000, category.get(3));
		addItem("닭가슴살", 2200, category.get(3));
	}
	
	// 아이템 삭제 메서드(관리자)
	public void removeItem(int index) {
		itemList.remove(index);
	}
	
	// 아이템 수정 메서드(관리자)
	public void editItem(int idx, String name, int price) {
		itemList.get(idx).name = name;
		itemList.get(idx).price = price;
	}
	
	// item 목록 출력 메서드(관리자, 전체)
	public void printItemAll() {
		System.out.println();
		for(int i = 0; i<itemList.size();i++) {
				System.out.printf("[%d]", i+1);
				itemList.get(i).printInfo();
		}
		System.out.println();
	}
	
	// 카테고리 출력 메서드(유저, 쇼핑 시)
	public void printCategory() {
		for(int i=0; i<category.size() ; i++) {
		    System.out.printf("[%d] [%s]%n", i , category.get(i));
		}
	}
	
	// item 목록 출력 메서드(유저, 카테고리 선택시)
	public void printItemList(String cate) {
		for(int i = 0; i<itemList.size();i++) {
			if(cate.equals(itemList.get(i).category)) {
				System.out.printf("[%d]", i);
				itemList.get(i).printInfo();
			}
		}
	}
	
	// 카트
			// 카트 담기 메서드
	public void addCart(String userId, int caId, int itemId) {

	    // 아이템 범위 체크
	    if (itemId < 0 || itemId >= itemList.size()) {
	        System.out.println("잘못된 상품 번호입니다.");
	        return;
	    }

	    Item item = itemList.get(itemId);

	    // 같은 유저 + 같은 상품이 있으면 수량 증가
	    for (Cart c : cartList) {
	        if (c.userId.equals(userId) && c.itemName.equals(item.name)) {
	            c.quantity++;
	            c.price += item.price;
	            System.out.println("장바구니에 수량이 추가되었습니다.");
	            return;
	        }
	    }

	    // 없으면 새로 추가
	    Cart cart = new Cart();
	    cart.userId = userId;
	    cart.itemName = item.name;
	    cart.price = item.price;
	    cart.quantity = 1;

	    cartList.add(cart);

	    System.out.println("장바구니에 담겼습니다.");
	}


			// 카트 보이기 메서드 
	public void showCart(String userId) {

	    System.out.println("\n===== 장바구니 목록 =====");
	    boolean isEmpty = true;
	    int totalPrice = 0;

	    for (int i = 0; i < cartList.size(); i++) {
	        Cart c = cartList.get(i);

	        if (c.userId.equals(userId)) {
	            isEmpty = false;
	            System.out.printf("[%s] 상품명: %s | 수량: %d | 가격: %d원\n",
	                    userId, c.itemName, c.quantity, c.price);
	            totalPrice += c.price;
	        }
	    }

	    if (isEmpty) {
	        System.out.println("장바구니가 비어 있습니다.");
	    } else {
	        System.out.println("-------------------------");
	        System.out.println("총 결제금액: " + totalPrice + "원");
	    }
	}

			

}
//기능