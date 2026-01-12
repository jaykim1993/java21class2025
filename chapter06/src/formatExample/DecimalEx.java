package formatExample;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DecimalEx {

	public static void main(String[] args) {
		// DecimalFormat 클래스는 예약어 new로 객체를 생성하여 사용한다.
		// Decimal = 십진수란 뜻, 다양한 십진수 출력값 세팅을 위해 사용
		// 0 = 숫자 0으로 출력, # = 0을 공백으로 출력, 단 앞부분이 공백이면 공백으로 출력
		
		Scanner scan = new Scanner(System.in);
		int number ;

		DecimalFormat num1 = new DecimalFormat("0,000");
		DecimalFormat num2 = new DecimalFormat("#,###"); // 출력 이렇게 권장
		DecimalFormat num3 = new DecimalFormat("#,###%");
		DecimalFormat num4 = new DecimalFormat("#,##0.#"); // 출력 이렇게 권장
		DecimalFormat num5 = new DecimalFormat("0,000.00");
		DecimalFormat num6 = new DecimalFormat("\u00A4#,###");
		DecimalFormat num7 = new DecimalFormat("￦#,###");

		 System.out.println("값을 입력하시오");
		number = scan.nextInt();

		 //천단위마다 구분기호 ,(콤마)를 출력 단, 0은 0으로 출력
		System.out.println(num1.format(number));
		 //천단위마다 구분기호 ,(콤마)를 출력 단, #은 공백으로 출력
		System.out.println(num2.format(number));
		 //백분율로 출력 단 1200이면 => 120,000%
		System.out.println(num3.format(number));
		 //소수 둘째자리에서 반올림하여 첫째자리까치 출력 단, #은 공백으로 출력
		System.out.println(num4.format(number));
		 //소수 세째자리에서 반올림하여 둘째자리까치 출력 단, 0은 0으로 출력
		System.out.println(num5.format(number));
		 //통화기호 \ 출력
		System.out.println(num6.format(number));
		System.out.println(num7.format(number));
		scan.close(); 

	}

}
