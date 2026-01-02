package example;

import java.util.Arrays;

public class Arrtest {

	public static void main(String[] args) {
		// 배열 선언 방법 
		//	int[] arr = new int[3];
		//	int arr [] = new int[3];
		
		// 초기값 존재하는 배열 선언 방법
		// int[] arr 01 = new int[]{1,2,3};
		// int[] arr01 = new int[3]{1,2,3}; <- 오류
		// int [] arr01 = {1,2,3}; 권장 방식
	
		// 배열의 특징
		// 1. 배열은 고정길이다.
		// 2. 배열은 자동으로 길이를 늘리고 줄일 수 없다.
		// 3. 배열은 생성과 동시에 메모리를 한번에 할당한다.
		// 4. 배열은 중간에 값을 비울 수 없다.
		// 5. 배열은 단순한 자료구조이므로 가변기능은 컬렉션이 담당한다.
		int[] arr = new int[3];
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
			// 정수형 배열의 초기값 미지정시 0이 기본값
		}
		
		double[] douArr = new double[3];
		for(int j = 0 ; j<douArr.length ; j++) {
			System.out.println(douArr[j]);
			// 실수형 배열의 초기값 미지정시 0.0이 기본값
		}
		
		String[ ] strArr = new String[3];
//		String[ ] strArr = {"뭐", null, "아"};
		System.out.println("배열 길이 : " + strArr.length); // 배열 길이
		System.out.println("배열 요소 값 : " + Arrays.toString(strArr)); // 배열 요소 값
		System.out.println("배열 레퍼런스 주소 : " + strArr); // 배열 레퍼런스 주소(16진수)
		// 객체 배열의 요소 복사 : Arrays.copyOf(복사할대상, 복사할 대상의 길이)
		String[] strArr01 = null;
		
		strArr01 = Arrays.copyOf(strArr,strArr.length);
		System.out.println(Arrays.toString(strArr01));
		System.out.println(strArr01); // 주소 다른 strArr01에 같은 값이 담겨있다.
		strArr01 = strArr; // strArr을 01에 직접 넣음(같은 주소의 같은 객체가 됨)
		System.out.println(strArr01); // strArr과 레퍼런스 주소 같다.
		
		for(int k = 0 ; k<strArr.length ; k++) {
			if(strArr[k]== null) { // 'null'은 객체가 아니어서 'equals'로 비교할 수 없다.
				System.out.println("난 배열값");
			}else {
				System.out.println(strArr[k]);
			}
			// 객체 배열의 초기값 미지정시 'null'이 기본값
		}
	}

}
