package ifexample;

import java.util.Random;
import java.util.Scanner;

public class IfEx19 {

	public static void main(String[] args) {
		Random random = new Random();
		// 1~10 난수 2개 생성
		int rn1 = random.nextInt(10)+1;
		int rn2 = random.nextInt(10)+1;
		// 연산자 번호 난수
		int calTypeNum = random.nextInt(4)+1;
		// 결과
		int result = 0;
		// 조건문
		if(calTypeNum==1) {
			result = rn1 + rn2;
		} else if(calTypeNum==2) {
			result = rn1 - rn2;
		} else if(calTypeNum==3) {
			result = rn1 * rn2;
		} else if(calTypeNum==4) {
			result = rn1 %  rn2;
		};
		
		System.out.printf("%d ? %d = %d%n", rn1, rn2, result);
		System.out.println("1)+  2)-   3)*  4)%");
		System.out.printf("번호를 선택하세요 : ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();
		
		if(calTypeNum == input) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
		
	};
}
