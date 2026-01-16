package abstractTest;


public  class MyNoteBook extends NoteBook {

	@Override
	public void typing() {
		System.out.println("MyNoteBook typing()");
	}

}
// MyNoteBook에서 typing() 구현 완료 → 모든 추상 메서드 구현 완료

// 이제 일반 클래스가 됨 → 객체 생성 가능

// 모든 추상 메서드를 구현하지 않으면 객체 생성이 불가능