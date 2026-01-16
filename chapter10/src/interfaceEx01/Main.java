package interfaceEx01;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Buyable> itemList = new ArrayList<>();
		itemList.add(new Television("MV-2020", "TV-samsung", 509000));
		itemList.add(new Refrigerator("RF-2026", "1등급", 2000000));
		NumberFormat num = NumberFormat.getInstance();
		
		for(Buyable b : itemList) {
		    System.out.printf("---%s 정보---%n", b.getName());
		    System.out.printf("메이커 : %s%n", b.getMaker());
		    System.out.printf("모델명 : %s%n", b.getModel());
		    System.out.printf("금액 : %s%n", num.format(b.getPrice()));
		    System.out.println("------------------");
		}
	}

}
