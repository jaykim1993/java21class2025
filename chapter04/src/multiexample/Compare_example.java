package multiexample;

public class Compare_example {

	public static void main(String[] args) {
		// compareTo() 매서드는 String pool 과 전혀 상관없이
		// 문자열의 문자 코드 만을 비교한다.
		// 한글의 경우 유니코드, 영어의 경우 아스키코드
		// A.compareTo(B)
		// A와 B가 같으면 0
		// A가 B보다 사전적으로 앞 순서면 음수
		// A가 B보다 사전적으로 뒷 순서면 양수
		// 서로 다른 문자인 경우 해당 문자의 아스키코드의 차이를 출력한다.
		
		String str1 = "가";
		String str2 = "나";
		String str3 = "가";

		int rs1 = str1.compareTo(str2);
		System.out.println(rs1);
		int rs2 = str2.compareTo(str1);
		System.out.println(rs2);
		int rs3 = str1.compareTo(str3);
		System.out.println(rs3);
	}

}
