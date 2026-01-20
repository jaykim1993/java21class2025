package omok2;

public class GameElements {
	int player1Win = 0;
	int player1Lose = 0;
	int player2Win = 0;
	int player2Lose = 0;
	
	// 오목판 선언 : 가로 x 세로 13
	String[][] checkerboard = new String[13][13];
	
	// 오목판 크기를 벗어나면 예외처리하는 메소드
	public boolean isCheckPosition(int row, int column) {
		return row>=1 && row<=13 && column>=1 && column<=13;
	}
	
	// 게임시작 직후 -> 한판이 끝나고 새 게임 시작할 때
	public void setCheckboard() {
		for(int i = 0 ; i<checkerboard.length ; i++) {
			for(int j=0; j<checkerboard[i].length ; j++) {
				checkerboard[i][j] = "┼";
			}
		}
	}
	// 오목판 출력 -> 돌 놓을때
	public void printCheckerboard() {
	    System.out.println();
	    for(int i = 0 ; i<checkerboard.length ; i++) {
	        for(int j=0; j<checkerboard[i].length ; j++) {
	            System.out.print(checkerboard[i][j] );
	        }
	        System.out.println();
	    }
	    System.out.println();
	}
	// 플레이어1 -> 흑돌
	public void placeStone1(int row, int column) {
		checkerboard[column-1][row-1]="●";
	}
	// 플레이어2 -> 백돌
	public void placeStone2(int row, int column) {
		checkerboard[column-1][row-1]="○";
	}
	
	// 오목 기본 요건 →,↓,↘,↗ -> 승리요건 (가로, 세로, 대각선이 돌이 연속 5개면 승) 
	public boolean fiveRowCheck() {

	    for (int i = 0; i < 13; i++) {
	        for (int j = 0; j < 13; j++) {
	            String stone = checkerboard[i][j];
	            if (!stone.equals("●") && !stone.equals("○")) continue;

	            // → 가로
	            if (j + 4 < 13 &&
	                stone.equals(checkerboard[i][j+1]) &&
	                stone.equals(checkerboard[i][j+2]) &&
	                stone.equals(checkerboard[i][j+3]) &&
	                stone.equals(checkerboard[i][j+4])) {
	                return true;
	            }

	            // ↓ 세로
	            if (i + 4 < 13 &&
	                stone.equals(checkerboard[i+1][j]) &&
	                stone.equals(checkerboard[i+2][j]) &&
	                stone.equals(checkerboard[i+3][j]) &&
	                stone.equals(checkerboard[i+4][j])) {
	                return true;
	            }

	            // ↘ 대각선
	            if (i + 4 < 13 && j + 4 < 13 &&
	                stone.equals(checkerboard[i+1][j+1]) &&
	                stone.equals(checkerboard[i+2][j+2]) &&
	                stone.equals(checkerboard[i+3][j+3]) &&
	                stone.equals(checkerboard[i+4][j+4])) {
	                return true;
	            }

	            // ↗ 대각선
	            if (i - 4 >= 0 && j + 4 < 13 &&
	                stone.equals(checkerboard[i-1][j+1]) &&
	                stone.equals(checkerboard[i-2][j+2]) &&
	                stone.equals(checkerboard[i-3][j+3]) &&
	                stone.equals(checkerboard[i-4][j+4])) {
	                return true;
	            }
	        }
	    }
	    return false;
	}

}
