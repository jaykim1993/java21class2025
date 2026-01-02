package example;

import java.util.*;

public class Arrtest10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			int[] seat = new int[7]; // 빈자리 0 , 찬 자리 1 누적하기
			int price = 12000;
			int totalPrice = 0;
			int peopleNum = 0;
			int seatNum = 0;
			int morethanTwo = 0;
		
		// 프로그램 러닝 상태 판별
			boolean run = true;
		// 예매 가능 판별
			boolean memberchk = false;
			boolean seatchk = false;
		// 1. 빈 자리 출력(빈칸)
		// 2. 메뉴 선택
		// 3. 종료 까지 와일문
		
		// 프로그램 조건문
			while(run) {
				// 좌석 출력
				if(!(peopleNum ==1 && seatNum%2 == 0) && memberchk == true && seatchk == true) {
					for(int i = 0 ; i<seat.length ; i++) {
						if(seat[i]==1) {
							System.out.print("[O] ");
						} else {
							System.out.print("[   ] ");
						};
					};
					peopleNum = 0;
					seatNum = 0;
					seatchk = false;
					memberchk = false;
				};
				System.out.println();
				System.out.printf("=== 메가 영화관 ===%n1. 좌석예매%n2. 선택취소%n3. 종료%n");
				System.out.print("메뉴 선택 : ");
				int inputOption = scan.nextInt();
				
				if(inputOption==1) {
					// 인원 선택
						while(memberchk == false) {
							System.out.print("예매 인원을 입력하세요[1~7]");
							peopleNum = scan.nextInt();
							if(peopleNum>7 || 1>peopleNum) {
								System.out.println("인원은 1~7 중에 입력하세요");
							} else {
								memberchk = true;
							};
						};
						if(peopleNum >2) {
							morethanTwo = peopleNum;
							if(morethanTwo % 2 == 0) {
								for(int j = 1; j<morethanTwo/2 ; j++) {
									morethanTwo -= 2;
									
									
								};
							};
						};
						while(seatchk == false) {
							System.out.print("좌석번호 선택[1~7]");
							seatNum = scan.nextInt();
							if(seatNum>7 || 1> seatNum) {
								System.out.println("좌석은 1~7 중에 입력하세요");
							} else {
								seatchk = true;
							};
						};

						// 예매 조건문
						// 1명이 짝수열 선택시
						if(peopleNum == 1 && seatNum%2==0) {
							System.out.println("짝수 예매 불가능");
							memberchk = false;
							seatchk = false;
							for(int i = 0 ; i<seat.length ; i++) {
								if(i == (seatNum-1)) {
									System.out.print("[X] ");
								} else if(seat[i]==1) {
										System.out.print("[O] ");
								}else if(seat[i]==0 && i%2==1){
									System.out.print("[X] ");
								}else {
									System.out.print("[  ] ");
								};
							};
							System.out.println();
						} else {
							// 1명 이상이 예매 선택 시
							for(int i = 0 ; i<seat.length ; i++) {
								// 선택되어있는 좌석 선택 시
								if((seatNum <=(i+1) && (i+1) < seatNum+peopleNum) && seat[i]==1) {
									System.out.println("이미 예매가 완료된 자리입니다.");
									peopleNum = 0;
									// 7자리 이상의 연속 된 자리 선택 시
								}else if((seatNum <=(i+1) && (i+1) < seatNum+peopleNum )&& seat[i]==0) {
									if(seatNum+peopleNum-1>7) {
										System.out.println("예매가 불가합니다.");
									} else {
										seat[i] = 1;
										totalPrice += price;
									}
								};
							};
						};
				};
				
				// 전체 초기화
				 if(inputOption == 2) {
					 for(int i = 0 ; i<seat.length ; i++) {
							seat[i]=0;
					 };
					 memberchk = true;
					 seatchk = true;
				 };
				 
				// 프로그램 종료
					if(inputOption==3) {
						run = false;
					};
	
			}
			
		// 프로그램 종료
			System.out.println("============");
			System.out.printf("총 매출액 : %d원%n", totalPrice);
			scan.close();
	}
}
