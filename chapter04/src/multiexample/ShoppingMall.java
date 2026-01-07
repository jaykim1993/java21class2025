package multiexample;

import java.util.Scanner;

public class ShoppingMall {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111", "2222", "3333"};
		String[] items = {"사과", "바나나", "딸기"};
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2]; //100,2 빈배열 생성
		int[][] cartcount = new int[ids.length][items.length]; // 회원별 상품별 갯수 담는 변수
		int count = 0; // 아이템 갯수
		// 상태 변수
		boolean run = true;
		boolean login = false;
		boolean shopping = false;
		String id = "";
		String pw = "";
		int select = 0;
		int memberIndex = -1;
		int itemIndex = -1;
		int jangIndex = 0;
		
		while(run) {
			if(shopping==false) {
				System.out.println("-------------");
				System.out.print("상태 : ");
				if(login)System.out.print(id);
				else System.out.print("로그아웃");
				System.out.println();
				System.out.println("-------------");
				System.out.println("[ GREEN MART ]");
				System.out.println("-------------");
				System.out.println("[ 1 ] 로그인");
				System.out.println("[ 2 ] 로그아웃");
				System.out.println("[ 3 ] 쇼핑");
				System.out.println("[ 4 ] 장바구니");
				System.out.println("[ 0 ] 종료");
				System.out.println("-------------");
				System.out.print("메뉴 선택 : ");
				select = scan.nextInt();
				System.out.println();
			}

			
			// -------------------------------- 로그인
			if( select == 1 && login == false) {
				System.out.print("ID 입력 : ");
				id = scan.next();
				System.out.print("PW 입력 : ");
				pw = scan.next();
				
				for(int i = 0 ; i<ids.length ; i++) {
					if(id.equals( ids[i]) && pw.equals(pws[i])) {
						memberIndex = i;
						login = true;
						System.out.printf("%s님, 환영합니다.%n", id);
						break;
					};
				}
				if(login == false)System.out.println("아이디와 비밀번호를 확인하세요");
			} else if( select == 1 && login) System.out.println("이미 로그인 상태입니다.");
			
			// -------------------------------- 로그아웃
			if( select == 2 && login) {
				id = "";
				pw = "";
				login = false;
			}else if(select == 2 && login == false)System.out.println("이미 로그아웃 상태입니다.");
			
			
			if( select == 3 ) {
				if(login) {
					shopping = true;
						for(int i = 0 ; i<items.length ; i++) {
							itemIndex = i+1; // 화면 표시될 과일 인덱스는 1, 2, 3
							System.out.printf("[%d] %s%n", itemIndex, items[i] );
						}
						System.out.println("[4] 뒤로가기");
						System.out.println();
						System.out.print("상품 번호를 선택하세요 : ");
						itemIndex = scan.nextInt();
						System.out.println();
						// 뒤로 가기 버튼
						if(itemIndex == 4) {
							shopping = false;
						}
						if(count == MAX_SIZE) {
							System.out.println("최대 100개까지 담을 수 있습니다");
							break;
						}
						// 상품 선택 시
						else if (itemIndex >0 && itemIndex <= items.length) {
							jang[jangIndex][0] = memberIndex;
							jang[jangIndex][1] = itemIndex-1; // 실제 과일 인덱스 는 0, 1, 2
							cartcount[memberIndex][itemIndex-1]++;
							jangIndex++;
						}
					} else  System.out.println("로그인 후 이용해주세요.");
			}
			
			if( select == 4 && login) {
				System.out.println("--- 내 장바구니 목록 ----");
				for(int i = 0 ; i<cartcount.length ; i++) {
					System.out.printf("%s : %d개%n",items[i], cartcount[memberIndex][i] );
				 }
				} else if(select == 4 && login == false)System.out.println("로그인 후 이용해주세요");
		
			
			if( select == 0) {
				id = "";
				pw = "";
				run = false;
				login = false;
				shopping = false;
			}
			else if(select < 0 || select >4){
				System.out.println("[0 - 4] 중에 입력하세요");
			}
		}

		
		
		
		
		scan.close();
	}
}
