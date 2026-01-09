package arrayListTest;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrList01 {

	public static void main(String[] args) {
		// ArrayList<E> 참조변수 = new ArrayList<>();
		// <E> : 제네릭(Generic), 클래스(래퍼 클래스, 사용자 정의 클래스) 들어가야 함.
				//		래퍼 클래스(Wrapper Class) 는
				//		👉 기본형 데이터를 객체(클래스)로 감싸서 사용할 수 있게 만든 클래스
				//		사용자 정의 클래스 내 멤버 변수 데이터 타입 다양하게 선정 가능
		// ArrayList<>는 가변길이 클래스 배열
		// 데이터가 삭제되거나, 추가되면 자동으로 길이 변화
		//메서드 종류
			// 데이터 추가 : 배열명.add(idx, value) or add(value)
			// 데이터 삭제 : 배열명.remove(idx)
			// 데이터 추출 : 배열명.get(idx)
			// 길이 : 배열명.size()
			// 빈배열 판별 :배열명. isEmpty()
		
		ArrayList<String> list = new ArrayList<>();
//		if(list.isEmpty()) System.out.println("공백");
//		else System.out.println("삽입됨");
		
		
		// 데이터 추가하기
		list.add("사과");
		list.add("바나나");
		list.add(1,"오렌지");
		list.addFirst("딸기");
//		딸기 사과 오렌지 바나나
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("시금치");
		list2.add("콩나물");
		// list2의 요소를 전부 list로 추가하고 싶다면
		list.addAll(list2);
//		딸기 사과 오렌지 바나나 시금치 콩나물 
		
//		// 전체 출력
//		for(int i=0 ; i<list.size() ; i++) {
//			System.out.println(list.get(i));
//		}
//		for(int i=0 ; i<list2.size() ; i++) {
//			System.out.println(list2.get(i));
//		}

		// 데이터 삭제하기
		list.remove(4);
//		딸기 사과 오렌지 바나나 콩나물 
		
		// 확장 for문
			//		for(자료형 변수(작명) : 참조변수 ) {실행문}
			//		for(int value : arr01)syso(value + " " );
		for(String value : list)System.out.print(value + " ");
		System.out.println();
		System.out.println();
		System.out.println();
		
		ArrayList<Integer> num = new ArrayList<>();
		num.add(20);
		num.add(25);
		num.add(5);
		for(Integer number : num)System.out.print(number + " ");
		System.out.println();
		System.out.println();
		
		// 내가 만든 클래스 이용
		ArrayList<Member> meminfo = new ArrayList<>(); // Member Class를 생성해서 담을 부모
		// 
		meminfo.add(new Member("홍길동","서울시",20)); // Member 인스턴스화 하여 부모에 담기
		meminfo.add(new Member("개나리","부산시",17));
		for(Member value : meminfo)value.printMember(); // 데이터타입 : 클래스(Member)
		// 각각의 값(value) : 인스턴스 따라서, 인스턴스.메서드 호출이 가능하다!
	}

}
