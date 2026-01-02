package example;

import java.util.*;


public class Arrtest04 {

	public static void main(String[] args) {
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores = { 87, 11, 45, 98, 23};
		Scanner scan = new Scanner(System.in);
		System.out.print("학번 입력 : ");
		int inputHakbun = scan.nextInt();
		scan.close();
		
		for(int i = 0 ; i<hakbuns.length ; i++) {
			if(hakbuns[i] == inputHakbun) {
				System.out.println("성적 : " + scores[i] + "점");
			}
		}
		
	}
	
}
