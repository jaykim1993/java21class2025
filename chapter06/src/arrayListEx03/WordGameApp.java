package arrayListEx03;

import java.util.*;

public class WordGameApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "아버지"; // 초기값 아버지
		char inputA = ' ';
		char inputZ = ' ';
		inputA = input.charAt(0);
		inputZ = input.charAt(input.length()-1);
		boolean run =true;

		ArrayList<Player> player= new ArrayList<>();
		
		
		System.out.println("==  끝말잇기 2026  ==");
		System.out.print("참가자 수를 입력하세요: ");
		int num = scan.nextInt();
		
        for(int i = 0; i < num; i++) {
            System.out.print((i+1) + "번 참가자 이름 : ");
            String name = scan.next();
            Player a = new Player();   // 여기서 새 객체 생성
            a.name = name;
            player.add(a);
        }
		System.out.println("-----------------");
		System.out.println("게임을 시작합니다");
		System.out.println("첫 단어 : " + input);
		
		while(run) {
			
			for(int i = 0 ; i<player.size() ; i++) {
				// 값 받기
				Player n = player.get(i); //ArrayList에서 원하는 idx의 값 받기 = get
				System.out.print(n.name + " >> ");
				input = scan.next();
				// 판별식
				if(inputZ==input.charAt(0)) {
					inputA = input.charAt(0);
					inputZ = input.charAt(input.length()-1);
				}else{
					System.out.println("-----------------");
					System.out.println("!!!!!오답!!!!!");
					System.out.println("루저 : " + n.name);
					run = false;
					return;
				}
			}// for 종료
			
		} // while 종료
		scan.close();
	}

}
