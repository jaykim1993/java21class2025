package example;

import java.util.*;


public class Arrtest03 {

	public static void main(String[] args) {
		int[] arr = {87, 11, 45, 98, 23};
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("인덱스를 입력하세요 : ");
		int inputIndex = scan.nextInt();
		System.out.println("성적 : " + arr[inputIndex] + "점");
	
		
		System.out.print("성적을 입력하세요 : ");
		int inputScore = scan.nextInt();
		for(int i = 0 ; i<arr.length ; i++) {
			if(arr[i]==inputScore) {
				System.out.println("인덱스 : " + i);
			}
		}
		scan.close();
	}
	
}
