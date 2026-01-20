package omok;

import java.util.Scanner;

public class Game extends GameElements{
	Scanner scan = new Scanner(System.in);
	boolean runProgram = true;
	boolean runGame = false;
	boolean turn = true;
	int selecMenu;
	int lose1;
	int lose2;
	// 오목 로직

	
	// 메뉴 메서드
	public void menu() {
		while(runProgram) {
			runGame = false;
			turn = true;
		System.out.println("[오목_2026_ver1.1]");
		System.out.println("[1]게임 시작");
		System.out.println("[2]전적 확인");
		System.out.println("[0]종료");
		System.out.println("-----------------");
		System.out.print("메뉴 선택: ");
		selecMenu = scan.nextInt();
		
			if(selecMenu==1) {
				runGame = true;
				game();
			}
			
			else if(selecMenu==2) {
				runGame = false;
				showResult();
			}
			
			else if(selecMenu==0) {
				System.out.println("프로그램 종료");
				runProgram = false;
			}
			
			else{
				System.out.println("입력을 확인하세요");
			}
		}
		
	}
	
	
	// 게임 메서드
	public void game() {
		while(runGame) {
			System.out.println();
			System.out.println("오목 게임 시작 (플레이어1 : 흑돌, 플레이어2 : 백돌)");
			System.out.println();
			
			while(turn) {
			    for(player = 1; player <= 2; player++) {
				        

				        
				        System.out.printf("플레이어%d 차례 - 놓을 위치 선택%n", player);
				        System.out.print("세로(1-13, 기권:0) : ");
				        int inputA = scan.nextInt();
				        if(inputA == 0) {
				            System.out.println("플레이어" + player + "님이 기권하였습니다.");
				            stopGame();
				            return;  // 게임 종료
				        }

				        System.out.print("가로(1-13, 기권:0) : ");
				        int inputB = scan.nextInt();
				        if(inputB == 0) {
				            System.out.println("플레이어" + player + "님이 기권하였습니다.");
				            stopGame();
				            return;   // 게임 종료
				        }

				        if(inputA < 1 || inputA > 13 || inputB < 1 || inputB > 13) {
				            System.out.println("다시 선택하세요");
				            player -= 1;   
				            continue; // 같은 플레이어 다시 선택
				        }

				        int a = inputA - 1;
				        int b = inputB - 1;

				        if(!board[a][b].equals("-")) {
				            System.out.println("다시 선택하세요");
				            player -= 1;  
				            continue; // 같은 플레이어 다시 선택
				        }
				        board[a][b] = pebble(player); // 돌 입력 완료, 다음 턴 진행
				    	// 보드 출력
				        for(int i=0; i<board.length; i++) {
				            for(int j=0; j<board[i].length; j++) {
				                System.out.print(board[i][j] + " ");
				            }
				            System.out.println();
				        }
				        gameOver();
				        if(!turn) return;
				}
			}
		}// runGame while 종료
	}
	// 돌 반환 메서드
	public String pebble(int player) {
		String pebble = "";
		if(player == 1)pebble ="●";
		else if(player == 2)pebble = "○";
		return pebble;
	}
	
	
	// 승부 판단 메서드
	public void gameOver() {
		// 가로
	    for(int i = 0; i < board.length; i++) {
	        int stonecounter = 1;
	        for(int j = 0; j < board[i].length - 1; j++) {
	            if(board[i][j].equals("○") || board[i][j].equals("●")) {
	                if(board[i][j].equals(board[i][j+1])) {
	                    stonecounter++;
	                } else stonecounter = 1;
	                if(stonecounter == 5) {
	                	stopGame2();
	                    return;
	                }
	            } else stonecounter = 1;
	        }
	    }

	    // 세로
	    for(int i = 0; i < board[0].length; i++) {
	        int stonecounter = 1;
	        for(int j = 0; j < board.length - 1; j++) {
	            if(board[j][i].equals("○") || board[j][i].equals("●")) {
	                if(board[j][i].equals(board[j+1][i])) {
	                    stonecounter++;
	                } else stonecounter = 1;
	                if(stonecounter == 5) {
	                	stopGame2();
	                    return;
	                }
	            } else stonecounter = 1;     
	        }
	    }
	 // 대각선 \
	    for(int i = 0; i < board[0].length - 4; i++) {
	        for(int j = 0; j < board.length - 4; j++) {

	            int stonecounter = 1;

	            for(int k = 0; k < 4; k++) {
	                if(board[j][i].equals("○") || board[j][i].equals("●")) {
	                    if(board[j + k][i + k].equals(board[j + k + 1][i + k + 1])) {
	                        stonecounter++;
	                    } else {
	                        break;
	                    }
	                }
	            }

	            if(stonecounter == 5) {
	                stopGame2();
	                return;
	            }
	        }
	    }

	 // 대각선 / 방향 검사
	    for (int i = 0; i < board[0].length - 4; i++) {          // 열
	        for (int j = 4; j < board.length; j++) {            // 행 (아래쪽부터 시작)
	            if (!board[j][i].equals("○") && !board[j][i].equals("●")) continue;

	            int stonecounter = 1;

	            for (int k = 0; k < 4; k++) {
	                if (board[j - k][i + k].equals(board[j - k - 1][i + k + 1])) {
	                    stonecounter++;
	                } else {
	                    break;
	                }
	            }

	            if (stonecounter == 5) {
	                stopGame2();
	                return;
	            }
	        }
	    }
	}

	
	// 게임종료 메서드
	public void stopGame() {
    	if(player ==1) lose1++;
    	else if(player ==2) lose2++;
        turn = false;
        runGame = false;
        System.out.println();
	}
	public void stopGame2() {
    	System.out.println();
    	System.out.println("**** 게임종료 ****");
        System.out.println("플레이어" + player + " 승리");
		System.out.println("*****************");
		System.out.println();
    	if(player ==1) lose2++;
    	else if(player ==2) lose1++;
        turn = false;
        runGame = false;
        showResult();
	}
	
	// 승패 출력 메서드
	public void showResult() {
		System.out.println();
		System.out.println("**** 전적 확인 ****");
		System.out.printf("플레이어 1 : %d승 %d패%n",lose2, lose1);
		System.out.printf("플레이어 2 : %d승 %d패%n",lose1, lose2);
		System.out.println("*****************");
		System.out.println();
	}
	
}
