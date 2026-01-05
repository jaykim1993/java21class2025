package multiexample;

public class MultiArrEx01 {
	public static void main(String[] args) {
//		문제1> 2차원배열 기본문제[1단계]
		int[][] arr01 = new int[3][3];
		int value01 = 10;
		for(int i = 0 ; i<arr01.length ; i++) {
			for(int j = 0 ; j<arr01[i].length ; j++) {
				arr01[i][j] = value01;
				System.out.print(arr01[i][j]+ " ");
				value01+=10;
			}
			System.out.println();
		}
		
//		<문제2> 2차원배열 기본문제[1단계]
		int[][] arr02 = new int[3][3];
		int value02 = 10;
		int total02 = 0;
		for(int i = 0 ; i<arr02.length ; i++) {
			for(int j = 0 ; j<arr02[i].length ; j++) {
				arr02[i][j] = value02;
				total02 += value02;
				value02+=10;
			}
		}
		System.out.println("2번답 : " + total02);
		
		
//		<문제3> 2차원배열 기본문제[1단계]
			value01 = 10;
			int total03 = 0;
			int add03 = 0;
			for(int i = 0 ; i<arr01.length ; i++) {
				for(int j = 0 ; j<arr01[i].length ; j++) {
					arr01[i][j] = value01;
					if(value01%4 == 0) {
						System.out.print(arr01[i][j]+ " ");
						total03 += value01;
						add03++;
					}
					value01+=10;
				}
			}
			System.out.println();
			System.out.println("3번답 : " + add03);
			System.out.println("4번답 : " + total03);
				

	}
}
