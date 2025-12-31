package example;

import java.util.Scanner;

public class LoopEx09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// DB 계좌 정보
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;

		// 상태 관리 변수 선언
		boolean running = true;
		boolean login = false;

		// 입력값 변수 초기값
		int selectOption = 1;
		int inputAcc = 0;
		int inputPw = 0;
		int depositMoney = 0;
		int transferAcc = 0;
		int transferMoney = 0;
		int withdrawMoney = 0;

		// 조건문
		while (running) {
			// 로그인 및 현금 보유 상태 보이기
			System.out.print("*상태 : ");
			if (login == true) {
				System.out.printf("%d 로그인 상태%n", inputAcc);
			} else if (login == false) {
				System.out.println("로그아웃 상태");
			}

			// 옵션 출력
			System.out.println("1. 로그인");
			System.out.println("2. 로그아웃");
			System.out.println("3. 입금");
			System.out.println("4. 출금");
			System.out.println("5. 이체");
			System.out.println("6. 조회");
			System.out.println("0. 종료");
			System.out.print("옵션 선택 : ");
			selectOption = scan.nextInt();

			// 로그인 하기
			if (selectOption == 1 && login == false) {
				System.out.print("계좌번호 입력 : ");
				inputAcc = scan.nextInt();
				System.out.print("비밀번호 입력 : ");
				inputPw = scan.nextInt();
				if ((inputAcc == dbAcc1 && inputPw == dbPw1) || (inputAcc == dbAcc2 && inputPw == dbPw2)) {
					System.out.printf("%d님, 환영합니다.%n", inputAcc);
					login = true;
				} else {
					System.out.println("입력정보가 맞지 않습니다.");
				}
				;
			} else if (selectOption == 1 && login == true) {
				System.out.println("현재 로그인 상태입니다.");
			}
			;

			// 로그아웃 하기
			if (selectOption == 2 && login == true) {
				System.out.println("로그아웃 되었습니다.");
				login = false;
			} else if (selectOption == 2 && login == false) {
				System.out.println("현재 로그아웃 상태입니다.");
			}
			;

			// 입금
			if (selectOption == 3 && login == true) {
				System.out.print("입금할 금액 입력");
				depositMoney = scan.nextInt();
				if (inputAcc == dbAcc1) {
					dbMoney1 += depositMoney;
				} else if (inputAcc == dbAcc2) {
					dbMoney2 += depositMoney;
				}
				System.out.println("입금을 완료하였습니다.");
			}
			;

			// 출금
			if (selectOption == 4 && login == true) {
				System.out.print("출금할 금액 입력");
				withdrawMoney = scan.nextInt();
				if (inputAcc == dbAcc1) {
					if (dbMoney1 < withdrawMoney) {
						System.out.println("계좌 잔액이 부족합니다.");
					} else {
						dbMoney1 -= withdrawMoney;
						System.out.println("출금을 완료하였습니다.");
					}
				} else if (inputAcc == dbAcc2) {
					if (dbMoney2 < withdrawMoney) {
						System.out.println("계좌 잔액이 부족합니다.");
					} else {
						dbMoney2 -= withdrawMoney;
						System.out.println("출금을 완료하였습니다.");
					}
					;
				}
			}
			;

			// 이체
			if (selectOption == 5 && login == true) {
				System.out.print("이체할 계좌번호 입력");
				transferAcc = scan.nextInt();
				System.out.print("이체할 금액 입력");
				transferMoney = scan.nextInt();
				if (transferAcc == inputAcc) {
					System.out.println("동일 계좌로 이체 불가");
				} else if (transferAcc != inputAcc) {
					if (inputAcc == dbAcc1) {
						if (dbMoney1 < transferMoney) {
							System.out.println("이체할 수 없습니다.");
						} else {
							dbMoney1 -= transferMoney;
							dbMoney2 += transferMoney;
							System.out.println("이체를 완료하였습니다.");
						}
						;
					} else if (inputAcc == dbAcc2) {
						if (inputAcc == dbAcc2) {
							if (dbMoney2 < transferMoney) {
								System.out.println("이체할 수 없습니다.");
							} else {
								dbMoney2 -= transferMoney;
								dbMoney1 += transferMoney;
								System.out.println("이체를 완료하였습니다.");
							}
							;
						}
						;
					}
					;
				} else {
					System.out.println("이체 계좌를 확인하세요");
				}
				;

			}
			;

			// 조회
			if (selectOption == 6 && login == true) {
				System.out.printf("dbMoney1 : %d원%ndbMoney2 : %d원%n", dbMoney1, dbMoney2);
			}
			;

			// 비로그인 예외처리
			if (selectOption >= 3 && selectOption <= 6) {
				if (login == false)
					System.out.println("로그인 후 이용가능");
			}
			;

			// 종료
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