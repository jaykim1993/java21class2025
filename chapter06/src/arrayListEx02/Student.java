package arrayListEx02;

import java.util.ArrayList;

public class Student {
	ArrayList<Subject>sub = new ArrayList<>();
	String studentName;


	
	// 생성자
	public Student() {}
	public Student(String studentName) {
		this.studentName = studentName;
	}
	
	
	// 새 학생 등록 : 이름
	public void addStudent(Student s) {

	}
	// 새 학생 등록 : 성적
	public void addSubject(Subject s) {
		sub.add(s);
	}
	
	
	// 입력받은 학생 정보 검색 + 뿌리기
	public void showSearch(String name) {

		
	}
}
