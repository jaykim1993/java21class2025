package diExample2;

public class GreetingService {
	public void GreetingSer(String name, Greeting greeting) {
		String result = greeting.GreetForm(name);
		System.out.println(result);
	}
}
