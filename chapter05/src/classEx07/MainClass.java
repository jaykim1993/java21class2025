package classEx07;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// while문은 여기서 돌린다.
		Scanner scan = new Scanner(System.in);
		ClassEx07 shop = new ClassEx07();
		
		System.out.println("[맘스터치 햄버거]");
		shop.randerItems();
		System.out.println("5. 주문하기");
		int selectA = scan.nextInt();
		while(selectA != 5) {
			
		}
	}

}
