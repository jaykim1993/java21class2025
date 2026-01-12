package statticEx;

public class StatticEx01 {
	static int atm = 500;
	int balance;
	String name;
	
	StatticEx01(){}
	StatticEx01(String name, int balance){
	this.name = name;
	this.balance = balance;
	}
	

	
	public void deposit(String name, int balance) {
		atm -= balance;
		System.out.println(this.name +"에게 "+ balance + "원을 보냄");
		System.out.println("남은 잔액 : " + atm + "원");
	}


}
