package example;

import java.util.Arrays;

public class ArrEx01 {

	public static void main(String[] args) {
//		문제1) 10부터 50까지 arr 배열에 저장
//		정답1) 10 20 30 40 50
		int[] arr = new int[5];
		int value;
		for(int i = 0 ; i<arr.length ; i++) {
			value = (i+1)*10;
			arr[i] = value;
		}
		System.out.println(Arrays.toString(arr));
		
//		문제2) 4의 배수만 출력
//		정답2) 20 40
		for(int i = 0 ; i<arr.length; i++) {
			if(arr[i]%4 == 0) {
				System.out.println(arr[i]);
			}
		}
//		문제3) 4의 배수의 합 출력
//		정답3) 60
		int sum = 0;
		for(int i = 0 ; i<arr.length; i++) {
			if(arr[i]%4 == 0) {
				sum += arr[i];
			}
		}
		System.out.println(sum);
		
//		문제4) 4의 배수의 개수 출력
//		정답4) 2
		int cnt = 0;
		for(int i = 0 ; i<arr.length; i++) {
			if(arr[i]%4 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
//		문제5) 짝수의 개수 출력
//		정답5)
		int cntEven = 0;
		for(int i = 0 ; i<arr.length; i++) {
			if(arr[i]%2 == 0) {
				cntEven++;
			}
		}
		System.out.println(cntEven);
	}

}
