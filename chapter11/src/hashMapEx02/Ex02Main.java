package hashMapEx02;

import java.util.*;



public class Ex02Main {

	public static void main(String[] args) {
		HashMap<String, Location> cityLo = new HashMap<String, Location>();
		
		Scanner scan = new Scanner(System.in);
		int inputCnt = 1;
		
		while(inputCnt<5) {
			System.out.println("도시, 경도, 위도를 입력하시오.");
			System.out.print(">> ");
			String input = scan.nextLine();
			StringTokenizer st = new StringTokenizer(input, ",- ");
			String city = st.nextToken();
			Integer latitude = Integer.parseInt(st.nextToken());
			Integer longitude = Integer.parseInt(st.nextToken());
			Location lo = new Location(city, latitude, longitude);
			cityLo.put(city, lo);
			inputCnt++;
		}
		System.out.println("-----------------------------------------");
		for(String key : cityLo.keySet()) {
			System.out.printf("%s %d %d%n", 
					key, 
					cityLo.get(key).getLatitude(), 
					cityLo.get(key).getLongitude());
		}
		System.out.println("-----------------------------------------");
		while(true) {
			System.out.print("도시 이름 >> ");
			String input = scan.next();
				if(cityLo.containsKey(input)) {
					System.out.printf("%s %d %d%n", 
							input, 
							cityLo.get(input).getLatitude(), 
							cityLo.get(input).getLongitude());
				}
				else if(input.equals("그만"))break;
				else if(!cityLo.containsKey(input)) {
					System.out.println(input + "는 없습니다.");
				}
			}
		System.out.println("정보 검색 종료");
		scan.close();
	}


}
