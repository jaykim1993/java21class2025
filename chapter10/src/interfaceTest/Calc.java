package interfaceTest;

// 인터페이스(interface)

	// ▪ 모든 메서드가 추상 메서드(abstract method)로 이루어진 클래스
	// ▪ 형식적인 선언만 있고 구현은 없다
		//java 7 버전 이전에는 구현코드가 있는 메소드가 존재할 수 없었다.
		// java 8 버전 이후에는 구현코드가 있는 메소드가 존재함을 주의.
public interface Calc {
	
	// 인터페이스에서 멤버 변수는 final 상수로만 지정되며 자동 지정된다.
	public static final double PI = 3.14;
	int ERROR = -999999; // 컴파일될때 상수로 전환됨(final 화 자동)
	
	// 인터페이스에서 선언한 메소드는 컴파일 과정에서 추상메소드로 변환됨
	public abstract int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	
	
// 버젼 업 이후 접근 가능 메서드 예제
	
	// 디폴트 메서드 : 
		// 기본 구현을 가지는 메서드로, 
		// 구현코드에서 재정의 할 수 있음
		default void description() {
			System.out.println("점수 계산기를 구현합니다.");
			myMethod();
		}

	// 정적 메서드 : 
		// 인스턴스 생성 없이 
		// 인터페이스 이름으로 직접 호출하는 메서드
		static int total(int[] arr) {
			int total = 0;
			for(int i=0 ; i<arr.length ; i++) {
				total += arr[i];
			}
			myStaticMethod();
			return total;
		}
	
	// private 메서드 : 
		// 인터페이스 내부에서만 사용 가능, 
		// 구현한 클래스에서 사용하거나 재정의 할 수 없음
		// private 메서드는 default 메서드에서 사용 가능
		private void myMethod() {
			System.out.println("private 메서드 입니다.");
		}
		// private static 메서드는 
		// static 메서드에서 사용 가능
		private static void myStaticMethod() {
		System.out.println("myStaticMethod 메서드 입니다.");
		}

}

// ▪ 인터페이스에 선언된 모든 변수는 public static final로 상수 이다.
// ▪ 인터페이스에 선언된 모든 메서드는 public abstract 로 추상 메서드 이다.
// ▪ 인터페이스는 인스턴스화 할 수 없다.


// JDBC는 자바에서 데이터베이스를 사용하기 위한 표준 인터페이스이며,
// Connection → PreparedStatement → ResultSet 구조로 동작한다.