package inheritance04;

public class Main {

	public static void main(String[] args) {
		Customer c = new Customer("aaa","이성계");
		System.out.printf(
				"지불금액은 %s원이고, ", 
				c.calcPrice(10000)
				);
		c.showCustomerInfo();
		
		Customer vc = new VIPCustomer("bbb","김길동"); // 업캐스팅
		// 업캐스팅 (Upcasting) : 하위 클래스 객체는 상위 클래스 타입 변수로 참조할 수 있다. (다형성)
		// Parent p = new Child();   // 업캐스팅
		// 오버라이딩된 메서드는 자식 것이 실행됨
		// Customer vip = new VIPCustomer("ccc","아무개") 가능
		System.out.printf(
				"%n%n지불금액은 %s원이고, ", 
				vc.calcPrice(10000)
				);
		vc.showCustomerInfo();
	}

}
