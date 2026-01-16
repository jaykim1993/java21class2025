package abstractTest;

// 추상 클래스는 반드시 abstract 키워드를 입력한다
public abstract class Computer {
	
	// public abstract 는 {바디(구현체)}를 작성하지 않는다.
	public abstract void display();
	public abstract void typing();
	
	// 구현체가 존재하는 하위 메소드들은 추상
	// 모두 동통으로 구현해야되는 경우는 추상메서드가 아니다.
	public void turnOn() {
	System.out.println("전원 ON");
	}
	public void turnOff() {
	System.out.println("전원 OFF");
	}

}

// 하위에서 공통된 메서드를 사용하나
// 각각 어떻게 구현할지 방법을 모를때
// 각각 알아서 구현해야 할때
// => 선언만 하고
	//1. 공통된 멤버변수와 메서드를 통일할 목적
	//2. 실체클래스 구현시, 시간절약
	//3. 규격에 맞는 실체클래스 구현

