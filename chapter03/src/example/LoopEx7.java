package example;

import java.util.Scanner;

public class LoopEx7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// DB 계좌 정보
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbAcc2 = 2222;
		int dbPw2 = 2345;

		// 상태 관리 변수 선언
		boolean running = true;
		boolean login = false;

		// 입력값 변수 초기값
		int selectOption = 1;
		int inputAcc = 0;
		int inputPw = 0;

		// 조건문
		while (running == true) {
			System.out.println("1. 로그인");
			System.out.println("2. 로그아웃");
			System.out.println("0. 종료");
			System.out.print("옵션 선택 : ");
			selectOption = scan.nextInt();
			if (selectOption == 1 && login == false) {
				System.out.print("계좌번호 입력 : ");
				inputAcc = scan.nextInt();
				System.out.print("비밀번호 입력 : ");
				inputPw = scan.nextInt();
				if (inputAcc == dbAcc1 && inputPw == dbPw1) {
					System.out.printf("%d님, 환영합니다.%n", dbAcc1);
					login = true;
				} else if (inputAcc == dbAcc2 && inputPw == dbPw2) {
					System.out.printf("%d님, 환영합니다.%n", dbAcc2);
					login = true;
				} else {
					System.out.println("입력정보가 맞지 않습니다.");
				}
				;
			} else if (selectOption == 1 && login == true) {
				System.out.println("현재 로그인 상태입니다.");
			}
			;

			if (selectOption == 2 && login == true) {
				System.out.println("로그아웃 되었습니다.");
				login = false;
			} else if (selectOption == 2 && login == false) {
				System.out.println("현재 로그아웃 상태입니다.");
			}
			;

			if (selectOption == 0) {
				System.out.println("프로그램 종료");
				login = false;
				running = false;
			}
			;
		}
		scan.close();
	}

}
