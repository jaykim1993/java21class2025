package shopMol;

import java.util.Scanner;

public class Shopping extends UserMenu {
	Scanner scan = new Scanner(System.in);
	boolean run = true;
	
	public Shopping() {}
	
	//메뉴
	public void menu() {
		
		while(run) {
			System.out.println("[1] 로그인");
			System.out.println("[2] 로그아웃");
			System.out.println("[3] 쇼핑");
			System.out.println("[4] 종료");
			System.out.print("메뉴선택: ");
			int select = scan.nextInt();
			
			if(select == 1) {// 로그인
				System.out.print("ID입력: ");
				String inputID = scan.next();
				System.out.print("PW입력: ");
				String inputPW = scan.next();
				for(int i = 0; i<super.id.length ; i++) {
					if(inputID.equals(id[i]) && inputPW.equals(pw[i])) {
						System.out.printf("[%s]님, 환영합니다.", id[i]);
						super.log = i;
					}
				}
			}
			
			else if(select == 2) { // 로그아웃
				
			}
			
			else if(select == 3) { // 쇼핑
				
			}
			
			else if(select == 0) { // 종료
				System.out.println("프로그램 종료");
				run = false;
			}
			
			else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
	
	//쇼핑메뉴
	public void shopMenu() {
		while(super.log != -1) {
			
		}
	}
	//로그인 메서드
	public void login() {}
	//로그아웃 메서드
	public void logout() {}
}
