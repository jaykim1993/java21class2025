package omok2;

import java.util.Scanner;

public class Game extends GameElements {

    Scanner scan = new Scanner(System.in);
    boolean run = true;

    // 메뉴 메서드
    public void menu() {
        while(run) {
            System.out.println("[오목]");
            System.out.println("[1]게임 시작");
            System.out.println("[2]전적 확인");
            System.out.println("[0]종료");
            System.out.println("-----------------");
            System.out.print("메뉴 선택: ");

            int menu = scan.nextInt();

            switch(menu) {
                case 1:
                    playgame();
                    break;
                case 2:
                    showRecord();
                    break;
                case 0:
                    run = false;
                    System.out.println("시스템 종료");
                    break;
            }
        }
    }

    // 전적 출력
    public void showRecord() {
        System.out.println("플레이어1 승: " + player1Win + " 패: " + player1Lose);
        System.out.println("플레이어2 승: " + player2Win + " 패: " + player2Lose);
    }

    // 게임 시작 메소드
    public void playgame() {
        System.out.println("오목 게임 시작 (플레이어1: 흑돌, 플레이어2: 백돌)");
        setCheckboard();

        boolean gameRunning = true;
        int turn = 1; // 1 = 흑돌, 2 = 백돌

        while(gameRunning) {


            if(turn == 1) {
                System.out.println("플레이어1(●) 차례");
            } else {
                System.out.println("플레이어2(○) 차례");
            }

            System.out.print("세로(1-13, 기권[0]) : ");
            int row = scan.nextInt();
            if(row == 0) {
            	System.out.printf("플레이어%d님이 기권하셨습니다.%n", turn);
            	if(turn == 1) {
                    System.out.println("플레이어2 승리!");
                    System.out.println();
                    player2Win++;
                    player1Lose++;
            	}
            	if(turn == 2) {
                    System.out.println("플레이어1 승리!");
                    System.out.println();
            		player1Win++;
            		player2Lose++;
            	}
                gameRunning = false;
                break;
            	
            }
            System.out.print("가로(1-13, 기권[0]) : ");
            int column = scan.nextInt();
            if(column == 0) {
            	System.out.printf("플레이어%d님이 기권하셨습니다.%n", turn);
            	if(turn == 1) {
                    System.out.println("플레이어2 승리!");
                    System.out.println();
                    player2Win++;
                    player1Lose++;
            	}
            	if(turn == 2) {
                    System.out.println("플레이어1 승리!");
                    System.out.println();
            		player1Win++;
            		player2Lose++;
            	}
                gameRunning = false;
                break;
            	
            }

            // 범위 체크
            if(!isCheckPosition(row, column)) {
                System.out.println("오목판을 벗어났습니다. 다시 입력하세요.");
                continue;
            }

            // 중복 체크
            if(!checkerboard[row-1][column-1].equals("┼")) {
                System.out.println("이미 돌이 놓여진 자리입니다.");
                continue;
            }

            // 돌 놓기
            if(turn == 1) {
                placeStone1(row, column);
            } else {
                placeStone2(row, column);
            }
            printCheckerboard();
            // 승리 체크
            if(fiveRowCheck()) {
                printCheckerboard();
                if(turn == 1) {
                    System.out.println("플레이어1 승리!");
                    System.out.println();
                    player1Win++;
                    player2Lose++;
                } else {
                    System.out.println("플레이어2 승리!");
                    System.out.println();
                    player2Win++;
                    player1Lose++;
                }
                gameRunning = false;
                break;
            }

            // 턴 변경
            if(turn == 1)turn = 2;
            else if(turn ==2) turn = 1;
        }
    }
}
