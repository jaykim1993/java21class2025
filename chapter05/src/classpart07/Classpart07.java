package classpart07;

import java.util.Scanner;

public class Classpart07 {
	Scanner scan = new Scanner(System.in);
	//============================================
	// 멤버변수(전역)
		String name = "";
		String[] arAcc = {"1111", "2222", "3333", "4444", "5555","","","","",""};
		String[] arPw = {"1234", "2345", "3456", "4567", "5678","","","","",""};
		int[] arMoney = {87000, 34000, 17500, 98000, 12500,0,0,0,0,0};
		int count = 5;
		int loginCheck = -1;
		String state = "";
		int select;
		String userid;
		String userpw;
		int userBalance;
	//============================================
	// 디폴트 생성자
		Classpart07 (){};
	//============================================
	// 매서드
		// 서브 매서드
			// 초기화면 돌아가기
			public void backToMain() {
				 	System.out.println();
				    System.out.println("엔터를 누르면 메인으로 돌아갑니다.");
				    scan.nextLine();
				    scan.nextLine();  // 버퍼 제거용
			}
		
			// 정보 초기화
			public void resetAll() {
			        userid = "";
			        userpw = "";
			        userBalance = 0;
					 state = "로그아웃";
					 loginCheck = -1;
			}
		//==========================================
		// 랜더링 매서드
			// 계좌정보 출력
			public void renderInfo() {
				 System.out.println("----------------------------");
				 System.out.println("계좌번호	비밀번호	 계좌잔액");
				 System.out.println("----------------------------");
				 for(int i = 0 ; i<count ; i++) {
						 System.out.printf("%-12s%-11s%-12d%n",arAcc[i],arPw[i],arMoney[i]);
				 }
				 System.out.println("----------------------------");
			}
		
			// 버튼 출력
			public void renderOption() {
				 System.out.printf("상태 : %s%n", state);
				 System.out.println("----------------------------");
				 System.out.println("[1] 회원가입");
				 System.out.println("[2] 로그인");
				 System.out.println("[3] 로그아웃");
				 System.out.println("[4] 입금");
				 System.out.println("[5] 이체");
				 System.out.println("[6] 잔액조회");
				 System.out.println("[0] 종료");
				 System.out.println("----------------------------");
				 System.out.println();
				 System.out.print("선택 : ");
				 select = scan.nextInt();
			}
		//==========================================
		// 옵션별 매서드
			
			// 회원가입
			public void signup() {
				 	System.out.println("----------------------------");
				    System.out.println("** 회원가입 **");
			        System.out.println();
				    if (loginCheck != -1) {
				        System.out.println("로그아웃 후 이용하세요");
				        backToMain();
				        return;
				    }
		
				    while (true) { // 가입 성공할 때까지 반복
				        System.out.print("계좌번호 : ");
				        userid = scan.next();
				        boolean isDuplicate = false;
		
				        for (int i = 0; i < count; i++) {
				            if (arAcc[i].equals(userid)) {
				                System.out.println("중복 계좌가 존재합니다.");
				                isDuplicate = true;
				                break;
				            }
				        }
				        if (isDuplicate) { // 중복 존재하면 상단으로
				            continue; 
				        }
				        // 중복 아니면 가입 진행
				        arAcc[count] = userid;
				        System.out.print("비밀번호 : ");
				        userpw = scan.next();
				        arPw[count] = userpw;
				        System.out.print("입금액 : ");
				        userBalance = scan.nextInt();
				        arMoney[count] = userBalance;
						System.out.println("----------------------------");
				        System.out.println(userid+"님, 가입을 축하합니다");
				        count++;
				        resetAll();
				        backToMain();
				        break;
				    }
			}
	
			// 로그인
			public void login() {
				    state = "로그아웃";
					System.out.println("----------------------------");
				    System.out.println("** 로그인을 진행합니다 **");
				    System.out.println();
				    while (true) {
				        System.out.print("계좌번호 : ");
				        userid = scan.next();
		
				        System.out.print("비밀번호 : ");
				        userpw = scan.next();
		
				        boolean login = false;
		
				        for (int i = 0; i < arAcc.length; i++) {
				            if (userid.equals(arAcc[i]) && userpw.equals(arPw[i])) {
				       		 	System.out.println("----------------------------");
				                System.out.println("로그인 성공");
						        System.out.printf("현재 잔액 : %d원%n", arMoney[i]);
				                state = userid + "님, 안녕하세요";
				                userBalance = arMoney[i];
				                loginCheck = i;
				                login = true;
				                break;
				            }
				        }
		
				        if (login) {
				        	backToMain();
				        	break;
				        } else {
				            System.out.println("입력정보를 확인하세요");
				            // 다시 while 처음으로 돌아감
				        }
				    }
			}
	
