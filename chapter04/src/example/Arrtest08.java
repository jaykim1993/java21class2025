package example;

import java.util.*;

public class Arrtest08 {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int[] inputIndex = new int[2];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0 ; i<=1 ; i++) {
			System.out.print("인덱스" + (i+1) + "입력 : ");
			inputIndex[i] = scan.nextInt();
		}
//		System.out.println(Arrays.toString(inputIndex));
		
		for(int i = 0 ; i<arr.length ; i++) {
			for(int j = 0 ; j <inputIndex.length ; j++) {
				if(i == inputIndex[j]) {
					System.out.print("값" + (i+1) + " 입력 : ");
					int newValue = scan.nextInt();
					arr[i] = newValue;
				};
			}
		}
		System.out.println("결과 : " + Arrays.toString(arr));
		scan.close();
		
	}
}
