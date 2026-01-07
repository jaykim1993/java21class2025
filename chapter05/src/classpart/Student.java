package classpart;
// 'Student'라는 이름을 가진 클래스를 생성
public class Student {
	// 멤버 변수(member variable) = property, attribute, field
	// 단, 데이터 타입은 자료의 형태를 고려해 결정
	int studentid;
	String studentName;
	String address;
	int grade;
	
	public Student() {
	} // 디폴트 생성자, 없으면 자동으로 JVM이 만든다
	
	//메소드(method) = member function
	//접근제어자 반환의 유무 (void, 데이터 타입) 함수이름(){}
	// 반환할 값이 필요한 경우 반드시 return 반환값 필요
	public void showStudentInfo() {
		System.out.printf("%s의 주소는 %s이다.%n", studentName, address);
	}
	
	// main() 메소드 생성
 	public static void main(String[] args) {
 		// 인스턴스화(객체화)
		Student st01 = new Student(); // 인스턴스
		st01.studentName = "홍길동";
		st01.address = "서울";
		st01.showStudentInfo();
		
		
		Student st02 = new Student(); // 인스턴스
		st02.studentName = "개나리";
		st02.address = "경기도";
		st02.showStudentInfo();
		
		System.out.println(st01);
		System.out.println(st02);
	}
}
