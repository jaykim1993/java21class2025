package PrivateEx;

public class Account {
	private int money;   // 정보 은닉

    // 캡슐화된 기능
    public void deposit(int amount) {
        if(amount > 0) {
            money += amount;
        }
    }

    public void withdraw(int amount) {
        if(amount <= money) {
            money -= amount;
        }
    }

    public int getMoney() {
        return money;
    }
}
