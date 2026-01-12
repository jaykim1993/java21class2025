package bookMax;

public class BookDTO {

	private String name;
	private String author;
	private int price;
	
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
