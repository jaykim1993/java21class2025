package shopMall.teacher;

import java.util.Scanner;

public class UserMenu extends User {
	Scanner scan = new Scanner(System.in);
	int cnt = id.length; // 전체 유저 수 (6)
	static int logindex; // 로그인한 유저 index, 다른 클래스와 공유
	public UserMenu() {}

	// 사용자 로그인 메서드
	public int userLog() {
		int log = super.log; // 부모 User 클래스의 로그인 상태 사용
		System.out.println("ID 입력");
		String myId = scan.next();
		System.out.println("PW 입력");
		String myPw = scan.next();
		
		for(int i=0 ; i<cnt ; i++) {
			if(myId.equals(id[i]) && myPw.equals(pw[i])) {
				log = i; // 로그인 성공 -> 해당 index 저장
			}
		}
		if(log < 0) {
			System.out.println("아이디와 비밀번호를 확인하세요.");
		} else if(log == 0) {
			System.out.println("당신은 관리자 입니다.");
		} else {
			System.out.printf("%s님, 환영합니다.", id[log] );
			logindex = log; // 다른 클래스에서 사용하기 위해 static 수정 후 공유
		}
		return log;
	};

}
//기능