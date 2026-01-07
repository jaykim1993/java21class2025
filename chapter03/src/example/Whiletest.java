package example;

public class Whiletest {

	public static void main(String[] args) {
		// while(조건)문은 괄호안의 조건을 만족하는동안
		// 'loop'를 돌린다.(반복한다.)
		// 조건이 'false'가 되면 'loop'를 빠져나간다.
		
//		int num = 1;
//		int sum = 0;
//		while(num <=10) {
//			sum += num;
//			System.out.printf("%d 까지의 합계 : %d%n", num, sum);
//			num++;
//		}
//		System.out.println("while문 탈출 후 num 값 : " + num);
//		
//		while(true) {
//			sum+= num;
//			num++;
//			if(num == 14) break; // 루프를 빠져나온다.
//		}
//		System.out.println(sum);
		
		// 문제1) 10~1 까지 반복해서 6~3까지 거꾸로 출력
		int num = 10;
		while(num>=1) {
			if(num<=6&&num>=3) {
				System.out.print(num);
			}
			num--;
		}
		
	}
	
}
