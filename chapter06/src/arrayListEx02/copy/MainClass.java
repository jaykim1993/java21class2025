package arrayListEx02.copy;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		Student sName = new Student();
		Scanner scan = new Scanner(System.in);

		boolean run = true;
		System.out.println("[1] 전체 학생 성적");
		System.out.println("[2] 이름으로 검색");
		System.out.println("[3] 새 정보 입력");
		System.out.println("[4] 프로그램 종료");

		while(run) {
			System.out.println("-----------------");
			System.out.print("옵션 선택 : ");
			int select = scan.nextInt();
			if(select ==1) {
				System.out.println("[전체 학생 성적 보기]");
				System.out.println();
				if(list.isEmpty())System.out.println("입력된 학생 정보가 없습니다");
				for(int i = 0; i<list.size(); i++) {
					Student s = list.get(i);
					System.out.println("학생 이름 : "+ s.name);
					for(int j = 0 ; j<s.sublist.size() ; j++) {
						Subject sub = s.sublist.get(j);
						System.out.println("과목명 : "+ sub.sub + "점수 : " + sub.score +"점");
					}
					System.out.println();
				}
			}
			else if(select ==2) {
				System.out.println("[이름으로 검색]");
				System.out.println();
				System.out.print("이름 : ");
				String  searchName = scan.next();
				if(searchName.equals(sName.name))System.out.println("");
			}
			else if(select ==3) {
				System.out.println("[새 정보 입력]");
				System.out.println();
				System.out.print("이름 : ");
				sName.name = scan.next(); // Student 객체화 후 name 접근
				for(int i = 0; i<2; i++) {
					// Subject 인스턴스화 한다
					Subject subject = new Subject();
					System.out.print("과목 : ");
					subject.sub = scan.next();
					System.out.println("성적 : ");
					subject.score= scan.nextInt();
					// Student 클래스에 과목, 점수 추가한다.
					sName.sublist.add(subject);
				}
				// list에 학생 추가되어야 함
				list.add(sName);
				System.out.println("입력완료");
			}
			else if(select ==4) {
				System.out.println("프로그램이 종료");
				run = false;
			}
			else  {
				System.out.println("잘못된 입력입니다");
			}
		}
		

	}

}
