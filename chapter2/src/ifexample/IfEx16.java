package ifexample;

import java.util.Random;
import java.util.Scanner;

public class IfEx16 {

	public static void main(String[] args) {
		

		
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		// 150~250  난수 생성
		int randomNum = random.nextInt(100)+150; 
		System.out.printf("문제 =%d%n가운데 숫자를 입력하세요 : ", randomNum);
		// 인풋값 저장
		int inputNum = scan.nextInt();
		scan.close();
		 // 가운데 숫자 추출
		int midnumOfrandomNum = (randomNum % 100) / 10;
		
		// 판별식
		if(midnumOfrandomNum== inputNum) { 
			System.out.println("정답!");
		}else {
			System.out.println("오답!");
		}
	}

}
