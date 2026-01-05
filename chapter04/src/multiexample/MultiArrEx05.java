package multiexample;

import java.util.Scanner;

public class MultiArrEx05 {
	public static void main(String[] args) {
		int[][] apt = {
				{101, 102, 103},
				{201, 202, 203},
				{301, 302, 303}
				};
		int[][] pay = {
				{1000, 2100, 1300},
				{4100, 2000, 1000},
				{3000, 1600, 800}
				};
		Scanner scan = new Scanner(System.in);
		System.out.print("호실을 입력하세요 : ");
		int roomNum = scan.nextInt();
		int compare = 0;
		int roomMost = 0;
		int roomLess = 0;
		for(int i = 0 ; i <apt.length ; i++) {
			for(int j = 0 ; j <apt[i].length ; j++) {
				if(apt[i][j] == roomNum ) {
					System.out.printf("%d호 관리비 : %d원%n",roomNum,  pay[i][j]);
				}
			}
		}
		
		for(int i = 0 ; i <apt.length ; i++) {
			for(int j = 0 ; j <apt[i].length ; j++) {
				if(pay[i][j] >= compare) {
					compare = pay[i][j];
					roomMost = apt[i][j];
				}
			}
		}
		System.out.printf("가장 많이 나온 집 : %d 호 : %d원%n",roomMost, compare);
		for(int i = 0 ; i <apt.length ; i++) {
			for(int j = 0 ; j <apt[i].length ; j++) {
				if(pay[i][j] <= compare) {
					compare = pay[i][j];
					roomLess = apt[i][j];
				}
			}
		}
		
		System.out.printf("가장 적게 나온 집 : %d 호 : %d원%n",roomLess, compare);
		

	}
}
