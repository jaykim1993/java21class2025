package interfaceEx01;

public class Television implements Buyable{
	String name = "텔레비전";
	String model;
	String maker;
	int price;
	
	public Television(String model, String maker, int price) {
		this.model = model;
		this.maker = maker;
		this.price = price;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public String getModel() {
		return model;
	}

	@Override
	public String getMaker() {
		return maker;
	}

}
