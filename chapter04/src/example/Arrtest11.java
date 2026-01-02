package example;

import java.util.*;

public class Arrtest11 {

	public static void main(String[] args) {
		int[] arr = {90,23,67,100,34};
		int[] ascArr = new int[arr.length]; // 1,2,3오름차순
		int ascRemover = 0;
		int[] descArr = new int[arr.length]; // 3,2,1 내림차순
		int descBuilder=arr[0];
		
		for(int i = 0; i<arr.length ; i++) {
			// [i] 값 상승

			for(int j = 0 ; j<arr.length ; j++) {
				// 비교 후 가장 큰&작은 값 [i] 에 부여
				if(ascArr[i]>arr[j]) {
					ascArr[i] = arr[j];
					ascRemover = j;
				}
				
			}
		}
		System.out.println(Arrays.toString(ascArr));
	}
}
