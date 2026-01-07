package ifexample;

import java.util.Scanner;

public class IfEx03 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("성적을 입력하세요(0~100) : ");
	int score = scan.nextInt();
	if(score >= 60) {
		System.out.println("합격");
	} else if (score > 100 || score <0) {
		System.out.println("성적을 잘못 입력하였습니다.");
	} else if (score < 60) {
		System.out.println("불합격");
	}
		
	}

}
