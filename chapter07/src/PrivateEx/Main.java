package PrivateEx;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateTest pt = new PrivateTest();

		
		pt.setMonth(02);
		pt.setDay(30);
		pt.setYear(2020);
		System.out.println(pt.getMonth());
		System.out.println(pt.getDay());
		System.out.println(pt.getYear());
		
		
//		Account.java에 대한 출력
		Account acc = new Account();
		acc.deposit(10000);
		acc.withdraw(3000);
		System.out.println(acc.getMoney());
	}

}
