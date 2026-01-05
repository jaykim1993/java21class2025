package multiexample;

public class MultiArrtest {
	public static void main(String[] args) {
		// 다차원 배열 선언 및 초기화
		int[][] score = {
				{95, 60},
				{60, 50, 80},
				{100, 75, 85, 68, 59}
		};
		// array.length → 행의 개수
		// array[i].length → i번째 행의 열 개수
		// 열의 길이가 각기 다르기에 
		// 내부 for문의 길이를 score[i].length으로 가져가야함
		for(int i = 0 ; i<score.length ; i++) {
			for(int j = 0 ; j < score[i].length ; j++) {
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
