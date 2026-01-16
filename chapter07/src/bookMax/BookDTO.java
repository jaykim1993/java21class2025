package bookMax;

public class BookDTO {

	private String name;
	private String author;
	private int price;
	
	// private 접근제어자는 자기자신 클래스에서는 접근 할 수 있다.
	BookDTO(String name, String author, int price){
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}


	public String getAuthor() {
		return author;
	}



	public int getPrice() {
		return price;
	}



	
}
