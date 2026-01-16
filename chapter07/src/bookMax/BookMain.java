package bookMax;

public class BookMain {

    public static void main(String[] args) {
        BookList bl = new BookList();
        bl.addList(new BookDTO("자바의 정석", "낭궁민", 30000));   // 리스트에 추가
        bl.addList(new BookDTO("파이썬 입문", "개나리", 28000));   // 리스트에 추가
        bl.addList(new BookDTO("클린 코드", "김길동", 45000));   // 리스트에 추가
        bl.addList(new BookDTO("정신 수양", "김판동", 15000));   // 리스트에 추가

        bl.printList();   // 출력
        bl.expensive();
    }
}