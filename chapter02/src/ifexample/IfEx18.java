package ifexample;

import java.util.Scanner;

public class IfEx18 {

	public static void main(String[] args) {
		
				Scanner scan = new Scanner(System.in);
				System.out.println("이용할 정거장 수를 입력하세요 : ");
				int input = scan.nextInt();
				scan.close();
				int fare= 0;
				if(input<=5) {
					fare = 500;
				} else if (input>5 && input<=10) {
					fare = 600;
				} else if(input>10) {
					fare = 600;
					int fareRullCnt = (input-9) /2;
					fare += fareRullCnt*50;
				};
				System.out.printf("요금 = %d원%n", fare);
				
	};
}
