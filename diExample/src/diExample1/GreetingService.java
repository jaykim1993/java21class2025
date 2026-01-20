package diExample1;

public class GreetingService {
	public void GreetingSer(String name, Greeting greeting) {
		String result = greeting.GreetForm(name);
		System.out.println(result);
	}
}
//의존성을 주입하는 외부 클래스 역할