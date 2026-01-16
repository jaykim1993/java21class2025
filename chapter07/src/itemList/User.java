package itemList;

import java.util.ArrayList;

public class User {
    private String id;
    private String pw;
    private int balance;
    private ArrayList<CartItem> cart = new ArrayList<>();

    public User(String id, String pw, int balance) {
        this.id = id;
        this.pw = pw;
        this.balance = balance;
    }

    public String getId() { return id; }
    public String getPw() { return pw; }
    public int getBalance() { return balance; }
    public ArrayList<CartItem> getCart() { return cart; }
}
