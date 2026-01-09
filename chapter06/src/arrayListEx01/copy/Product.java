package arrayListEx01.copy;

public class Product {
		String itemName;
		int itemPrice;
		
		// 생성자
		public Product() {}
		public Product(String itemName, int itemPrice) {
			this.itemName = itemName;
			this.itemPrice = itemPrice;
		}
		
		public void printItem() {
			System.out.printf("%-10s:%10d원%n", itemName, itemPrice );
		}
}


// DB를 product를 통해서 끌어온다
// 오직 맴버 변수만 들어간다.