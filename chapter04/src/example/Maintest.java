package example;

public class Maintest {
	public static void main(String[] args) {
		// 아래 예외처리를 하지 않을 경우
		// IndexOutOfBoundException(존재하지 않는 index를 사용했다) 오류 발생
		if(args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0);
		}
		// arg 값 String으로 받았기에
		String strNum1 = args[0];
		String strNum2 = args[1];
		// 객체 데이터 타입을 int로 변환해야 사칙연산 가능
		// 이를 parsing(파싱)이라 한다.
		// String, Integer, Double 를 래퍼클래스라 하며 객체 데이터 타입니다.
		// 문자 데이터를 정수형 데이터 타입으로 변환하기
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.printf("%d + %d = %d", num1, num2, result);
	}
}
