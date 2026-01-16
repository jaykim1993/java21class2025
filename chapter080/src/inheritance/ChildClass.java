package inheritance;

// 부모 클래스인 ParentsClass를 자식 클래스인 ChildClass에게 상속
// 상속 키워드 : extends
// 자식클래스 + extends 부모클래스

public class ChildClass extends ParentsClass{
	int a = 5;
	int b = 6;
	
	// 자식 디폴트 생성자
	public ChildClass(int a, int b) {
//		super(); // 부모의 디폴트 생성자를 호출 (생략해도 컴파일러가 자동으로 추가)
		System.out.println("자식 생성자");
		super.setA(b);
		
		this.a = a;
//		this.b = b;
	}
	
	public void childfun() {
//		this.a = 12;
		// 부모의 멤버 변수 a에 접근해서 값을 25로 변경
//		super.a = 25;
		System.out.println("==자식 매서드==");
		System.out.println("자식의 a : " + this.a);
		System.out.println("부모의 a : " + super.a);
	}
}
