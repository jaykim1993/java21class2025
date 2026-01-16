package abstractTest;

public class FinalTest {
	class define{
		// Final 예약어
		// 값이 변경될 수 없는 상수이다.
		// final 클래스 상속되지 않는다.
		public static final int MIN = 1;
		public static final int MAX = 9999;
		public static final int ENG = 1001;
		public static final int MATH = 2001;
		public static final double PI = 3.14;
		public static final String GOOD_MORNIG = "Good Mornig";
	}
	
	public static void main(String[] args) {

        System.out.println(define.GOOD_MORNIG);
        System.out.println("영어과목 코드는" + define.ENG + "입니다.");
        System.out.println("수학과목 코드는" + define.MATH + "입니다.");
//        define.PI = 3.1; 처럼 재할당 안됨
        double num = define.PI * 1000;
        System.out.println(num);
	}

}
