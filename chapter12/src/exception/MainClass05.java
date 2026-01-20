package exception;

public class MainClass05 {
	static MainClass05 dn = new MainClass05();
	public static void main(String[] args) {
		try {
			dn.firstMethod();
		} catch (Exception e) {
			// 에러 구문 1
			e.printStackTrace();
			// 에러 구문 2
			System.out.println(e);
			// 에러 구문 3
			System.out.println(e.getMessage());
		}
		System.out.println("예외연습끝");
	}
	
	public void firstMethod() throws Exception {
		secondMethod();
	};
	public void secondMethod() throws Exception {
		thirdMethod();
	};
	public void thirdMethod() throws Exception {
		System.out.println("(10 / 0) : " + (10/0));
	};
}
