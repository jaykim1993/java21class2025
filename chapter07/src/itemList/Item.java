package itemList;

public class Item {
    private static int seq = 1;

    private int id;
    private String category;
    private String name;
    private int price;

    public Item(String category, String name, int price) {
        this.id = seq++;
        this.setCategory(category);
        this.setName(name);
        this.setPrice(price);
    }

    public int getId() { return id; }

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
