package hashMapEx04;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CustomerPoint {
	HashMap<String, Integer> cusPoMap = new HashMap<String, Integer>();
	Scanner scan = new Scanner(System.in);
	
	
	public void run() {

	    while(true) {
	        System.out.print("이름과 포인트 입력>> ");
	        String input = scan.nextLine();
	        if(input.equals("그만")) break;

	        StringTokenizer st = new StringTokenizer(input, " ");
	        String name = st.nextToken().trim();
	        int point = Integer.parseInt(st.nextToken().trim());
	        
	        if(cusPoMap.containsKey(name)) {
	            point += cusPoMap.get(name);
	        }
	        cusPoMap.put(name, point);

	        for(String key : cusPoMap.keySet()) {
	        	int value = cusPoMap.get(key);
	            System.out.printf("(%s,%d) ", key, value);
	        }
	        System.out.println();
	    }

	    System.out.println("포인트 관리 종료");
	    
	}


}
