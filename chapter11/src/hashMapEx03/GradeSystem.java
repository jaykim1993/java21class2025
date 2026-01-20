package hashMapEx03;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class GradeSystem {
	HashMap<String, Double> gradeMap = new HashMap<>();
	Scanner scan = new Scanner(System.in);
	

	GradeSystem() {

	}

	public void addStudent() {
		while(gradeMap.size()<5){
			System.out.print("이름과 학점 >>");
			String input = scan.nextLine();
			StringTokenizer st = new StringTokenizer(input);
			String name = st.nextToken();
			Double grade = Double.parseDouble(st.nextToken());
			if(grade>4.5) {
				System.out.println("학점은 최대 4.5입니다.");
				continue;
			}
		    gradeMap.put(name, grade);
		}

	}
	
	public void resultList() {
		System.out.print("장학생 선발 학생 기준 입력 >>");
		double cutline = scan.nextDouble();
		System.out.print("장학생 명단 : ");
		for(String s: gradeMap.keySet()) {
			if(gradeMap.get(s)>=cutline) {
				System.out.print(s + " ");
			}
		}
	}
}
