package abstractTest;

// 부모 추상클래스 상속받아
// 모두 사용하지 않을 경우 
// 자식도 추상클래스로 선언해야함
// typing() 미구현 했기에 현 클래스도 → 추상 클래스 유지
public abstract class NoteBook extends Computer {
	// NoteBook에서 display() 구현 완료
	@Override
	public void display() {
		System.out.println("NoteBook display()---");
	}
	
	public void turnOff() {
		System.out.println("노트북 전원 OFF");
		}
}

// 모든 추상 메서드를 구현하지 않으면 객체 생성이 불가능