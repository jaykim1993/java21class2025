package classpart10;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ClassEx10 ex10 = new ClassEx10();
		
		System.out.println("=== 메가IT 고등학교===");
		System.out.println("1. 전교생 성적확인");
		System.out.println("2. 1등학생 성적확인");
		System.out.println("3. 꼴등학생 성적확인");
		System.out.println("4. 학번입력 성적확인");
		System.out.println("5. 종료하기");
		

		boolean run = true;
		while(run) {
			System.out.println(".....................................");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			System.out.println(".....................................");
			switch(sel) {
			case 1 : // 전교생
				for(int i = 0; i< ex10.arScore.length ; i++) {
					System.out.printf(
										"%d. %d학번 ----- %d점%n",
										i+1,  
										ex10.arHakbun[i],  
										ex10.arScore[i]
									);
				}
				break;
				
			case 2 : // 1등
				System.out.printf(
									"1등 학생 : %d학번 ----- %d점%n", 
									ex10.arHakbun[ex10.scoreMax()], 
									ex10.arScore[ex10.scoreMax()]
								);
				break;
				
			case 3 : // 꼴등
				System.out.printf(
									"꼴등 학생 : %d학번 ----- %d점%n",
									ex10.arHakbun[ex10.scoreMin()], 
									ex10.arScore[ex10.scoreMin()]
								);
				break;
				
			case 4: // 학번 입력
			    while(true) {
			        System.out.print("학번 입력: ");
			        int hakbun = scan.nextInt();
			        int idx = ex10.scoreScan(hakbun); // 학번 입력 후 매서드 판별 식 돌고 idx 받기

			        if(idx == -1) {
			            System.out.println("해당 학번이 없습니다. 다시 입력하세요.");
			        } else {
			            System.out.printf(
						            		"학번: %d ----- %d점%n",
						            		ex10.arHakbun[idx], 
						            		ex10.arScore[idx]
			            				);
			            break; 
			        }
			    }
			    break;
			    
			case 5 : // 종료하기
				System.out.println("프로그램 종료");
				run = false;
				break;
				
			default: // 예외처리
				System.out.println("0 - 5 중 입력하세요.");
			}
		}

		scan.close();
	}

}
