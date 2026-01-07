package example;

import java.util.Scanner;

public class LoopEx06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int bur1Price = 8700;
		int bur1Num = 0;
		int bur2Price = 6200;
		int bur2Num = 0;
		int drinkPrice = 1500;
		int drinkNum = 0;
		int orderCnt = 1;
		int totalPrice = 0;
		System.out.printf("=== 롯데리아 ===%n1. 불고기 버거 : %d원%n2. 새우 버거 : %d원%n3. 콜라 : %d원%n", bur1Price, bur2Price, drinkPrice);

		// 메뉴선택
		while(orderCnt<=5) {
			System.out.print("메뉴 선택 : ");
			int menuNum = scan.nextInt();
			if(menuNum == 1) {
				totalPrice+=bur1Price;
				bur1Num++;
			} else if (menuNum  == 2) {
				totalPrice += bur2Price;
				bur2Num++;
			} else if (menuNum == 3) {
				totalPrice += drinkPrice;
				drinkNum++;
			};
			orderCnt++;
		};
		System.out.printf("총 금액 = %d원%n", totalPrice);
		
		// 현금 입력 부분
		boolean cashDiscrimator =true;
		int change = 0;
		while(cashDiscrimator == true) {
			System.out.print("현금 입력 : ");
			int cash = scan.nextInt();
			if(cash < totalPrice) {
				System.out.println("금액이 부족합니다.");
			} else if (cash>=totalPrice) {
				change = cash - totalPrice;
				cashDiscrimator = false;
			};
		};
		scan.close();
		
		// 영수증
		System.out.println("=== 롯데리아 영수증 ===");
		System.out.printf("1. 불고기 버거 : %d개%n2. 새우 버거 : %d개%n3. 콜라 : %d개%n", bur1Num, bur2Num, drinkNum);
		System.out.printf("4. 총 금액 : %d원%n", totalPrice);
		System.out.printf("5. 잔돈 : %d원%n", change);
	}

}
