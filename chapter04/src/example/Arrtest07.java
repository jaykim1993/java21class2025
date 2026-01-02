package example;

import java.util.Arrays;
import java.util.Random;

public class Arrtest07 {

	public static void main(String[] args) {
		int[] answer = {1, 3, 4, 2, 5};
		
		// hgdwer 값 넣기
		int[] hgdwer = new int[5];
		Random rm = new Random();
		for(int i = 0 ; i<hgdwer.length ; i++) {
			hgdwer[i]= rm.nextInt(5)+1;
		}
		
		// 정답 체크 용 배열 선언
		String[] ox = new String[5];
		// 점수 변수
		int score = 0;
		
		for(int i = 0 ; i<answer.length ; i++) {
			if(answer[i]== hgdwer[i]) {
				ox[i] = "O";
				score += 10;
			}else {
				ox[i] = "X";
			}
		}
		
		// 출력
		System.out.println("정답 = " + Arrays.toString(answer));
		System.out.println("제출답 = " + Arrays.toString(hgdwer));
		System.out.println("정오표 = " + Arrays.toString(ox));
		System.out.println("성적 = " + score + "점");
	}
	
}
