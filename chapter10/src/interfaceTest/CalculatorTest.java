package interfaceTest;

public class CalculatorTest {

	public static void main(String[] args) {
		
		
		int num1 = 10;
		int num2 = 0;
		// 인터페이스는 인스턴스화 할 수 없으나 업캐스팅 가능
		Calc calc = new CompleteCalc();
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		// showInfo()는 Calc이 아닌 CompleteCalc에 들어있기에
		// 새로 인스턴스화 해야함
		CompleteCalc calc2 = new CompleteCalc();
		calc2.showInfo();
		
		// 인터페이스 private static 접근하기
		calc.description();
		int[] arr = {1,2,3,4,5};
		// 인스턴스 생성 없이 
		// 인터페이스 이름으로 직접 호출하는 메서드
		// static은 상속이 안된다. 그러므로 하위 클래스에서 접근 불가
		int sum = Calc.total(arr);
		System.out.println(sum);
		


		
		
	}

}
