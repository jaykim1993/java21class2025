package classpart01;

public class Ex01 {
	// 클래스는 데이터, 기능만 작성
	// main 메서드는 출력을 담당
	int[] arr = {87, 100, 11, 72, 92};
	
	Ex01(){}
	
	public void ex01() {
		int sum = 0;
		for(int i =0 ; i<arr.length ; i++) {
			sum += arr[i];
		}
		System.out.println("1번답 - " + sum );
	}
	
	public static void main(String[] args) {
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		Ex01 answer01 = new Ex01();
		answer01.ex01();
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3

	}
}
