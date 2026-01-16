package inheritance;

public class ParentsClass {
	protected int a = 10;
	protected int b = 20;
	
	// 부모 디폴트 생성자
	public ParentsClass(){
		System.out.println("부모 생성자");
	}
	


	public int getA() {
		return a;
	}



	public void setA(int a) {
		this.a = a;
	}



	public int getB() {
		return b;
	}



	public void setB(int b) {
		this.b = b;
	}



	public void parentsfun() {
		System.out.println("부모 매서드");
		System.out.println(a+","+b);
	}
}


//코드 재사용 - 	중복 제거, 유지보수 쉬움
//공통 기능 관리 -		한 곳에서 관리 가능
//다형성 - 		유연한 프로그램 구조
//객체지향 설계 -		현실 세계 모델링