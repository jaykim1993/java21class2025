package itemList;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ItemList {

    private ArrayList<Item> items = new ArrayList<>();
    DecimalFormat df = new DecimalFormat("###,###");
    
    public ItemList() {
        items.add(new Item("과일", "복숭아", 1000));
        items.add(new Item("과일", "사과", 1500));
        items.add(new Item("과일", "바나나", 1800));
        items.add(new Item("과일", "망고", 2300));

        items.add(new Item("육류", "돼지갈비", 10000));
        items.add(new Item("육류", "소갈비", 18000));
        items.add(new Item("육류", "떡갈비", 8000));
        items.add(new Item("육류", "닭가슴살", 2000));

        items.add(new Item("야채", "시금치", 2000));
        items.add(new Item("야채", "파", 1500));
        items.add(new Item("야채", "양송이", 2300));
        items.add(new Item("야채", "부추", 3000));
    }

    public void showItems() {
        System.out.println("\n===== 상품 목록 =====");
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            System.out.printf("%d%5s%10s%10s원\n",
            	    i,
            	    item.getCategory(),
            	    item.getName(),
            	    df.format(item.getPrice())
            	);
        }
    }

    public Item getItem(int index) {
        return items.get(index);
    }

    public int size() {
        return items.size();
    }
}
