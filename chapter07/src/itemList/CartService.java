package itemList;

import java.util.ArrayList;

public class CartService {

    public void addItem(User user, Item item, int qty) {
        ArrayList<CartItem> cart = user.getCart();

        for (CartItem ci : cart) {
            if (ci.getItem().getName().equals(item.getName())) {
                ci.addQuantity(qty);
                System.out.println("수량이 추가되었습니다.");
                return;
            }
        }

        cart.add(new CartItem(item, qty));
        System.out.println("장바구니에 추가되었습니다.");
    }

    public void showCart(User user) {
        ArrayList<CartItem> cart = user.getCart();

        if (cart.isEmpty()) {
            System.out.println("장바구니가 비어 있습니다.");
            return;
        }

        System.out.println("-- 장바구니 --\n");
        for (int i = 0; i < cart.size(); i++) {
            CartItem ci = cart.get(i);
            System.out.printf("%d%5s%10d개%10d원\n",
                    i,
                    ci.getItem().getName(),
                    ci.getQuantity(),
                    ci.getTotalPrice());
        }
    }

    public void removeItem(User user, int index) {
        user.getCart().remove(index);
        System.out.println("삭제되었습니다.");
    }

    public void clearCart(User user) {
        user.getCart().clear();
        System.out.println("장바구니가 초기화되었습니다.");
    }

    public int getTotalPrice(User user) {
        int sum = 0;
        for (CartItem ci : user.getCart()) {
            sum += ci.getTotalPrice();
        }
        return sum;
    }
}
