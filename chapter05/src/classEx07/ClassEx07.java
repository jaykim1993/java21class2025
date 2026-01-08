package classEx07;

public class ClassEx07 {
	// 멤버 변수
	int[] arPrice = { 2500, 3800, 1500, 1000};
	String[] arMenu = {"치즈버거", "불고기버거", "감자튀김", "콜 라"};
	int[] arCount = new int[4]; //각 메뉴별 개수
	int total = 0;
	String name;
	
	// 디폴트 생성자
	ClassEx07 () {};
	
	// 기능 메서드
	
	// 화면에 출력한다.
	public void randerItems() {
		System.out.println("\n["+name+"]");
		for(int i = 0 ; i<arPrice.length ; i++) {
			System.out.printf("%d. %-15s%5d원%n", i+1,  arMenu[i], arPrice[i]);
		}
		System.out.println("-----------------------");
		System.out.println("5. 주문하기");
		System.out.print("주문하기 : ");
	}
	
	// 카트 담는다
	public void addCart(int sel) {
		arCount[sel]++;
		System.out.println(arMenu[sel] + " 추가됨");
	}
	
	// 총금액 계산
	public void calcTotal() {
		total = 0;
		for(int i = 0 ; i<arMenu.length ; i++) {
			total += (arPrice[i]*arCount[i]);
		}
	}
	
	// 주문 유무 확인
	public boolean hasOrder() {
		for(int i = 0 ; i<arMenu.length ; i++) {
			if(arCount[i]>0) {
				return true;
			}
		}
		return false;
	}
	// 영수증 출력
	public void printReceipt(int money) {
		System.out.println("=== 영수증 출력 ===");
		System.out.println("매장명  : " + name);
		System.out.println("-----------------------");
		System.out.println("메뉴\t수량\t금액");
		for(int i = 0 ; i<arMenu.length ; i++) {
			if(arCount[i] > 0) {
				System.out.println(arMenu[i] + "\t" + arCount[i] + "\t" + (arPrice[i]*arCount[i]));
			}
		}
		System.out.println("-----------------------");
		System.out.println("총 금액 : " + total + "원");
		System.out.println("받은 금액 : " + money + "원");
		System.out.println("거스름돈 : " + (money-total) + "원");
		System.out.println("-----------------------");
		
	}
}
