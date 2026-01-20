package diExample2;

public class Korean implements Greeting {

	@Override
	public String GreetForm(String name) {
		return "안녕하세요, " + name + "님!";
	}

}
