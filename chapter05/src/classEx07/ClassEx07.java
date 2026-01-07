package classEx07;

public class ClassEx07 {
	// 멤버 변수
	int[] arPrice = { 2500, 3800, 1500, 1000};
	String[] arMenu = {"치즈버거", "불고기버거", "감자튀김", "콜 라"};
	int[] arCount = new int[4]; //각 메뉴별 개수
	int total = 0;
	
	// 생성자
	ClassEx07 () {}
	
	// 기능 메서드
	// 화면에 출력한다.
	public void randerItems() {
		for(int i = 0 ; i<arPrice.length ; i++) {
			System.out.printf("%d. %s       %d원%n", i,  arMenu[i], arPrice[i]);
		}
		System.out.println("-----------------------");
	}
	
	// 카트 담는다 + 총액 계산한다
	public void addCart(int selectA) {
		arCount[selectA]++;
	}
	// 입금받고 잔돈 계산한다
	public void calTotal() {}
	
}
