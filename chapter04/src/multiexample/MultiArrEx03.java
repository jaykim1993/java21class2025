package multiexample;

import java.util.Scanner;

public class MultiArrEx03 {
	public static void main(String[] args) {
		int[][] arr = {
				{101, 102, 103, 104},
				{201, 202, 203, 204},
				{301, 302, 303, 304}
				}; 
		int sumRow = 0;
		
		System.out.println("가로합 : ");
		for(int i = 0 ; i<arr.length ; i++) {
			sumRow = 0;
			for(int j = 0 ; j<arr[i].length ; j++) {
				sumRow += arr[i][j];
			}
			System.out.print(sumRow + " ");
		}
		System.out.println();
		
		int sumCu = 0;
		System.out.println("세로합 : ");
		for(int i = 0 ; i<arr[0].length ; i++) {
			sumCu = 0;
			for(int j = 0 ; j<arr.length ; j++) {
				sumCu += arr[j][i];
			}
			System.out.print(sumCu + " ");
		}
		System.out.println();
		
		
		
//		문제 2) 세로 합 출력
//		정답 2) 603, 606, 609, 612
		int[] sumCul =new int[4];
		System.out.println("세로합 : ");
		for(int i = 0 ; i<arr.length ; i++) {
			for(int j = 0 ; j<arr[i].length ; j++) {
				sumCul[j] += arr[i][j];
			}
		}
		for(int i = 0; i < sumCul.length ; i++) {
			System.out.print(sumCul[i]+ " ");
		}
		System.out.println();
	}
}
