package diExample2;

public class Japanese implements Greeting {

	@Override
	public String GreetForm(String name) {
		return "こんにちは " + name + "さん!" ;
	}

}
