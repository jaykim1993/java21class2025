package polymophism;

public class Human extends Animal {
	@Override
	public void move() {
		System.out.println("사람은 두발로 걸어요");
	}
}
