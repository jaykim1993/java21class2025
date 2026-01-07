package methodClass;

import java.util.Scanner;

public class Return03 {
	int num1 = 10;
	int num2 = 20;
	public void test02() {
		if(num1>=num2) {
			System.out.println("크다");
		}
		// 반환하지 않는 함수에 return 사용하면 즉시 종료
		return;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Return03 r = new Return03();
		
		while(true) {
			System.out.println("메뉴출력");
			int sel = scan.nextInt();
			if(sel == 1) {
				r.test02();
			} else {
				System.out.println("종료");
				return; // while문 강제 종료
			}
		}
	}
}
