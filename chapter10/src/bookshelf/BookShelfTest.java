package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		shelfQueue.inQueue("A");
		shelfQueue.inQueue("B");
		shelfQueue.inQueue("C");
		shelfQueue.inQueue("D");
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}

}
