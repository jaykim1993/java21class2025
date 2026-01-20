package diExample;

public class Add implements Ical{

	@Override
	public int doOper(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	// 더하기 함수를 모듈화
	// 자바는 느슨한 결합이 기본이기에 부품화(모듈화)한다.


}
