package polymophism;

public class AnimalTest {

	public static void main(String[] args) {
		AnimalTest atest = new AnimalTest();
		// 현재 moveAnimal() 메서드는 매개변수로 Animal을 가짐
		// => Animal을 상속받은 자식 클래스를 생성할 수 있다.
		atest.moveAnimal(new Human());
		atest.moveAnimal(new Tiger());
		atest.moveAnimal(new Eagle());
		// 물론 부모도 가져올 수 있다.
		atest.moveAnimal(new Animal());

	}
	public void moveAnimal(Animal animal) {
		animal.move();
		 }
}
