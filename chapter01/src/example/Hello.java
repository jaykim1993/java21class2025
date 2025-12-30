package example;

public class Hello {

	public static void main(String[] args) {
		Object obj = new Object(); // object 는 객체 데이터 타입으로 java의 최상위 데이터 타입이다.
		System.out.println("Hello java World!!");
		
//		java 주석은 ctrl+/
		int i; // 변수 지정
		i = 10; // 초기값 지정
		int j = 20; // 선언과 초기화는 동시 진행이 추후 오류 방지에 유리하다.
		// ctrl alt 방향키: 한줄 복사
		System.out.println("i : " + i); 
		System.out.println("j : " + j); 
		System.out.println("i의 번지" +obj.hashCode()); // hashCode() = stack 내 저장되어 있는 address 번지수
		System.out.println("j의 번지" +obj.hashCode());

		
	}

}