			// 로그아웃
			public void logout() {
			    System.out.println("----------------------------");
			    if(loginCheck == -1) {
			        System.out.println("** 현재 로그아웃 상태입니다. **");
			    } else {
			        System.out.println("** 로그아웃 되었습니다. **");
			        resetAll();
			    }
			    backToMain();
			}
	
			// 입금
			public void deposit() {
				 System.out.println("----------------------------");
				 System.out.println("** 입금하기 **");
				 System.out.println();
				 while(true) {
					 if(loginCheck == -1) {
						 System.out.println("로그인 후 이용 가능합니다.");
						 backToMain();
						 break;
					 } else {
						 System.out.print("입금액 : ");
						 int deposit = scan.nextInt();
						 if(deposit <= 0) {
							    System.out.println("입금 금액은 0원보다 커야 합니다.");
							    continue;
							}
						 for(int i = 0 ; i<arAcc.length ; i++) {
							 if(userid.equals(arAcc[i])) {
								 arMoney[i] += deposit;
								 System.out.println("----------------------------");
						         System.out.println("입금이 완료되었습니다.");
						         System.out.printf("현재 잔액 : %d원%n", arMoney[i]);
							 }
						 }
						 backToMain();
						 break;
					 }
				 }
			}
		
			// 이체
			public void transfer() {
				 System.out.println("----------------------------");
		         System.out.println("** 이체하기 **");
		         System.out.println();
			     if (loginCheck == -1) {
			         System.out.println("로그인 후 이용 가능합니다.");
			         backToMain();
			         return;
			     }
			     while (true) {
			         System.out.print("상대 계좌 : ");
			         String toAcc = scan.next();
			         int toIndex = -1;
			         int myIndex = -1;
		
			         // 계좌별 인덱스 찾기
			         for (int i = 0; i < count; i++) {
			             if (userid.equals(arAcc[i])) {
			                 myIndex = i;
			             }
			             if (toAcc.equals(arAcc[i])) {
			                 toIndex = i;
			             }
			         }
		
			         // 상대 계좌 없을때
			         if (toIndex == -1) {
			             System.out.println("존재하지 않는 계좌입니다. 다시 입력하세요.");
			             continue; 
			         }
			         // 자기 자신에게 이체 방지
			         if (myIndex == toIndex) {
			             System.out.println("본인 계좌로는 이체할 수 없습니다.");
			             continue;
			         }
		
			         System.out.print("이체할 금액 : ");
			         int transferMoney = scan.nextInt();
			         // 이체 금액 관련 예외 처리
			         if (transferMoney <= 0) {
			             System.out.println("이체 금액은 0원보다 커야 합니다.");
			             continue;
			         }
			         if (arMoney[myIndex] < transferMoney) {
			             System.out.println("잔액이 부족합니다.");
			             continue;
			         }
			         // 이체
					 System.out.println("----------------------------");
			         arMoney[myIndex] -= transferMoney;
			         arMoney[toIndex] += transferMoney;
			         System.out.println("이체가 완료되었습니다.");
			         System.out.printf("현재 잔액 : %d원%n", arMoney[myIndex]);
			         backToMain();
			         break;   
			     }
			}
	
			// 잔액조회
			public void balance() {
				 System.out.println("----------------------------");
				 System.out.println("** 잔액 조회 **");		
		         System.out.println();
				 while(true) {
					 if(loginCheck == -1) {
						 System.out.println("로그인 후 이용 가능합니다.");
						 backToMain();
						 break;
					 } else {
						 for(int i = 0 ; i<arAcc.length ; i++) {
							 if(userid.equals(arAcc[i])) {
								 userBalance = arMoney[i];
							 }
						 }
						 System.out.printf("계좌 잔액 : %d%n", userBalance);
						 backToMain();
						 break;
					 }
				}
			}
		//==========================================
	//============================================
}
