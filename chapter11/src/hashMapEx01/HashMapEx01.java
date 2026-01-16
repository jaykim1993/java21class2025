package hashMapEx01;

import java.util.*;


public class HashMapEx01 {

	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner scan = new Scanner(System.in);
		String input = "";
		String nation = "";
		Integer population = 0;
		
		
		System.out.println("나라 이름과 인구를 입력하세요.(예: korea 5000)");
		while(!input.equals("그만")) {
			System.out.print("나라이름, 인구 >> ");
			input = scan.nextLine();
			StringTokenizer st = new StringTokenizer(input);
			if(!input.equals("그만")) {
				nation = st.nextToken();
				population = Integer.parseInt(st.nextToken());
				nations.put(nation, population);
			}else continue;
		}
		input = "";
		while(!input.equals("그만")) {
			System.out.print("인구 검색 >> ");
			input = scan.next();
			if(nations.containsKey(input)) {
				System.out.printf("%s의 인구는 %s%n", input, nations.get(input));
			}else continue;
		}
		scan.close();
	}



}
