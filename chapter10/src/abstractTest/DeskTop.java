package abstractTest;

public class DeskTop extends Computer {

	@Override // 부모 메서드를 상속받아 재정의한다.
	public void display() {
		System.out.println("DeskTop display()---");	
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing()---");
	}
}
