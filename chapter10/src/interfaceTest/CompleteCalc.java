package interfaceTest;

// extends는 구현체를 상속한다는 의미이고
// 구현되지 않은 추상 메소드를 사용해야 할 시점이다.
public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0) {
			return num1 / num2;
			}
		return ERROR;
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하겠습니다.");
		}

}
