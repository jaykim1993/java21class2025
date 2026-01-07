package example;

import java.util.Scanner;

public class LoopEx04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		while(run == true) {
			System.out.print("숫자를 입력하세요 : ");
			int input = scan.nextInt();
			
			if(input == -100) {
				System.out.println("루프종료");
				scan.close();
				run = false;
			}
		}

	}
	
}
