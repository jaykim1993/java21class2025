package hashMapEx02teacher;

import java.util.*;



public class Ex02Main {

	public static void main(String[] args) {

		HashMap<String, Location> cityLo = new HashMap<String, Location>();
		Scanner scan = new Scanner(System.in);
		
		int cnt = 4;
		System.out.println("도시, 경도, 위도를 입력하시오.");
		for(int i=0; i<cnt ; i++) {
			System.out.print(">> ");
			String loca = scan.nextLine();
			StringTokenizer st = new StringTokenizer(loca, ",- ");
			String cityName = st.nextToken().trim();
			// 경도, 위도 숫자 -> 파싱
			Integer latitude = Integer.parseInt(st.nextToken().trim());
			Integer longitude = Integer.parseInt(st.nextToken().trim());
			
			Location lo = new Location(cityName, latitude, longitude);
			cityLo.put(cityName, lo);
		}
		
		System.out.println("----------------");
		for(String keyCity : cityLo.keySet()) {
			Location loca = cityLo.get(keyCity); // cityLo.get(keyCity)가 데이터 타입이 Location 이다.
			System.out.println(loca.toString());
		}
		while(true) {
		    System.out.print("도시 이름 >> ");
		    String searchCity = scan.nextLine().trim();

		    if(searchCity.equals("exit")) {
		        System.out.println("프로그램 종료");
		        break;
		    }

		    Location result = cityLo.get(searchCity);

		    if(result == null) {
		        System.out.println("해당 도시는 등록되어 있지 않습니다.");
		    } else {
		        System.out.println(result);   // toString 자동 호출
//		        Location 클래스에서 toString()을 오버라이딩 안 하면
//		        Object 클래스 기본 toString()이 호출됩니다.
		    }
		}
		scan.close();
	}

}
