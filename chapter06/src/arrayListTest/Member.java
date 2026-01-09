package arrayListTest;

public class Member {
		// 멤버 변수
		String name;
		String address;
		int age;
		
		
		// 디폴트 생성자
//		public Member() {}
		// 매개변수 생성자
		// Main()에서 생성할때 입력한 매개변수 값이
		// this.name... 에 들어간다.
		public Member(String name, String address, int age) {
			// this는 현 클래스를 지칭한다
			this.name = name;
			this.address = address;
			this.age = age;
		}
		
		// 출력메서드
		public void printMember() {
			System.out.printf("이름 : %s%n 나이 : %d%n 주소: %s%n", name, age, address);
		}
}
