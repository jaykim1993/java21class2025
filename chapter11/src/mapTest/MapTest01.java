package mapTest;

import java.util.*;

public class MapTest01 {

	public static void main(String[] args) {
		// Map<key, value> 인터페이스 : 자바의 collection 프레임워크 일종이다.
		// import 해야함
		// Map의 특징은 반드시 key, value의 쌍으로
		// key는 중복될 수 없다. value는 중복가능
		// key를 이용하여 value를 저장하거나, 검색, 삭제할 수 있다.
			// Map의 하위클래스 : HashMap, HashTable, TreeMap, Properties(HashTable의 하위)
			
		
		
		// Map<String, String> map = new Map<String, String>(); <- Map이 인터페이스라서 인스턴스화 불가
		// HashMap은 Map으로 업캐스팅 가능, 권장되는 방식
			// HashpMap 객체를 생성하고 데이터타입은 Map 인터페이스
			// Map 인터페이스의 모든 메소드를 접근할 수 있다.
		// K는 반드시 래퍼클래스(사용자 정의 클래스, String, Integer, Double..)
		Map<String, String> list = new HashMap<String, String>();

		
		String[] key = {"a", "b", "c", "d", "e"};
		String[] value = {"apple", "banana", "candy", "dog", "enum"};
		for(int i=0 ; i<key.length ; i++) {
			// Map 인터페이스 메소드
			// put(key, value) => key, value를 입력
			// HashMap은 해시테이블에 저장되며, 비선형자료구조이다.
			list.put(key[i], value[i]);
			
			
		}
		System.out.println(list);
		
		// keySet() : 모든 키를 Set 객체에 담아서 반환
		// values() : 모든 값을 Set 객체에 담아서 반환
		System.out.println(list.keySet());
		System.out.println(list.values());
		
		// get(key) 
		//주어진 키가 있는 값을 반환 => value 출력
		System.out.println(list.get("a"));
		
		// replace(key, value) : 해당 key 찾아 value 변경
		// => put이 이 기능을 포함한다.
		list.replace("a", "arial");
		System.out.println(list.get("a"));
		list.put("a", "ace");
		System.out.println(list.get("a"));
		
		// put으로 새로운 값 삽입
		list.put("f", "float");
		System.out.println(list);
		
		// containsKey(), containsValue() 
		// => 결과는 boolean 값으로 반환
		System.out.println(list.containsKey("a"));
		System.out.println(list.containsValue("arial"));
		
		// remove() => 키의 값 삭제
//		list.remove("a");
//		System.out.println(list);
//		// clear() => 모두 삭제
//		list.clear();
//		System.out.println(list); // => 빈값
		
		// 확장 for문 이용해서 출력하기
		System.out.println("\n-- 확장 For문 --");
		// key set 객체를 이용해서 출력해야 한다.
		for( String k : list.keySet()) {
			System.out.printf("%s : %s%n", k, list.get(k));
		}
		
		// Iterator() : 객체 순회 메서드
		// 번거로우니 확장 for문 쓰자.
		System.out.println("\n-- Iterator 메서드 --");
		Set<String> keyset = list.keySet();
		// keyset = [a, b, c, d, e]
		Iterator<String> ir = keyset.iterator();
		while(ir.hasNext()) {
			String k = ir.next();
			String v = list.get(k);
			System.out.println(k + " : " + v);
		}
		// 번거로우니 확장 for문 쓰자.
		
		
	}

}
