package multiexample;

import java.util.Scanner;

public class MultiArrEx04 {
	public static void main(String[] args) {
		int[][] pay = {
				{1000, 2100, 1300},
				{4100, 2000, 1000},
				{3000, 1600, 800}
				};
		int total = 0;
		for(int i = 0 ; i <pay.length ; i++) {
			total = 0;
			for(int j = 0 ; j <pay[i].length ; j++) {
				total += pay[i][j];
			}
			System.out.print(total + " ");
		}
	}
}
