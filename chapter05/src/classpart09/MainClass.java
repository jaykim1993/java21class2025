package classpart09;

public class MainClass {

	public static void main(String[] args) {
		int[] student = new int[5];
		ClassEx09 ex = new ClassEx09();
		System.out.print("학생점수 = ");ex.test(student);
		
		System.out.printf("학생 총점 = %d점%n", ex.total(student));
		
		System.out.printf("전체 평균 =  %.1f점%n", ex.avg(student));
		
		System.out.printf("1등 점수 = %d점%n", ex.highest(student));
		
		System.out.printf("꼴등 점수 = %d점%n", ex.lowest(student));
		

	}

}
