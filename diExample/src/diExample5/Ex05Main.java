package diExample5;

import java.util.Scanner;

public class Ex05Main {

	public static void main(String[] args) {
		BeverageMaker bm = new BeverageMaker();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. 아메리카노");
		System.out.println("2. 라떼");
		System.out.println("3. 오렌지쥬스");
		System.out.println("4. 그린티");
		System.out.print("음료를 선택하세요 : ");
		int sel = scan.nextInt();
		if(sel == 1)bm.makeBeverage(new Americano());
		if(sel == 2)bm.makeBeverage(new Latte());
		if(sel == 3)bm.makeBeverage(new OrangeJuice());
		if(sel == 4)bm.makeBeverage(new GreenTea());


	}

}
