package ifexample;

import java.util.Scanner;

public class ifEx01 {

	public static void main(String[] args) {
		String dbId = "1234";
		String dbPw = "1111";
		@SuppressWarnings("resource") // 예외처리
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ID 입력 : ");
		String  ID = scan.next();
		System.out.print("PW 입력 : ");
		String PW = scan.next();
		// 'String'은 객체 데이터 타입으로  ==으로 비교 시 dbId, dbPw가 저장된 힙메모리의 주소로 비교
		// 값을 직접 비교하려면  '=='이 아닌 'equals'를 사용한다.
		// !dbId.equals(ID) 가 같지 않다의 표기이다.
		if (dbId.equals(ID)) {
		    if (dbPw.equals(PW)) {
		        System.out.println("로그인 성공");
		    } else {
		        System.out.println("로그인 실패(비밀번호 불일치)");
		    }
		} else {
		    System.out.println("로그인 실패(아이디 불일치)");
		}
	}
}
