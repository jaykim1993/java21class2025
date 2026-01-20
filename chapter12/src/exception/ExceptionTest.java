package exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int i = 0;
			int j = 0;
			int[] iarr = new int[5];
			List<Integer> list = new ArrayList<Integer>();
			
			try {
				System.out.println("input i : ");
				i = scan.nextInt();
				System.out.println("input j : ");
				j = scan.nextInt();
				System.out.println("i / j : " + (i/j));
				
				for(int k=0 ; k<6 ; k++) {
					System.out.println("iarr["+k+"]" + iarr[k]);
				}
				System.out.println("list size : " + list.size());
			} catch(InputMismatchException e) {
				e.printStackTrace(); 
				// 예외구문 1.
				// 예외 종류 : 구문 + 상세 위치까지 출력
//				java.util.InputMismatchException
//				at java.base/java.util.Scanner.throwFor(Scanner.java:947)
//				at java.base/java.util.Scanner.next(Scanner.java:1602)
//				at java.base/java.util.Scanner.nextInt(Scanner.java:2267)
//				at java.base/java.util.Scanner.nextInt(Scanner.java:2221)
//				at exception.ExceptionTest.main(ExceptionTest.java:19)
				System.out.println("숫자를 입력하세요");
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
				
				// 예외구문 2.
				// 예외종류 : 구문 출력
				// java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
				
			} catch(ArithmeticException e) {
				System.out.println(e.getMessage());
				// 예외구문 3.
				// 구문만 출력
				// Index 5 out of bounds for length 5 와 같은 구문만 출력됨
			}  finally {
				System.out.println("end");
			}
		}
	}
	// Exception 최상위 클래스는 catch 구문 작성 시 
	// 하위 예외 클래스를 못 읽게 하므로
	// 필요하다면 가장 하위 (finally 바로 전)에 놓는다.
	// 예외는 반드시 구체적인 예외 → 범용 예외 순서로 작성해야 합니다.
}
