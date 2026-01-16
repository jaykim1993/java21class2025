package itemList;

import java.util.ArrayList;

public class Cart {
    private ArrayList<CartItem> cartItems = new ArrayList<>();

    public void addItem(Item item, int quantity) {
        for(CartItem ci : cartItems) {
            if(ci.getItem().getId() == item.getId()) {
                ci.addQuantity(quantity);
                return;
            }
        }
        cartItems.add(new CartItem(item, quantity));
    }

    public void printCart() {
        System.out.println("==== 장바구니 ====");
        int total = 0;

        for(CartItem ci : cartItems) {
            int price = ci.getTotalPrice();
            total += price;

            System.out.println(
                ci.getItem().getName() + " x " + ci.getQuantity() + " = " + price + "원"
            );
        }

        System.out.println("총 금액: " + total + "원");
    }
}
