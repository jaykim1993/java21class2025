package interfaceEx02;

public class Monkey implements Animal{
	String name;
	
	Monkey(){
		name = "원숭이";
	}
	@Override
	public void eat(String bab) {
		System.out.printf("%s는 %s를 먹어요%n", name, bab);
	}

	@Override
	public void work(String move) {
		System.out.printf("%s는 %s로 걸어요%n", name, move);
	}

	@Override
	public void sleep(String zzz) {
		System.out.printf("%s는 %s서 자요%n", name, zzz);
	}
}
