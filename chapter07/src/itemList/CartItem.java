package itemList;

public class CartItem {
    private Item item;
    private int quantity;

    public CartItem(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public Item getItem() { return item; }
    public int getQuantity() { return quantity; }

    public void addQuantity(int qty) {
        this.quantity += qty;
    }

    public int getTotalPrice() {
        return item.getPrice() * quantity;
    }
}
