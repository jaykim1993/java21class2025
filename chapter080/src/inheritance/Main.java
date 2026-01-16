package inheritance;

public class Main {

	public static void main(String[] args) {
		ParentsClass pc = new ParentsClass();
		ChildClass cc = new ChildClass(1,2);
		System.out.println(cc.a);
//		System.out.println(pc.a);
		cc.childfun();
		cc.parentsfun(); // 자식의 매서드를 통해 변경된 부모 값을 출력할 수 있고 그 위치는 부모의 매서드와 다르다.
		pc.parentsfun();
		System.out.println(cc.a);

	}

}
