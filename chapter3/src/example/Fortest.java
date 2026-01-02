package example;

public class Fortest {

	public static void main(String[] args) {
//		int i = 0;
//		for ( ; i<=5 ; i++) {
//			if(i==3) {
////				break; // 조건에 만족하는 경우, 루프를 탈출한다(반복문 종료)
//				continue; // 조건에 만족하는 경우, 반복문 내 실행없이 다음 조건의 실행으로 넘어간다.(해당 반복 생략 및 이후 진행)
//			}
//			System.out.println(i);
//		}
//		System.out.println("루프탈출 : " + i);

//		다중 for 문
		for(int j = 1; j<=5 ; j++ ) {
			for(int k =1 ; k<=3 ; k++) {
				if(k==3) {
					break;
				}
				System.out.printf("j = %d,  k = %d%n",j,k);
			}
//			System.out.println("부모 루프" + j);
		}
		System.out.println("루프탈출");
	}
	

}
