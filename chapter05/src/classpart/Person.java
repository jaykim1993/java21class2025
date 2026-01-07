package classpart;

import java.util.Scanner;

public class Person {
	
	String name;
	float height;
	float weight;
	
	// default 생성자
	// 생성하지 않으면 jvm이 자동으로 생성하나
	// 매개변수 생성자가 존재하면 자동으로 생성되지 않음을 주의
	public Person() {}
	
	// 이름 매개변수 생성자
	// this가 가리키는 곳은 클래스 내 멤버변수
	// = 이후 값은 매개변수
	public Person(String name) {
		this.name = name;
	}
	
	// 키, 몸무게 매개변수 생성자
	public Person(float height, float weight) {
		this.height= height;
		this.weight =weight;
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		person.name = scan.next();
		System.out.print("키 : ");
		person.height = scan.nextFloat();
		System.out.print("몸무게 : ");
		person.weight = scan.nextFloat();
		System.out.printf("이름 : %s%n키:  %f%n몸무게:  %f%n",person.name,person.height,person.weight);
		
		Person personName = new Person("홍길동");
		Person personInfo = new Person(178,100);
		
//		System.out.println(person);
		System.out.println(personName.name);
		System.out.println(personInfo.height);
		System.out.println(personInfo.weight);
		scan.close();
	}
}
