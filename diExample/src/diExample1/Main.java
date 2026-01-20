package diExample1;

public class Main {

	public static void main(String[] args) {
		GreetingService gs = new GreetingService();
		
		gs.GreetingSer("김성중", new Korean());
		gs.GreetingSer("Takanori", new Japanese());
		gs.GreetingSer("Jamie", new English());

	}

}
