package methodClass;

public class ReturnClass {
		// void로 메소드 작성 시 값을 반환할 수 없다.
		public void Returnint() {
			int k = 10;
		}
		
		// 데이터 타입으로 메소드 작성 시 반드시 값을 반환해야 한다.
		public String ReturnString() {
			// return이란 값을 호출한 곳으로 반환하여 줌
			return "자바";
		}
		
		public static void main(String[] args) {
			ReturnClass re = new ReturnClass();
			re.Returnint(); // 값을 반환하지 않았기 때문에 출력 불가
			String reS = re.ReturnString(); // 반환된 값 "자바"를 reS라는 변수에 지정
			System.out.println(reS);
		}
}
