package classpart05;

import java.util.*;

public class ClassEx05 {
	Random rm = new Random();
	int[] answer = {1, 3, 4, 2, 5};
	int[] hgd = new int[5]; // 빈 배열
	String[] ox = new String[5]; // 정답 체크 빈 배열
	int score = 0;
	
	// 디폴트 생성자
	ClassEx05 () {}
	
	// hgd  값 넣기
	public void putRandomValue() {
		for(int i = 0 ; i<hgd.length ; i++) {
			hgd[i]= rm.nextInt(5)+1;
		}
	}

	// 정답 체크 값 넣기
	public void checkOX() {
		for(int i = 0 ; i<answer.length ; i++) {
			if(answer[i]== hgd[i]) {
				ox[i] = "O";
				score += 20;
			}else {
				ox[i] = "X";
			}
		}
	}

	// 출력
	public void renderVariables() {
		System.out.println("정답 = " + Arrays.toString(answer));
		System.out.println("제출답 = " + Arrays.toString(hgd));
		System.out.println("정오표 = " + Arrays.toString(ox));
		System.out.println("성적 = " + score + "점");
	}

}
