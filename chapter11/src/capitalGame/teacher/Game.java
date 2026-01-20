package capitalGame.teacher;

import java.util.*;

public class Game {
	HashMap<String, String> hashCapital = new HashMap<String, String>();
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	// HashMap은 순서가 존재하지 않고 저장도 순서가 없다.
	
	Game(){
		addNation();
	}

	// 나라 수도 최초 저장하는 메서드 -> 생성자로 최초 로드
	public void addNation() {
		hashCapital.put("한국", "서울");
		hashCapital.put("미국", "워싱턴DC");
		hashCapital.put("중국", "베이징");
		hashCapital.put("프랑스", "파리");
		hashCapital.put("일본", "도쿄");
		hashCapital.put("스페인", "마드리드");
	}
	
	public void gameMenu() {
		boolean run = true;
		System.out.println("*** 수도 맞추기 게임을 시작합니다. ***");
		
		while(run) {
			System.out.println("입력: 1, 퀴즈: 2, 종료: 3 >>");
			int select = scan.nextInt();  // 숫자만 읽고 엔터를 남긴다.(\n)
			switch(select) {
				case 1:
					insertNation();
					break;
				case 2:
					gameStart();
					break;
				case 3:
					System.out.println("게임을 종료합니다.");
					run = false;
					break;
			}
		}
		
	}
	
	public void insertNation() {
		int cnt = hashCapital.size();
		scan.nextLine(); // 이전 입력 버퍼 정리 (\n 제거됨)
		System.out.println("현재 "+ cnt+ "개 나라의 수도가 입력되었습니다.");
		while(true) {
			System.out.println("나라의 수도 입력" + (cnt+1)+ ">>");
			String nation = scan.nextLine();
			// 그만이라 입력하면 삽입 종료
			if(nation.equals("그만")) break;
			// 입력된 문자를 구분자를 기준으로 잘라서 담아주는 클래스
			StringTokenizer st = new StringTokenizer(nation, ", ");
			String na = st.nextToken().trim(); // 나라
			String ca = st.nextToken().trim(); // 수도
			if(hashCapital.containsKey(na)) {
				System.out.println("이미 입력된 나라입니다.");
				continue;
			}
			hashCapital.put(na, ca);
			System.out.println("입력이 완료되었습니다.");
		}
		
	}
	
	public void gameStart() {
		while(true) {
			ArrayList<String> nations = new ArrayList<String>(hashCapital.keySet());
			System.out.println(hashCapital.keySet());
			int index = ran.nextInt(hashCapital.size()); // 0 ~ 해쉬맵 배열의 인덱스 번호까지 랜덤으로 받기
			String question = nations.get(index);
			String answer = hashCapital.get(question);
			
			System.out.println(question + "의 수도는 >>");
			String myAnswer = scan.next();
			
			if(myAnswer.equals("그만")) {
				break;
			}else if(answer.equals(myAnswer)) {
				System.out.println("정답!");
				
			}else {
				System.out.println("오답!");
			}
			
			
		}
	}


}
