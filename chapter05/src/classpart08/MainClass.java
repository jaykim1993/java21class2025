package classpart08;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		ClassEx08 newe = new ClassEx08();
		Scanner scan = new Scanner(System.in);
		System.out.print("x : ");
		int x = scan.nextInt();
		System.out.print("y : ");
		int y = scan.nextInt();
		scan.close();
		System.out.println("더하기 = " + newe.plus(x,y));
		System.out.println("빼기 = " + newe.minus(x,y));
		System.out.println("곱하기 = " + newe.multi(x,y));
		System.out.println("나누기 = " + newe.divide(x,y));
		
	}

}
