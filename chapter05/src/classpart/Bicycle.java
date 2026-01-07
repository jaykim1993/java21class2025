package classpart;

public class Bicycle {
	String color;
	int price;
	
	public Bicycle() {
		System.out.println("Bicycle constructor -Ⅰ");
	}
	public Bicycle(String c, int p ) {
		System.out.println("Bicycle constructor -Ⅱ");
		color = c;
		price = p;
	}
	
	public void showBicycleInfo() {
		System.out.println("-- info --");
		System.out.printf("color : %s%nprice : %d%n", color, price );
	}
}
