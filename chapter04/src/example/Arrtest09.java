package example;

import java.util.*;

public class Arrtest09 {

	public static void main(String[] args) {
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores = { 87, 45, 11,  98, 23};
		int[] inputHakbuns = new int[2];
		
		Scanner scan = new Scanner(System.in);
		for(int j = 0 ; j<inputHakbuns.length ; j++) {
			System.out.print("학번" + (j+1) + "입력 : ");
			inputHakbuns[j] = scan.nextInt();
		};


//		System.out.println(Arrays.toString(inputHakbuns));
		
		for(int i = 0 ; i<scores.length ; i++) {
			for(int j = 0 ; j <inputHakbuns.length ; j++) {
				if(hakbuns[i] == inputHakbuns[j]) {
					System.out.print("학번" + hakbuns[i] + " 새 점수 입력 : ");
					int newValue = scan.nextInt();
					scores[i] = newValue;
				};
			}
		}
		System.out.println("결과 : " + Arrays.toString(scores));
		scan.close();
		
	}
}
