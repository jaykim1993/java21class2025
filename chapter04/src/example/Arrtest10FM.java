package example;

import java.util.*;

public class Arrtest10FM {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 영화 예매 프로그램 규칙 정리
		// 좌석 상태 값 정의
		// 0 : 비어있는 좌석 [  ]
		// 1 : 현재 선택중인 좌석 [O]
		// 2 : 예매 완료된 좌석 [X]
		// 3 : 예매 불가 좌석 [ ! ]
		//좌석 10개로 배열 지정
			int[] seat = new int[10]; 
		// 전체 예매 인원 수
			int cnt = 0;
		// 프로그램 실행 여부를 제어하는 변수
			boolean run = true;
		// 메인 메뉴 선택
			while(run) {
				System.out.println("= 메가 영화관 =");
				System.out.println("1. 좌석예매");
				System.out.println("2. 종료");
				System.out.println("3. 초기화");
				System.out.print("메뉴선택 : ");
				int sel = scan.nextInt();
				// 1. 좌석 예매 ============
					if(sel == 1) {
						for (int i = 0 ; i<seat.length ; i++) {
							if(seat[i] == 0 )  System.out.print("[  ]");
							else if(seat[i] == 3 ) {
								seat[i] = 0;
								System.out.print("[  ]");
							}
							else if( seat[i] == 1 || seat[i] == 2)  {
								seat[i] = 2;
								System.out.print("[X]");
							}
						};
						System.out.println();
						System.out.print("예매 인원을 입력하세요 [1~8]");
						int inwon = scan.nextInt(); // 입력한 인원 수
						// 예매 인원 유효성 검사
							if(inwon >= 1 && inwon <= 8) {
								// 1명 예매 규칙 - 짝수 좌석은 선택 불가 [ ! ] => 3 / 홀수 좌석만 예매 가능
									if(inwon == 1) {
										for (int i = 0 ; i<seat.length ; i++) {
											// 배열은 인덱스가 0부터 시작하므로 홀수 좌석 선택불가로 설계
											if(i%2 == 1 && seat[i]==0) {
												seat[i] = 3;
											};
										}
										// 현재 좌석 상태 출력
										for (int i = 0 ; i<seat.length ; i++) {
											if(seat[i] == 0)  System.out.print("[  ]");
											else if(seat[i] == 2)  System.out.print("[X]");
											else if(seat[i] == 3)  System.out.print("[ ! ]");
											else  if(seat[i] == 1)System.out.print("[O]");
										};
										System.out.println();
//										System.out.println(Arrays.toString(seat));
										System.out.print("좌석번호 선택 [1~10]");
										int idx = scan.nextInt()-1; // 인덱스는 0부터 시작하므로 최소 입력받을때 번호 맞춤
										// 이미 선택좌석 예외처리
											if(seat[idx] == 2) {
												System.out.println("이미 예매된 좌석입니다.");
											}
											// 짝수 좌석 선택 시
											else if(seat[idx]==3 && idx % 2 != 0 ) {
												System.out.println("예매 불가능");
											} 
											// 정상 예매
											else if(seat[idx]==0){
												seat[idx] = 1; // 선택 상태 [O]
												System.out.println("예매 완료");
												cnt++;
											}
											// 선택 후 좌석 출력
											for (int i = 0 ; i<seat.length ; i++) {
												if(seat[i] == 0)  System.out.print("[  ]");
												else if(seat[i] == 2)  System.out.print("[X]");
												else if(seat[i] == 3)  System.out.print("[ ! ]");
												else  if(seat[i] == 1)System.out.print("[O]");
											};
											System.out.println();
									} else if (inwon >= 2) {
										// 현재 선택한 인원 수 를 담는 변수
										int selectCnt = 0;
										while(selectCnt < inwon) {
											System.out.println("좌석번호 선택 [1~10]");
											int idx1 = scan.nextInt()-1;
											if(idx1<0 || idx1 >=10) {
												System.out.println("좌석번호 오류");
												continue;
											}
											// selectCnt의 인원 중 1명이 남았을 경우
											// 전체 인원중 아직 선택되지 않은 사람이 1명일 경우
											if(inwon-selectCnt == 1) {
													// 이미 선택되었거나, 예매 완료된 좌석이면 선택불가 예외처리
													if(seat[idx1] == 1 || seat[idx1] == 2) {
														System.out.println("선택 불가한 좌석입니다.");
														continue;
													}
													// 해당 좌석을 [O]로 바꾸기
													seat[idx1] = 1;
													// 전체 예매인원수 누적
													cnt++;
													// 현재 선택완료된 인원수 1명 증가
													selectCnt++;
													for (int i = 0 ; i<seat.length ; i++) {
														if(seat[i] == 0)  System.out.print("[  ]");
														else if(seat[i] == 2)  System.out.print("[X]");
														else if(seat[i] == 3)  System.out.print("[ ! ]");
														else  if(seat[i] == 1)System.out.print("[O]");
													};
												System.out.println();
											} else {
												// 두명 이상 남았을 경우
													if(seat[idx1] == 1 || seat[idx1] == 2 || seat[idx1+1] == 1 || seat[idx1+1] == 2 || idx1 >=9) {
														System.out.println("선택 불가한 좌석입니다.");
														continue;
													} else {
														seat[idx1] = 1;
														seat[idx1+1]=1;
														// 전체 예매인원수 누적
														cnt+=2;
														// 현재 선택완료된 인원수 1명 증가
														selectCnt+=2;
													};
													for (int i = 0 ; i<seat.length ; i++) {
														if(seat[i] == 0)  System.out.print("[  ]");
														else if(seat[i] == 2)  System.out.print("[X]");
														else if(seat[i] == 3)  System.out.print("[ ! ]");
														else  if(seat[i] == 1)System.out.print("[O]");
													};
												System.out.println();
											};
										}
									
								};
								
							} else {
								System.out.println("예매 인원을 확인하세요");
							};

					} else if(sel == 2) {
						
						// 총매출액 계산
						int total = cnt*12000;
						System.out.printf("인원수 : %d 명%n", cnt);
						System.out.printf("매출액 : %d 원%n", total);
						// 프로그램 종료
						run = false;
						System.out.println("프로그램 종료");
					}else if(sel == 3) {
						 for(int i = 0 ; i<seat.length ; i++) {
								seat[i]=0;
								cnt = 0;
						 };
					};
				
			}
			scan.close();
	}
}
