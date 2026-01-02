package example;

import java.util.*;


public class Arrtest05 {

	public static void main(String[] args) {
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores = { 87, 11, 45, 98, 23};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("학번 입력 : ");
		int inputHakbun = scan.nextInt();
		int hakbunChk= -1;
		scan.close();
		
		for(int i = 0 ; i<hakbuns.length ; i++) {
			if(hakbuns[i] == inputHakbun) {
				hakbunChk = i;
			}
		}
		if( hakbunChk != -1) {
			System.out.println("성적 : " + scores[hakbunChk] + "점");
		} else {
			System.out.println("해당학번은 존재하지 않습니다.");
		}
	}
	
}
