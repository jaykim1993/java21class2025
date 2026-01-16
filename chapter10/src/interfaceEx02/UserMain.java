package interfaceEx02;



public class UserMain {

	public static void main(String[] args) {
		
		Animal cat = new Cat();
		Animal chicken = new Chicken();
		Animal monkey = new Monkey();

		cat.eat("생선");
		chicken.eat("생선");
		monkey.eat("생선");
		System.out.println();
		cat.work("네발");
		chicken.work("네발 또는 두발");
		monkey.work("두발");
		System.out.println();
		cat.sleep("엎드려");
		chicken.sleep("누워");
		monkey.sleep("서");
		
	}

}
