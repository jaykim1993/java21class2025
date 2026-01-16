package capitalGame;

import java.util.*;

public class RunMain {

	public static void main(String[] args) {
		HashMap<String, String> capitalMap = new HashMap<String, String>();
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Game rusia = new Game("모스크바");
		Game korea = new Game("서울");
		Game australia = new Game("캔버라");
		Game usa = new Game("워싱턴 DC");
		Game france = new Game("파리");
		Game germany = new Game("베를린");
		Game philipnenes = new Game("마닐라");
		Game japan = new Game("도쿄");
		capitalMap.put("러시아", rusia.getCapital());
		capitalMap.put("한국", korea.getCapital());
		capitalMap.put("호주", australia.getCapital());
		capitalMap.put("미국", usa.getCapital());
		capitalMap.put("프랑스", france.getCapital());
		capitalMap.put("독일", germany.getCapital());
		capitalMap.put("필리핀", philipnenes.getCapital());
		capitalMap.put("일본", japan.getCapital());
		
//		for(String key : capitalMap.keySet()) {
//			System.out.println(capitalMap.get(key));
//		}
//		파리
//		베를린
//		워싱턴 DC
//		도쿄
//		서울
//		모스크바
//		캔버라
//		마닐라
		
		System.out.println("수도 맞추기 게임을 시작합니다. **");
		while(true) {
			System.out.print("입력 : 1, 퀴즈 : 2, 종료 : 3 >> ");
			int select = scan.nextInt();
			if(select == 1) {
			    while(true) {
			        System.out.printf("현재 %d개의 나라의 수도가 입력되어 있습니다.%n", capitalMap.size());
			        System.out.printf("나라와 수도 입력 [%d] >> ", capitalMap.size()+1);
			        String input = scan2.nextLine();
			        if(input.equals("그만")) break;
			        StringTokenizer st = new StringTokenizer(input, " ");
			        String country = st.nextToken();
			        String capital = st.nextToken();
			        if(capitalMap.containsKey(country)) {
			            System.out.println("이미 입력된 나라입니다.");
			        } else {
			            capitalMap.put(country, capital);
			            System.out.println("나라가 입력되었습니다.");
			        }
			    }
			}
			else if(select == 2) {
				for(String key : capitalMap.keySet()) {
					System.out.printf("%s의 수도는?", key);
					String answer = scan.next();
					if(answer.equals("그만")) break;
					if(capitalMap.get(key).equals(answer)) {
						System.out.println("정답!");
						continue;
					}
					else{
						System.out.println("오답!");
						continue;
					}
					
				}
			}
			else if(select == 3) {
				System.out.println("게임을 종료합니다.");
				return;
			}
			else System.out.println("잘못된 입력입니다.");
		}
		
		

	}
	
	public void addCountry() {
		
	}
}
