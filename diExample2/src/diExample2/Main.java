package diExample2;

public class Main {

	public static void main(String[] args) {
		GreetingService gs = new GreetingService();
		
		gs.GreetingSer("이름", new Korean());
		gs.GreetingSer("이름", new Japanese());
		gs.GreetingSer("이름", new English());

	}

}
