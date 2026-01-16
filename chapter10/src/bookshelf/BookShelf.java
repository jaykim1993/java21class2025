package bookshelf;


// Shelf가 Queue를 implements
// BookShelf가 Shelf extends 받을 예정
// 실무에서 많이 쓰이는 방식
public class BookShelf extends Shelf implements Queue {

	@Override
	public void inQueue(String title) {
		shelf.add(title); //ArrayList에서 add는 맨 뒤에서 부터 추가 된다
	}

	@Override
	public String deQueue() {
		return shelf.remove(0); // 제일 첫번째 자료를 삭제

	}

	@Override
	public int getSize() {
		return getCount();
	}



}
