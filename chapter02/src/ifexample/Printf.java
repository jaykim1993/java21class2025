package ifexample;

public class Printf {

	public static void main(String[] args) {
		
		int value = 123;
		System.out.printf("상품의 가격: %d\n", value);
		// 6자리이면서 우측부터 채우기
		System.out.printf("상품의 가격: %6d\n", value);
		System.out.printf("상품의 가격: %06d\n", value);

		String name = "홍길동";
		int age = 30;
		double score = 92.453;
		double sum = 158;
		System.out.printf("이름은 %s이고, 나이는 %d인 학생의 점수는 %.1f입니다.\n 총합의 평균은 %.1f입니다.\n", name, age, score, sum/3);
		
		
		
	}
		
}
//sysf 컨트롤 스페이스 -> 