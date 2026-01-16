package abstractTest;

public class ComputerTest {

	public static void main(String[] args) {
//		Computer c1 = new Computer(); 추상 클래스는 인스턴스화 할 수 없다.
		Computer c2 = new DeskTop(); // Computer 상속받는 하위 클래스의 데이터타입으로 Computer를 업캐스팅
//		Computer c3 = new NoteBook(); 추상 클래스는 인스턴스화 할 수 없다.
		Computer c4 = new MyNoteBook();

		
		c2.display();
		c2.typing();
		c2.turnOff();
		
		c4.display();
		c4.typing();
		c4.turnOff();

	}

}
// 모든 추상 메서드를 구현하지 않으면 객체 생성이 불가능

// 다형성의 성립조건
	// 상속 관계 (is-a 관계) - 부모-자식 관계
	// 메서드 오버라이딩 - 부모 클래스의 메서드를 자식 클래스에서 재정의해야 합니다.
	// 업캐스팅 - 부모 타입 참조 변수로 자식 객체 참조