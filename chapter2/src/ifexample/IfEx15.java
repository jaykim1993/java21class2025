package ifexample;

import java.util.Random;
import java.util.Scanner;

public class IfEx15 {

	public static void main(String[] args) {

		
		
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		int number = random.nextInt(100)+1;
		
		System.out.printf("문제 [%d]%n", number);
		System.out.println("1. 홀수");
		System.out.println("2. 짝수");
		System.out.print("번호를 선택하세요 : ");
		int inputNum = scan.nextInt();
		scan.close();
		int oddEvenDetector = number%2+1;
		
		if(oddEvenDetector != inputNum) {
			System.out.println("정답!");
		}else {
			System.out.println("오답!");
		}
	}
		
}
