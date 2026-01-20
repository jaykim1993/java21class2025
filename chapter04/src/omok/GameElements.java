package omok;

public class GameElements {
	// 바둑판
	String[][] board = new String[13][13]; 
	// 플레이어 - 1 or 2
	int player;

	public GameElements() {
		for(int i = 0; i<board.length ; i++) {
			for(int j = 0 ; j<board.length ; j++) {
				board[i][j] = "-";
			}
		}
	}
	
}
