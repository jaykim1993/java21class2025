package diExample2;

public class English implements Greeting {

	@Override
	public String GreetForm(String name) {
		return "Hello, " + name + "!";
	}

}
