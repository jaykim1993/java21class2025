package multiexample;

import java.util.Scanner;

public class MultiArrEx02 {
	public static void main(String[] args) {
//		문제5> 2차원배열 기본문제[1단계]
		int[][] arr = new int[3][3];
		int value = 10;
		for(int i = 0 ; i<arr.length ; i++) {
			for(int j = 0 ; j<arr[i].length ; j++) {
				arr[i][j] = value;
				System.out.print(arr[i][j]+ " ");
				value+=10;
			}
			System.out.println();
		}
		Scanner scan = new Scanner(System.in);
		System.out.print("인덱스 1 입력 : ");
		int idx1 = scan.nextInt();
		System.out.print("인덱스 2 입력 : ");
		int idx2 = scan.nextInt();
		int answer05 = arr[idx1][idx2];
		System.out.println("문제 5 : " + answer05);
		
		
		System.out.print("교체할 index1 입력 : ");
		int change1 = scan.nextInt();
		System.out.print("교체할 index2 입력 : ");
		int change2 = scan.nextInt();
		int answer06 = arr[change1][change2];
		
		for(int i = 0 ; i<arr.length ; i++) {
			for(int j = 0 ; j<arr[i].length ; j++) {
				if(i == idx1 && j == idx2) {
					arr[i][j] = answer06;
				}else if(i == change1 && j == change2) {
					arr[i][j] = answer05;
				}
				System.out.print(arr[i][j]+ " ");
			}
		System.out.println();
		}
		scan.close();
	}
}
