package multiexample;

import java.util.Scanner;

public class String_example01 {

	public static void main(String[] args) {
		// 객체 데이터 타입은 new로 생상할 경우 Heap 메모리에 저장된다.
		String a = new String("hongpossible");
		String b = new String("hongpossible");
		

		// a와 b의 물리적 주소(참조주소) 비교
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
		// a와 b의 주소 비교된다.
		// == 은 참조타입의 값이 아니라 주소(참조)를 비교한다.
		if(a==b) {
			// 문자값은 같아도 서로 다른 참조주소를 가지므로 출력되지 않음
			System.out.println("a==b");
		}
		// a와 b의 값이 비교된다.
		if(a.equals(b)) {
			System.out.println("a.equals(b)  // true");
		}
	
	
		String c = "hong";
		String d = "hong";
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(d));
		
		// == 은 참조타입의 값이 아니라 주소(참조)를 비교한다.
		if(c==d) {
			System.out.println("c==d");
		}
		if(c.equals(d)) {
			System.out.println("c.equals(d)  // true");
		}
		
		// Scanner의 next() 동작 방식은 키보드 입력을 하면 Heap에 객체 생성
		// 따라서 ==으로 값 비교 하기 힘듬
		// => equals 써야함
		Scanner scan = new Scanner(System.in);
		// Scanner로 입력받은 숫자의 예외처리는 try ~ catch()를 이용한다.
		System.out.print("숫자를 입력하세요");
		// 키보드 또는 네트워크를 통해 가져오는 데이터 오류는 컴퓨터가 알 수 없다.
		// 그러므로 try ~catch()를 통해 오류 메시지를 전달한다.
		try {
			int num = scan.nextInt();
		}catch(Exception e) {
			System.out.println("숫자만 입력하세요");
		}
		
		
	}
}


