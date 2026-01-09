package arrayListEx01;

public class Product {
		String item;
		int price;

		
		public Product() {}
		public Product(String item, int price) {
			this.item = item;
			this.price = price;
		}
		
		public void printProducts() {
			System.out.printf("%-10s:%10d원%n", item, price );
		}
}
