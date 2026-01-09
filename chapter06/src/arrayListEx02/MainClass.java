package arrayListEx02;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		ArrayList<Student>stu = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		Student st = new Student();
		Subject su = new Subject();
		
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
				
			}
			else if(select ==2) {
				System.out.println("[이름으로 검색]");
				System.out.println();
				System.out.print("이름 : ");
				String  searchName = scan.next();

			}
			else if(select ==3) {
				System.out.println("[새 정보 입력]");
				System.out.println();
				System.out.print("이름 : ");
				String  student = scan.next();
				st.addStudent(new Student(student));
				System.out.print("과목 A: ");
				String  subNameA= scan.next();
				System.out.println("성적 : ");
				int subScoreA = scan.nextInt();
				System.out.print("과목 B: ");
				String  subNameB= scan.next();
				System.out.println("성적 : ");
				int subScoreB = scan.nextInt();
				st.addSubject(new Subject(subNameA, subNameB, subScoreA, subScoreB));
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
