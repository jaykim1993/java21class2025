package example;

import java.util.*;


public class Arrtest02 {

	public static void main(String[] args) {
		String[] names = {"홍길동", "개나리", "진달래", "김백합", "최동훈"};
		int[] scores = new int[names.length];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0 ; i < names.length ; i++) {
			System.out.print(names[i]+"의 점수를 입력하세요 : ");
			scores[i] =  scan.nextInt();
		}
		scan.close();
		System.out.println("----------------------");
		
		int sumScore = 0;
		double avrScore = 0;
		for(int i = 0 ; i < names.length ; i++) {
			System.out.println(names[i]+"의 점수 : " + scores[i]);
			sumScore += scores[i];
		}
		avrScore = sumScore/names.length;
		System.out.println("----------------------");
		System.out.println("평균 : " + avrScore);
	}
	
}
