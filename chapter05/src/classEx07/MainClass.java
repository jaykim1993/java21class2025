package classEx07;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// 계산, 저장, 처리 로직 X => 클래스에서
		// while문(실행 순서)
		// 인스턴스화, 매서드 호출
		Scanner scan = new Scanner(System.in);
		ClassEx07 shop = new ClassEx07();
		shop.name = "맘스터치 상암점";
		boolean run = true;
		
		while(run) {
			System.out.println("[맘스터치 햄버거]");
			shop.randerItems();
			int sel = scan.nextInt();
			
			// 메뉴선택
			if(sel >=1 && sel <=4) {
				shop.addCart(sel-1);
			} else if(sel == 5) {
				if(!shop.hasOrder()) {
					System.out.println("주문 내역이 없습니다.");
					continue;
				}
			shop.calcTotal();
			System.out.println("총 금액 : " + shop.total + "원");
			System.out.print("지불 금액 : ");
			int money = scan.nextInt();
			
			if(money < shop.total) {
				System.out.println("지불 금액이 부족합니다.");
				continue;
			}
			run = false;
			shop.printReceipt(money);
		}
			
		}
		
	}

}
