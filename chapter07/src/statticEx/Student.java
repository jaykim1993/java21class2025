package statticEx;

public class Student {
	// static은 데이터 메모리 영역에 존재하며
	// 서로 다른 인스턴스에 같은 값을 공유한다.
	// static 데이터 타입 변수이름 => 클래스변수라 칭한다.
	// 정적 이라는 의미
	static int serialNum = 1000;
	
	int studentId;
	String studentName;
	
	// default 생성자
	public Student() {
		serialNum++;
		studentId = serialNum;
	}
}
