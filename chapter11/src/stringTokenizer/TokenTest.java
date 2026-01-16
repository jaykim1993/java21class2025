package stringTokenizer;

import java.util.StringTokenizer;

public class TokenTest {

	public static void main(String[] args) {
		String str = "java android";
		String str1 = "java!android ";
		String str02 = "010-1111-2222";
		String str2 = "java!an droid-fun";
		
		StringTokenizer st = new StringTokenizer(str);
		// nextToken() : 객체에서 다음토큰을 반환
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println("-------");
		
		// 특정 구분자로 자를때
		StringTokenizer st1 = new StringTokenizer(str1, "!");
		for(int i=0 ; i<2 ; i++) {
			System.out.println(st1.nextToken().trim());
		}
		System.out.println("-------");
		StringTokenizer st02 = new StringTokenizer(str02, "-");
		for(int i=0 ; i<3 ; i++) {
			System.out.println(st02.nextToken());
		}
		System.out.println("-------");
		
		// 여러개의 구분자로 자를때
		StringTokenizer st2 = new StringTokenizer(str2, "! -");
		for(int i=0 ; i<4 ; i++) {
			System.out.println(st2.nextToken());
		}
		System.out.println("-------");
		
		// true 입력하면 구분자로 지정된 ! 또한 토큰으로 넣는다.
		StringTokenizer st3 = new StringTokenizer(str1, "!", true);
		for(int i=0 ; i<3 ; i++) {
			System.out.println(st3.nextToken());
		}
	}

}
