package doubleInterface;

public class DoubleInterfaceTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = customer;
		Sell seller = customer;
		buyer.buy();
		seller.sell();
		
		customer.order();
		buyer.order();
		seller.order();

	}

}
