package bookshelf;

public interface Queue {
	void inQueue(String title); // 입력
	
	String deQueue(); // 출력
	int getSize();
}


// Queue
	// FIFO: First In First Out