package multiexample;

import java.util.Scanner;

public class String_example05 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[][] items = new String[100][2];
		boolean run = true;
		int cateCnt = 0;
		for(int i = 0 ; i<items.length ; i++) {
			for(int j = 0 ; j<items[i].length ; j++) {
				items[i][j]="";
			}
		}

		System.out.println("[관리자 모드]");
		System.out.println("[1] 카테고리 관리");
		System.out.println("[2] 아이템 관리");
		System.out.println("[3] 전체품목 출력");
		System.out.println("[0] 종료");
		while(run) {
			System.out.print("관리자 모드를 선택 : ");
			int selecOption = scan.nextInt();
			if(selecOption == 1 || selecOption == 2 || selecOption == 3 || selecOption == 0 ) {
				if(selecOption == 1) {
					System.out.print("추가할 카테고리 입력: ");
					String inputCategory = scan.next();
					items[cateCnt][0] = inputCategory;
					cateCnt++;
				}
				
				
				if(selecOption == 2) {
					if(cateCnt==0) {
						System.out.print("카테고리를 먼저 추가해주세요: ");
						String inputCategory = scan.next();
						items[cateCnt][0] = inputCategory;
						cateCnt++;
					}
					for(int i = 0; i<cateCnt ; i++) {
						System.out.printf("[%d] %s%n",i, items[i][0]);
					}
					int inputCateNum;
					while (true) {
					    System.out.print("카테고리를 선택하세요 : ");
					    try {
					        inputCateNum = scan.nextInt();
					        break; // 숫자 제대로 입력되면 탈출
					    } catch (Exception e) {
					        System.out.println("숫자를 입력해주세요");
					        scan.next(); // 잘못된 입력 제거
					    }
					}
					
					System.out.print("추가할 아이템 입력: ");
					String inputItem = scan.next();
					items[inputCateNum][1] += inputItem + " / ";
					}
				
				
				if(selecOption == 3) {
					for(int i = 0; i<cateCnt ; i++) {
						System.out.printf("%s : %s%n", items[i][0], items[i][1]);
						}
						System.out.println();
				}
				
				
				if(selecOption == 0) {
					run = false;
				}
				
			}else {
				System.out.println("옵션 선택을 다시 하세요");
			}
			
			
			
		}
		scan.close();
	}
}
