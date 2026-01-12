package statticEx;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("보유액 : " + StatticEx01.atm +"원");
		System.out.println("[1] 입금");

		System.out.print("선택 : ");
		int option = scan.nextInt();
		if(option==1) {
			System.out.print("이름 : ");
			String name = scan.next();
			System.out.print("입금액 : ");
			int balance = scan.nextInt();
			StatticEx01 se1 = new StatticEx01(name, balance);
			se1.deposit(name, balance);
		}

	}

}
