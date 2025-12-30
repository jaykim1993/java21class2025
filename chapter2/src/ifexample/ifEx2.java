package ifexample;

import java.util.Scanner;

public class ifEx2 {

	public static void main(String[] args) {
		String userID = "";
		String userPW = "";
		@SuppressWarnings("resource") // 예외처리
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===회원가입===");
		System.out.print("가입할 ID를 입력하세요 : ");
		userID = scan.next();
		System.out.print("가입할 PW를 입력하세요 : ");
		userPW = scan.next();
		System.out.println("가입을 축하합니다.");
		
		System.out.println("===로그인===");
		System.out.print("ID 입력 : ");
		String  inputID = scan.next();
		System.out.print("PW 입력 : ");
		
		String inputPW = scan.next();
		if(userID.equals(inputID) && userPW.equals(inputPW) ) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}


	}
}
