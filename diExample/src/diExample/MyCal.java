package diExample;

public class MyCal {
	// 1. 계산기 클래스 만들어 계산 메서드 내부에 생성
	// 2. 부품화
	// 3. 공통 인터페이스 도입
	// 4. DI(의존성 객체 주입)
	
	public void cal(int num1, int num2, Ical ical) {
		int result = ical.doOper(num1, num2);
		System.out.println("result : " + result);
	}
//	public void add(int num1, int num2, Ical ical) {
//		int result = ical.doOper(num1, num2);
//		System.out.println("result : " + result);
//	}
//	public void sub(int num1, int num2, Ical ical) {
//		int result = ical.doOper(num1, num2);
//		System.out.println("result : " + result);
//	}
//	public void mul(int num1, int num2, Ical ical) {
//		int result = ical.doOper(num1, num2);
//		System.out.println("result : " + result);
//	}
//	public void div(int num1, int num2, Ical ical) {
//		int result = ical.doOper(num1, num2);
//		System.out.println("result : " + result);
//	}
	
	
}

//의존성을 주입하는 외부 클래스 역할